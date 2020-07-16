package padaria;

public class MaquinaFatiar
{
    private double pesoProduzido;
    private double espessuraFatia;

    public MaquinaFatiar(double espessuraFatia)
    {
        this.pesoProduzido = 0;
        this.espessuraFatia = espessuraFatia;
    }
    
    public MaquinaFatiar()
    {
        this.pesoProduzido = 0;
        this.espessuraFatia = 1.5;
    }

    public double getPesoProduzido()
    {
        return pesoProduzido;
    }

    public double getEspessuraFatia()
    {
        return espessuraFatia;
    }

    public void setEspessuraFatia(double espessuraFatia)
    {
        if (espessuraFatia > 0)
        {
            this.espessuraFatia = espessuraFatia;
        }
    }
    
    public int fatiar( FarinaceoFatiavel produto )
    {
        int nroFatias = (int)(produto.getComprimento() / this.espessuraFatia);
        pesoProduzido += produto.getPeso();
        return nroFatias;
    }
    
   
}
