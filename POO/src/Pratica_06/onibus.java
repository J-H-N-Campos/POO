package Pratica_06;

public class onibus
{
    public class Onibus
{
    int numeroPassageirosTransportados;
    int numeroPassageirosEmbarcados;
    int capacidadePassageiros;
    double saldoCaixa;

    public Onibus(int numeroPoltronas)
    {
        this.numeroPassageirosTransportados = 0;
        this.numeroPassageirosEmbarcados = 0;
        this.capacidadePassageiros = numeroPoltronas;
    }
    
    public boolean embarcarPassageiro()
    {
        boolean ok = false;
        if (numeroPassageirosEmbarcados < capacidadePassageiros)
        {
            numeroPassageirosTransportados ++;
            numeroPassageirosEmbarcados ++;
            ok = true;
        }
        return ok;
    }
    
    public boolean desembarcarPassageiro()
    {
        boolean ok = false;
        if (numeroPassageirosEmbarcados > 0)
        {
            numeroPassageirosEmbarcados --;
            ok = true;
        }
        return ok;
    }
    
    public void reinicializar()
    {
        numeroPassageirosTransportados = 0;
    }

    public int getNumeroPassageirosTransportados()
    {
        return numeroPassageirosTransportados;
    }

    public int getNumeroPassageirosEmbarcados()
    {
        return numeroPassageirosEmbarcados;
    }

    public int getNumeroPoltronas()
    {
        return capacidadePassageiros;
    }

    public void setNumeroPoltronas(int numeroPoltronas)
    {
        if (numeroPoltronas >= 0 && 
                numeroPoltronas >= this.numeroPassageirosEmbarcados)
        {
            this.capacidadePassageiros = numeroPoltronas;
        }
    }
    }
}