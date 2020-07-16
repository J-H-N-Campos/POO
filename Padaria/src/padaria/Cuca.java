package padaria;

public class Cuca implements FarinaceoFatiavel
{
    private double peso;
    private int comprimento;
    private String recheio;

    public Cuca(double peso, int comprimento, String recheio)
    {
        this.peso = peso;
        this.comprimento = comprimento;
        this.recheio = recheio;
    }

    public String getRecheio()
    {
        return recheio;
    }

    public void setRecheio(String recheio)
    {
        this.recheio = recheio;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public int getComprimento()
    {
        return comprimento;
    }

    public void setComprimento(int comprimento)
    {
        this.comprimento = comprimento;
    }
    
    
    
}
