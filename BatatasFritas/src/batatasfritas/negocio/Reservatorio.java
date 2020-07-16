package batatasfritas.negocio;

public class Reservatorio
{
    private final int capacidade;
    private int nivel;

    public Reservatorio(int capacidade)
    {
        this.capacidade = capacidade;
        this.nivel = 0;
    }

    Reservatorio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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