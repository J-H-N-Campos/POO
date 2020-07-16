package padaria;

public class Rocambole implements FarinaceoFatiavel
{
    private String sabor;
    private double preco;
    private int comprimento;
    private double peso;
    private String recheio;

    public Rocambole(String sabor, double preco, int comprimento, double peso)
    {
        this.sabor = sabor;
        this.preco = preco;
        this.comprimento = comprimento;
        this.peso = peso;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public String getSabor()
    {
        return sabor;
    }

    public void setSabor(String sabor)
    {
        this.sabor = sabor;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
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
