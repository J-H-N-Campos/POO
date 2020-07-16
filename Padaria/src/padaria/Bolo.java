package padaria;
public class Bolo implements FarinaceoFatiavel
{
    private String saborCobertura;
    private boolean temCobertura;
    private double peso;
    private double preco;
    private int comprimento;

    public Bolo(String saborCobertura, boolean temCobertura, double peso, double preco, int comprimento)
    {
        this.saborCobertura = saborCobertura;
        this.temCobertura = temCobertura;
        this.peso = peso;
        this.preco = preco;
        this.comprimento = comprimento;
    }

    public int getComprimento()
    {
        return comprimento;
    }

    public void setComprimento(int comprimento)
    {
        this.comprimento = comprimento;
    }

    public String getSaborCobertura()
    {
        return saborCobertura;
    }

    public void setSaborCobertura(String saborCobertura)
    {
        this.saborCobertura = saborCobertura;
    }

    public boolean isTemCobertura()
    {
        return temCobertura;
    }

    public void setTemCobertura(boolean temCobertura)
    {
        this.temCobertura = temCobertura;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    
    
}
