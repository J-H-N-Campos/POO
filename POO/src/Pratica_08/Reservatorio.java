package Pratica_08;

public class Reservatorio
{
    int capacidade;
    int nivel;
    
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
    
    public int consultarNivel()
    {
        return nivel;
    }
}