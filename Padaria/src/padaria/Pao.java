package padaria;

public class Pao implements FarinaceoFatiavel
{
    private int tipo;
    private double preco;
    private int comprimento;
    private double peso;

    public Pao(int tipo, double preco, int comprimento, double peso)
    {
        this.tipo = tipo;
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

    public int getTipo()
    {
        return tipo;
    }

    public void setTipo(int tipo)
    {
        this.tipo = tipo;
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
