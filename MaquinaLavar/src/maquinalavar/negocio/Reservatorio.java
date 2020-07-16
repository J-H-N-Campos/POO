package maquinalavar.negocio;

public class Reservatorio
{
    private int capacidade;
    private int nivel;

    public Reservatorio(int capacidade)
    {
        if (capacidade > 0)
        {
            this.capacidade = capacidade;
        }
        else
        {
            throw new RuntimeException("A capacidade precisa ser maior do que zero");
        }
        this.nivel = 0;
    }
    
    public boolean adicionar( int quant )
    {
        boolean ok = false;
        if (nivel+quant <= capacidade)
        {
            nivel += quant;
            ok = true;
        }
        return ok;
    }
    
    public void completar()
    {
        nivel = capacidade;
    }
    
    public boolean consumir( int quant )
    {
        boolean ok = false;
        if (nivel >= quant)
        {
            nivel -= quant;
            ok = true;
        }
        return ok;
    }
    
    public void zerarConteudo()
    {
        nivel = 0;
    }
    
    public int getNivel()
    {
        return nivel;
    }

    public int getCapacidade()
    {
        return capacidade;
    }
    
    
}
