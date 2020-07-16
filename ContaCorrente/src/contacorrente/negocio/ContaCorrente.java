package contacorrente.negocio;

import everest.geral.Data;
import java.util.ArrayList;

public class ContaCorrente
{
    private int numero;
    private Correntista correntista;
    private double saldo;
    private double limiteCredito;
    private Data dataUltimoMovimento;
    private ArrayList<Movimento> movimentos;

    public ContaCorrente(int numero, Correntista correntista, double limiteCredito)
    {
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = 0;
        this.limiteCredito = limiteCredito;
        this.dataUltimoMovimento = new Data();
        this.movimentos = new ArrayList();
    }

    public int getNumero()
    {
        return numero;
    }

    public Correntista getCorrentista()
    {
        return correntista;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public double getLimiteCredito()
    {
        return limiteCredito;
    }

    public Data getDataUltimoMovimento()
    {
        return dataUltimoMovimento;
    }

    public void setLimiteCredito(double limiteCredito)
    {
        if (limiteCredito > 0)
        {
            this.limiteCredito = limiteCredito;
        }
    }
    
    public boolean depositar( double valor )
    {
        return depositar(valor,"Depósito");
    }
    
    private boolean depositar( double valor, String descr )
    {   
        boolean ok = false;
        if (valor > 0)
        {
            this.saldo += valor;
            this.dataUltimoMovimento.setDataComoHoje();
            
            this.registrarMovimento(descr, valor, saldo);
            ok = true;
        }
        return ok;
    }
    
    public boolean sacar( double valor )
    {
        return sacar(valor,"Saque");
    }

    private boolean sacar( double valor, String descr )
    {
        boolean ok = false;
        if (valor > 0)
        {
            if (saldo + limiteCredito >= valor)
            {
                this.saldo -= valor;
                this.dataUltimoMovimento.setDataComoHoje();
                this.registrarMovimento(descr, valor, saldo);
                ok = true;
            }
        }
        return ok;
    }
    
    public boolean descontarCheque( double valor, int nroCheque )
    {
        boolean ok = false;
        if (nroCheque > 0 && nroCheque <= 999999)
        {
            ok = this.sacar( valor, "Cheque descontado" );
        }
        return ok;
    }
    
    public boolean transferir( double valor, ContaCorrente destino )
    {
        boolean ok = false;
        if (this.sacar( valor,"Tranferido para "+destino.correntista.getNome() ))
        {
            destino.depositar(valor,"Transferência recebida");
            ok = true;
        }
        return ok;
    }
    
    
    public boolean pagarBoleto( double valor, Data dataVencimento )
    {
        Data hoje = new Data();

        // calcular juro simples 2% a.m.
        int diasAtraso = Math.max(0, hoje.compareTo(dataVencimento) );
        double juros = ((valor * 0.02)/30)*diasAtraso;
        
        return sacar( valor+juros, "Pgto boleto" );
    }
    
    public String getExtrato()
    {
        String extrato = "";
        for (int i = 0; i < movimentos.size(); i++)
        {
            extrato += movimentos.get(i).getMovimentoFormatado()+"\n";
        }
        return extrato;
    }
    
    
    
    private void registrarMovimento(String descr, double valor, double saldoAposMovimento )
    {
        Movimento m = new Movimento(descr, valor, saldoAposMovimento);
        
        movimentos.add(m);
    }
    
}
