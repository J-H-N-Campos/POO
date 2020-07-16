package Pratica_08;

public class Museu
{
    private int nroTotalVisitantes;
    private int nroTotalVisitantesSaguao;
    private double valorCaixa;
    private double valorIngresso;
    private Galeria galeria1;
    private Galeria galeria2;

    public Museu(double valorIngresso)
    {
        this.nroTotalVisitantes = 0;
        this.nroTotalVisitantesSaguao = 0;
        this.valorCaixa = 0;
        this.valorIngresso = valorIngresso;
        this.galeria1 = new Galeria();
        this.galeria2 = new Galeria();
    }

    Museu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getValorCaixa()
    {
        return valorCaixa;
    }

    public double getValorIngresso()
    {
        return valorIngresso;
    }

    public int getNroTotalVisitantes()
    {
        return nroTotalVisitantes;
    }

    public int getNroVisistantesG2()
    {
        return galeria2.getNroVisistantes();
    }

    public int getNroVisistantesAgoraG2()
    {
        return galeria2.getNroVisistantesAgora();
    }

    public int getNroVisistantesG1()
    {
        return galeria1.getNroVisistantes();
    }

    public int getNroVisistantesAgoraG1()
    {
        return galeria1.getNroVisistantesAgora();
    }

    public int getNroTotalVisitantesSaguao()
    {
        return nroTotalVisitantesSaguao;
    }

    public void entrarMuseu()
    {
        this.nroTotalVisitantes ++;
        this.nroTotalVisitantesSaguao ++;
        this.valorCaixa += this.valorIngresso;
    }
    
    public boolean sairMuseu()
    {
        boolean ok = false;
        if (this.nroTotalVisitantesSaguao > 0)
        {
            this.nroTotalVisitantesSaguao --;
            ok = true;
        }
        return ok;
    }
    
    
    public boolean entrarGaleria1()
    {
        boolean ok = false;
        if (nroTotalVisitantesSaguao > 0 )
        {
            if (galeria1.entrar())
            {
                this.nroTotalVisitantesSaguao --;
                ok = true;
            }
        }
        return ok;
    }
    
    public boolean entrarGaleria2()
    {
        boolean ok = false;
        if (nroTotalVisitantesSaguao > 0 )
        {
            if (galeria2.entrar())
            {
                this.nroTotalVisitantesSaguao --;
                ok = true;
            }
        }
        return ok;
    }
    
    public boolean sairGaleria1()
    {
        boolean ok = false;
        if (galeria1.sair())
        {
            nroTotalVisitantesSaguao ++;
            ok = true;
        }
        return ok;
    }
    
    public boolean sairGaleria2()
    {
        boolean ok = false;
        if (galeria2.sair())
        {
            nroTotalVisitantesSaguao ++;
            ok = true;
        }
        return ok;
    }

    public void setValorIngresso(double valorIngresso)
    {
        if (valorIngresso > 0)
        {
            this.valorIngresso = valorIngresso;
        }
    }

    void numerosPessoas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void filaEspera() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void caixa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}