package prova01.negocio;

public class Cor
{
    private int intensidadeCorPrimariaRed;
    private int intensidadeCorPrimariaGreen;
    private int intensidadeCorPrimariaBlue;

    public Cor()
    {
        setBranco();
    }

    public Cor(int intensidadeRed, int intensidadeGreen, int intensidadeBlue)
    {
        setBranco();
        setIntensidadeRGB( intensidadeRed, intensidadeGreen, intensidadeBlue );
    }

    public int getIntensidadeCorPrimariaRed()
    {
        return intensidadeCorPrimariaRed;
    }

    public int getIntensidadeCorPrimariaGreen()
    {
        return intensidadeCorPrimariaGreen;
    }

    public int getIntensidadeCorPrimariaBlue()
    {
        return intensidadeCorPrimariaBlue;
    }

    public void setIntensidadeCorPrimariaRed(int intensidadeRed)
    {
        if (intensidadeRed >=0 && intensidadeRed <=255)
        {
            this.intensidadeCorPrimariaRed = intensidadeRed;
        }
    }

    public void setIntensidadeCorPrimariaGreen(int intensidadeGreen)
    {
        if (intensidadeGreen >= 0 && intensidadeGreen <= 255)
        {
            this.intensidadeCorPrimariaGreen = intensidadeGreen;
        }
    }

    public void setIntensidadeCorPrimariaBlue(int intensidadeBlue)
    {
        if (intensidadeBlue >=0 && intensidadeBlue <= 255)
        {
            this.intensidadeCorPrimariaBlue = intensidadeBlue;
        }
    }
    
    public void setIntensidadeRGB( int intensidadeRed, int intensidadeGreen, int intensidadeBlue )
    {
        this.setIntensidadeCorPrimariaRed(intensidadeRed);
        this.setIntensidadeCorPrimariaGreen(intensidadeGreen);
        this.setIntensidadeCorPrimariaBlue(intensidadeBlue);
    }
    
    public void setBranco()
    {
        this.intensidadeCorPrimariaRed = 255;
        this.intensidadeCorPrimariaGreen = 255;
        this.intensidadeCorPrimariaBlue = 255;
    }
    
    public void setPreto()
    {
        this.intensidadeCorPrimariaRed = 0;
        this.intensidadeCorPrimariaGreen = 0;
        this.intensidadeCorPrimariaBlue = 0;
    }
    
    public void setVermelho()
    {
        this.intensidadeCorPrimariaRed = 255;
        this.intensidadeCorPrimariaGreen = 0;
        this.intensidadeCorPrimariaBlue = 0;
    }
    
    public void setAzul()
    {
        this.intensidadeCorPrimariaRed = 0;
        this.intensidadeCorPrimariaGreen = 0;
        this.intensidadeCorPrimariaBlue = 255;
    }
    
    public void setVerde()
    {
        this.intensidadeCorPrimariaRed = 0;
        this.intensidadeCorPrimariaGreen = 255;
        this.intensidadeCorPrimariaBlue = 0;
    }
    
    public String getCorRGB()
    {
        return "RGB ["+this.intensidadeCorPrimariaRed+";"+
                this.intensidadeCorPrimariaGreen+";"+
                this.intensidadeCorPrimariaBlue+"]";
    }
    
}
