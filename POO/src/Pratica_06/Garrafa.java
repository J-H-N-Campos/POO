package Pratica_06;

public class Garrafa
{
    int capacidade;
    char tipo;
    int nivelLiquido;
    boolean estaFechada;
    
    public void abrir()
    {
        estaFechada = false;
    }
    
    public void fechar()
    {
        estaFechada = true;
    }
    
    public void envasar()
    {
        if (!estaFechada)
        {
            nivelLiquido = capacidade;
            fechar();
        }
    }
    
    public boolean consumirConteudo(int mlitros)
    {
        boolean ok = false;
        if (!estaFechada && mlitros > 0)
        {
            nivelLiquido -= mlitros;
            if (nivelLiquido < 0)
            {
                nivelLiquido = 0;
            }
            ok = true;
        }
        return ok;
    }
    
    
}