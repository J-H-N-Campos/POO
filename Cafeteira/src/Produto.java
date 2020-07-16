public class Produto
{
    private int código;
    private String descrição;
    private double quantidade;
    private String unidadeMedida;
    private double preçoCusto;
    private double preçoVenda;

    public Produto(int código, String descrição) 
    {
        this.código = código;
        this.descrição = descrição;
        this.quantidade = 0;
        this.unidadeMedida = "PC";
        this.preçoCusto = 0;
        this.preçoVenda = 0;
    }

    public int getCódigo()
    {
        return código;
    }

    public void setCódigo(int código)
    {
        if (código > 0)
        {
            this.código = código;
        }
    }

    public String getDescrição()
    {
        return descrição;
    }

    public void setDescrição(String descrição)
    {
        if (!descrição.isEmpty())
        {
            this.descrição = descrição;
        }
    }

    public double getQuantidade()
    {
        return quantidade;
    }

    public void setQuantidade(double quantidade)
    {
        if (quantidade >= 0)
        {
            this.quantidade = quantidade;
        }
    }
    
    public void baixarEstoque(double vendida)
    {
        if (vendida > 0)
        {
            this.quantidade -= vendida;
        }
    }
    
    public void adicionarEstoque(double comprada)
    {
        if (comprada > 0)
        {
            this.quantidade += comprada;
        }
    }

    public String getUnidadeMedida()
    {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida)
    {
        String[] un = { "PC", "MT", "GL", "KG", "ML", "GR", "M2", "M3" };
        
        boolean achei = false;
        
        for (String unidade: un)
        {
            if (unidadeMedida.equalsIgnoreCase(unidade))
            {
                achei = true;
            }
        }
        if (achei)
        {
            this.unidadeMedida = unidadeMedida.toUpperCase();
        }
    }

    public double getPreçoCusto()
    {
        return preçoCusto;
    }

    public void setPreçoCusto(double preçoCusto)
    {
        if (preçoCusto >= 0 && preçoCusto <= preçoVenda)
        {
            this.preçoCusto = preçoCusto;
        }
    }

    public double getPreçoVenda()
    {
        return preçoVenda;
    }

    public void setPreçoVenda(double preçoVenda)
    {
        if (preçoVenda >= 0 && preçoVenda >= preçoCusto)
        {
            this.preçoVenda = preçoVenda;
        }
    }
    
    
}
