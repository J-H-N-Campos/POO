package maquinalavar.negocio;

public class Bosstemp
{
    private Reservatorio compartimentoRoupas;
    private Reservatorio compartimentoAmaciante;
    private Reservatorio compartimentoSabao;
    private boolean roupaLavada;

    public Bosstemp()
    {
        this.compartimentoRoupas = new Reservatorio(10000);
        this.compartimentoAmaciante = new Reservatorio(25);
        this.compartimentoSabao = new Reservatorio(50);
        this.roupaLavada = false;
    }

    public boolean isRoupaLavada()
    {
        return roupaLavada;
    }

    public int getNivelAmaciante()
    {
        return compartimentoAmaciante.getNivel();
    }

    public double getNivelRoupas()
    {
        return compartimentoRoupas.getNivel()/1000D;
    }

    public int getNivelSabao()
    {
        return compartimentoSabao.getNivel();
    }
    
    public boolean colocarRoupas( double kg )
    {
        boolean ok = false;
        if (!isRoupaLavada())
        {
            ok = compartimentoRoupas.adicionar( (int)(kg*1000) );
        }
        return ok;
    }
    
    public boolean colocarAmaciante( int ml )
    {
        return compartimentoAmaciante.adicionar(ml);
    }
    
    public boolean colocarSabao( int gramas )
    {
        return compartimentoSabao.adicionar(gramas);
    }
    
    public boolean lavar()
    {
        boolean ok = false;
        if (!isRoupaLavada() && compartimentoRoupas.getNivel() > 0)
        {
            roupaLavada = true;
            compartimentoAmaciante.zerarConteudo();
            compartimentoSabao.zerarConteudo();
            ok = true;
        }
        return ok;
    }
    
    public boolean retirarRoupas()
    {
        boolean ok = false;
        if (compartimentoRoupas.getNivel() > 0)
        {
            compartimentoRoupas.zerarConteudo();
            roupaLavada = false;
            ok = true;
        }
        return ok;
    }
    
}
