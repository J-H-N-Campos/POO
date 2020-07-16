
package Pratica_06;

public class Data {

    private int dia;
    private int mes;
    private int ano;
    
    public String obterExtensoMes()
    {
        String[] extMes = { "janeiro","fevereiro","março","abril",
        "maio", "junho","julho","agosto","setembro","outubro","novembro",
        "dezembro" };
        
        String extenso = "";
        if (estaCorreto(dia,mes,ano))
        {
            extenso = extMes[ mes - 1 ];
        }
        return extenso;
    }

    public String formatarData(int formato)
    {

        String dataFormatada = (dia < 10 ? "0"+dia : ""+dia )+"/"+
                               (mes < 10 ? "0"+mes : ""+mes)+"/"+ano;
        
        
        return dataFormatada;
    }
    
    public String getDiaDaSemana() 
    {        
        int dsemana = getDiaDoSeculo() % 7;
        String[] diadasemana =
        {
            "Domingo", "Segunda", "Terça", "Quarta", "Quinta", 
            "Sexta", "Sabado"
        };
        return (diadasemana[dsemana]);
    }
    
    public void avancarUmDia() 
    {
        dia++;
        if (!estaCorreto(dia, mes, ano))
        {
            dia = 1;
            mes++;        
            if (!estaCorreto(dia, mes, ano))
            {
                mes = 1;
                ano++;
            }
        }
    }

    public void retrocederUmDia() 
    {
        int[] udm =
        {
            31, 28, 31, 30, 31,
            30, 31, 31, 30, 31, 30, 31
        };
        if (bissexto())
        {
            udm[1] = 29;
        }
        dia--;
        if (!estaCorreto(dia, mes, ano))
        {
            dia = 1;
            mes--;
            if (!estaCorreto(dia, mes, ano))
            {
                mes = 12;
                ano --;
            }    
            dia = udm[mes - 1];
        }
    }
    
    public boolean bissexto()
    {
        return ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0));
    }
    

    public boolean estaCorreto(int d, int m, int a)
    {
        boolean ok = false;
        
        int[] udm = {31,28,31,30,31,30,31,31,30,31,30,31};
        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
        {
            udm[1] = 29;
        }
                
        if (a > 1582)
        {
            if (m >= 1 && m <= 12)
            {
                if (d >= 1 && d <= udm[m-1] )
                {
                    ok = true;
                }
            }
        }
        return ok;
    }
    
    public int getDiaDoSeculo()
    {
        int diaDoSeculo = (ano - 1901) * 365 + (ano - 1901) / 4 + dia + (mes - 1)
                * 31 - ((mes * 4 + 23) / 10)
                * ((mes + 12) / 15) + ((4 - ano % 4) / 4)
                * ((mes + 12) / 15);
        return diaDoSeculo;
    }
}