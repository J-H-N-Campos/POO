package Pratica_08;

public class Galeria
{
    private int nroVisistantes;
    private int nroVisistantesAgora;

    public Galeria()
    {
        this.nroVisistantes = 0;
        this.nroVisistantesAgora = 0;
    }
    
    public int getNroVisistantes()
    {
        return nroVisistantes;
    }

    public int getNroVisistantesAgora()
    {
        return nroVisistantesAgora;
    }

    public boolean entrar()
    {
        boolean ok = false;
        if (this.nroVisistantesAgora < 50)
        {
            this.nroVisistantes ++;
            this.nroVisistantesAgora ++;
            ok = true;
        }
        return ok;
    }
    
    public boolean sair()
    {
        boolean ok = false;
        if (this.nroVisistantesAgora > 0)
        {
            this.nroVisistantesAgora --;
            ok = true;
        }
        return ok;
    }
    
}