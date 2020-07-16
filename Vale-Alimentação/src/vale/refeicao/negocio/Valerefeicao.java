package vale.refeicao.negocio;

/* @author João de Campos */

public class Valerefeicao
{
    
    private int vs;
    private int vr;
    private int vg;
    private double caixa;
    private double preco = 1.00;

    public Valerefeicao()
    {
        this.vs = 0;
        this.vr = 0;
        this.vg = 0;
        this.caixa = 0.00;
        this.preco = 1.00;
    }
    
    public Valerefeicao(int valeSolicitacao, int valeRefeicao, int valeGeral, double saldoCaixa,
                      double valor)
    {    
        this.vs = valeSolicitacao;
        this.vr = valeRefeicao;
        this.vg = valeGeral;
        this.caixa = saldoCaixa;
        this.preco = valor;
        this.setInitValues(valeSolicitacao,valeRefeicao,valeGeral,saldoCaixa,valor);
    }

    public int getValeSolicitacao()
    {
        return vs;
    }
    
    public void getValeSolicitacaoZerado()
    {
        this.vs = 0;
    }
    
    public int getValeRefeicao()
    {
        return vr;
    }
    
    public void getValeRefeicaoZerado()
    { 
     this.vr = 0;
    }
    
    public int getQuantidadeValeGeral()
    {
        return vg;
    }
    
    public void getQuantidadeValeGeralZeradas()
    {
      this.vg = 0;  
    }
    
    public double getCaixa()
    {
        return caixa;
    }
    
    public void getZerarCaixa()
    {
        this.caixa = 0.00;
    }
    
    public double getPreco()
    {
        return preco;
    }
    
    public boolean setSomaValeSolicitacao()
    {
        boolean ok = false;
        
        if(vs >= 0)
        {
            vs++;
            vg++;
            caixa++;
            ok = true;
        }
        return ok;
    }
    
    public boolean setSomaValeAlmoco()
    {
        boolean ok = false;
        
        if(vr >= 0)
        {
            vr++;
            vg++;
            caixa++;
            ok = true;
        }
        return ok;
    }
    
    public boolean setCaixa()
    {
        boolean ok = false;
        
        if(caixa >= 0.00)
        {
            ok = true;
        }
        return ok;
    }
    
    public boolean setPreco()
    {
        boolean ok = false;
        
        if(preco > 0.00)
        {
            ok = true;
        }
        return ok;
    }
    
    private void setInitValues(int valeSolicitacao, int valeAlimentacao, int valeGeral, 
            double saldoCaixa, double valor)
    {
        if (saldoCaixa >= 0.00 && valor >= 0.00)
        {
            this.vr = valeAlimentacao;
            this.vs = valeSolicitacao;
            this.vg = valeGeral;
            this.caixa = saldoCaixa;
            this.preco = valor;
        }
    }
}