package contacorrente.negocio;

import everest.geral.Data;

public class Movimento
{
    private Data data;
    private String descr;
    private double valor;
    private double saldoAposMovimento;

    public Movimento(String descr, double valor, double saldo)
    {
        String x = "........................................";
        this.data = new Data();
        this.descr = descr+x.substring(0, 40-descr.length());
        this.valor = valor;
        this.saldoAposMovimento = saldo;
    }
    
    public String getMovimentoFormatado()
    {
        return data.formatarData(Data.DDMMAAAA)+"\t"+descr+"\t"+valor+"\t"+saldoAposMovimento;
    }
}
