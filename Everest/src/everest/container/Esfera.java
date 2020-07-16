package everest.container;

public class Esfera implements Transportavel
{
    private double raio;
    private String descricao;
    private double preco;
    private double peso;    

    public Esfera(double raio)
    {
        this.raio = raio;
        this.descricao = "Esfera ["+raio+"]";
        this.preco = 0;
        this.peso = 0;
    }

    public double getRaio()
    {
        return raio;
    }

    public void setRaio(double raio)
    {
        if (raio > 0)
        {
            this.raio = raio;
        }
    }
    
    public void setDescricao(String descricao)
    {
        if (!descricao.isEmpty())
        {
            this.descricao = descricao;
        }
    }

    public void setPreco(double preco)
    {
        if (preco >= 0)
        {
            this.preco = preco;
        }
    }

    public void setPeso(double peso)
    {
        if (peso > 0)
        {
            this.peso = peso;
        }
    }
   
    public String getDescricao()
    {
        return descricao;
    }

    public double getPreco()
    {
        return preco;
    }

    public double getPeso()
    {
        return peso;
    }

    public double getVolume()
    {
        return (4 * Math.PI * Math.pow(raio, 3))/3;
    }
}
