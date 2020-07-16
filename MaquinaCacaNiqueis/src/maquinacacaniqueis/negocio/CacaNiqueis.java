package maquinacacaniqueis.negocio;

import everest.geral.Reservatorio;

public class CacaNiqueis
{
    private Reservatorio caixa;
    private double premiacao;
    private int numerosJogadas;

    public CacaNiqueis()
    {
        this.caixa = new Reservatorio ((int) 10.000);
        this.premiacao = 150;
        this.numerosJogadas = 0;
    }
    
    public CacaNiqueis(double caixaTotal, double premios, int qtdJogadas )
    {    
        this.numerosJogadas = 0;
        this.premiacao = 150;
        this.caixa = new Reservatorio((int) 10.000);
        
        this.setInitValues((int) premios,caixaTotal,qtdJogadas);
    }
    
    public double getPremiacao()
    {
        return premiacao;
    }
    
    public Reservatorio getCaixa()
    {
        return caixa;
    }
    
    public int getNumeroJogadas()
    {
        return numerosJogadas;
    }
    
    public void abastecerMoedasCaixa()
    {
        if(caixa.getNivel() < 1.000)
        {
            caixa.completar();
        }
    }
    
    public void retirarMoedasCaixa()
    {
        if(caixa.getNivel() > 1.000)
        {
            caixa.zerarConteudo();
        }
    }
    
    public boolean jogar()
    {
        boolean ok = false;
        if(caixa.getNivel() > 1.000 && caixa.getNivel() < 10.000)
        {
            caixa.adicionar((int) 5.00);
            this.numerosJogadas++;
            ok = true;
        }
        return ok;
    }
    
    public boolean premiacao()
    {
        boolean ok = false;
        if(numerosJogadas % 100 == premiacao)
        {
            caixa.consumir(150);
            premiacao++;
            ok = true;
        }
        return true;
    }
    
    public boolean sangriaMaquina()
    {
        boolean ok = false;
        
        if(caixa.getNivel() > 9.995 || caixa.getNivel() == 10.000)
        {
            caixa.consumir((int) 5.000);
            ok = true;
        }
        return ok;
    }
    
     private void setInitValues(int caixaTotal, double premios,int qtdJogadas)
    {
        if (qtdJogadas > 0 && premios > 0)
        {
            this.numerosJogadas = qtdJogadas;
            this.premiacao = premios;
        }
        
        this.caixa.adicionar(caixaTotal);
    }
}