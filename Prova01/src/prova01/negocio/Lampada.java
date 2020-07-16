package prova01.negocio;

import prova01.negocio.Cor;

public class Lampada
{
    private boolean ligada;
    private int intensidade;
    private Cor cor;

    public Lampada()
    {
        this.ligada = false;
        this.intensidade = 100;
        this.cor = new Cor();
    }

    public boolean isLigada()
    {
        return ligada;
    }

    public int getIntensidade()
    {
        return intensidade;
    }

    public String getCor()
    {
        return cor.getCorRGB();
    }

    public void ligar()
    {
        this.ligada = true;
    }

    public void desligar()
    {
        this.ligada = false;
    }
    
    public void aumentarIntensidade()
    {
        if (this.intensidade < 100 && this.isLigada())
        {
            this.intensidade ++;
        }
        else
        {
            throw new RuntimeException("Já está no máximo ou está desligada");
        }
    }
    
    public void reduzirIntensidade()
    {
        if (this.intensidade > 1 && this.isLigada())
        {
            this.intensidade --;
        }
        else
        {
            throw new RuntimeException("Já está no mínimo ou está desligada");
        }
    }

    public void setIntensidadeRGB(int intensidadeRed, int intensidadeGreen, int intensidadeBlue)
    {
        if (this.isLigada())
        {
            cor.setIntensidadeRGB(intensidadeRed, intensidadeGreen, intensidadeBlue);
        }
        else
        {
            throw new RuntimeException("A lâmpada esta desligada");
        }
    }

    public void setBranco()
    {
        if (this.isLigada())
        {
            cor.setBranco();
        }
        else
        {
            throw new RuntimeException("A lâmpada esta desligada");
        }
    }

    public void setVermelho()
    {
        if (this.isLigada())
        {
            cor.setVermelho();
        }
        else
        {
            throw new RuntimeException("A lâmpada esta desligada");
        }
    }

    public void setAzul()
    {
        if (this.isLigada())
        {
            cor.setAzul();
        }
        else
        {
            throw new RuntimeException("A lâmpada esta desligada");
        }
    }

    public void setVerde()
    {
        if (this.isLigada())
        {
            cor.setVerde();
        }
        else
        {
            throw new RuntimeException("A lâmpada esta desligada");
        }
    }

    
    
    
    
}
