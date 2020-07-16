package everest.container;

public class Caixa implements Transportavel
{
    private double base;
    private double altura;
    private double profundidade;
    private String descricao;
    private double preco;
    private double peso;

    public Caixa(double base, double altura, double profundidade)
    {
        this.base = base;
        this.altura = altura;
        this.profundidade = profundidade;
        this.descricao = "Caixa ["+base+";"+altura+";"+profundidade+"]";
        this.preco = 0;
        this.peso = 0;
    }

    public double getProfundidade()
    {
        return profundidade;
    }

    public void setProfundidade(double profundidade)
    {
        if (profundidade > 0)
        {
            this.profundidade = profundidade;
        }
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        if (base > 0)
        {
            this.base = base;
        }
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        if (altura > 0)
        {
            this.altura = altura;
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
        return this.base*this.altura*this.profundidade;
    }
    
    
}
