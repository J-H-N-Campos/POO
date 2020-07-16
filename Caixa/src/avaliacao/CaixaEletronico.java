package avaliacao;

public class CaixaEletronico
{

    private int notas20;
    private int notas50;
    private int notas100;

    public CaixaEletronico()
    {
        this.notas20 = 0;
        this.notas50 = 0;
        this.notas100 = 0;
    }

    public int getNotas20()
    {
        return notas20;
    }

    public int getNotas50()
    {
        return notas50;
    }

    public int getNotas100()
    {
        return notas100;
    }

    public void reabastecer()
    {
        this.notas20 = 1000;
        this.notas50 = 1000;
        this.notas100 = 1000;
    }

    public boolean sacar(int valor)
    {
        boolean ok = false;
        if (notas20 > 0 || notas50 > 0 || notas100 > 0)
        {
            if (isValorValido(valor))
            {
                int[] quant = notas(valor);
                if (quant != null)
                {
                    this.notas20 -= quant[0];
                    this.notas50 -= quant[1];
                    this.notas100 -= quant[2];
                    ok = true;
                }
            }
        }
        return ok;
    }

    private int[] notas(int valor)
    {
        int[] quant = null;
        
        int n20 = 0, n50 = 0, n100 = 0;
        int div = this.notas20 > 0 ? 20 : 0;
        div += this.notas50 > 0 ? 50 : 0;
        div += this.notas100 > 0 ? 100 : 0;

        if (valor < div)
        {
            div = this.notas20 > 0 ? 20 : 0;
            div += this.notas50 > 0 ? 50 : 0;
        }
        if (valor < div)
        {
            div = this.notas20 > 0 ? 20 : 0;
        }
        
        n20 = consumir20(valor, div);
        int saldo = valor - n20 * 20;
        
        // consumidas as notas disponíveis o restante deve ser múltiplo de 50
        if (saldo % 50 == 0)
        {
            div = this.notas100 > 0 ? 150 : 50;
            if (div > saldo)
            {
                div = 50;
            }
            
            n50 = consumir50(saldo, div);
        }
        
        // consumidas as notas disponíveis o restante deve ser múltiplo de 100
        saldo = saldo - n50 * 50;
        if (saldo % 100 == 0)
        {
            int n = saldo / 100;
            n100 = Math.min(this.notas100, n);
        }
        saldo = saldo - n100 * 100;
        
        if (saldo > 0) // caso do valor 80
        {
            n20 = consumir20(saldo, 20);
            saldo = saldo - n20 * 20;
        }
        if (saldo > 0) // caso do valor 130
        {
            n50 = consumir50(saldo, 50);
            saldo = saldo - n50 * 50;
        }
        
        if (valor == n20 * 20 + n50 * 50 + n100 * 100)
        {
            int[] q = { n20, n50, n100 };
            quant = q;
        }

        return quant;
    }

    private int consumir20(int valor, int div)
    {
        int n = valor / div;
        int n20 = Math.min(n, this.notas20);
        int resto = valor - n20 * 20;
        while (resto % 50 != 0 && n20 > 0)
        {
            n20--;
            resto = valor - n20 * 20;
        }
        return n20;
    }

    private int consumir50(int valor, int div)
    {
        int n = valor / div;
        int n50 = Math.min(n, this.notas50);
        int resto = valor - n50 * 50;
        while (resto % 100 != 0 && n50 > 0)
        {
            n50--;
            resto = valor - n50 * 50;
        }
        return n50;
    }

//    private int[] notas(int valor)
//    {   
//        double fator = 0.7;
//        int n100=0,n50=0,n20=0;
//        int resto = valor;
//        n100 = Math.min((int)((resto * 0.8) / 100),this.notas100);       
//        while (resto > 0)
//        {
//            resto = valor - (n100 * 100);
//            n50 = Math.min((int)((resto * fator) / 50),this.notas50);
//            resto -= n50 * 50;
//            n20 = (int)(resto / 20);
//            resto -= n20 * 20;
//            fator = Math.min(1, fator + 0.05);
//        }    
//   
//        int v[] = {n20, n50, n100};
//        return v;
//    }
    private boolean isValorValido(int valor)
    {
        boolean ok = false;
        if (notas20 > 0 && notas50 > 0 && notas100 > 0)
        {
            ok = (valor < 50 && valor % 20 == 0) || (valor >= 50 && valor % 10 == 0);
        } else if (notas20 == 0 && notas50 > 0 && notas100 > 0)
        {
            ok = (valor % 50 == 0);
        } else if (notas20 == 0 && notas50 == 0 && notas100 > 0)
        {
            ok = (valor % 100 == 0);
        }
        else if (notas20 == 0 && notas50 > 0 && notas100 == 0)
        {
            ok = (valor % 50 == 0);
        }
        return ok;
    }
}
