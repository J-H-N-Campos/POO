/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package money.negocio;

/**
 *
 * @author mouriac
 */
public class MaquinaCacaNiqueis
{
    private double saldoCaixa;
    private int contadorApostas;
    private double premiosDistribuidos;

    public MaquinaCacaNiqueis()
    {
        this.saldoCaixa = 0;
        this.contadorApostas = 0;
        this.premiosDistribuidos = 0;
    }

    public MaquinaCacaNiqueis(double saldoCaixa, int contadorJogadas, double premiosDistribuidos)
    {
        this.saldoCaixa = saldoCaixa;
        this.contadorApostas = contadorJogadas;
        this.premiosDistribuidos = premiosDistribuidos;
    }

    public double getSaldoCaixa()
    {
        return saldoCaixa;
    }

    public int getContadorApostas()
    {
        return contadorApostas;
    }

    public double getPremiosDistribuidos()
    {
        return premiosDistribuidos;
    }

    public double getLucro()
    {
        return this.contadorApostas * 5 - this.premiosDistribuidos;
    }
    
    public double apostar()
    {
        double valorPremio = 0;
        if (this.saldoCaixa >= 1000 && this.saldoCaixa < 10000)
        {
            this.saldoCaixa += 5;
            this.contadorApostas ++;
            boolean premiar = (Math.random() * 100) >= 99;
            if (premiar && this.saldoCaixa >= 1000)
            {
                valorPremio = (int)(Math.random() * 101)+100;
                this.saldoCaixa -= valorPremio;
                this.premiosDistribuidos += valorPremio;
            }
        }
        return valorPremio;
    }
    
    public boolean sangria()
    {
        boolean ok = false;
        if (this.saldoCaixa >= 1000)
        {
            this.saldoCaixa -= 1000;
            ok = true;
        }
        return ok;
    }
    
    public void sangriaTotal()
    {
        this.saldoCaixa = 0;
    }
    
    public void abastecer()
    {
        if (this.saldoCaixa <= 9000)
        {
            this.saldoCaixa += 1000;
        }
    }
}
