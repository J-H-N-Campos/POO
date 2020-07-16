package Container.negocio;

import everest.container.Caixa;
import everest.container.Esfera;
import everest.container.TroncoCone;

public class Container
{
    private Caixa caixaQuadrada;
    private Esfera caixaEsferica;
    private TroncoCone caixaCone;
    private int qtdCargas;
    private int pesoTotal;
    private int volumeMaxContainer;
    private int somaPreco;

    public Container(Caixa caixaQuadrada, Esfera caixaEsferica, TroncoCone caixaCone, int qtdCargas,
            int pesoTotal, int volumeTotal, int somaPreco)
    {
        this.caixaQuadrada = caixaQuadrada;
        this.caixaEsferica = caixaEsferica;
        this.caixaCone = caixaCone;
        this.qtdCargas = 0;
        this.pesoTotal = 0;
        this.volumeMaxContainer = 5 ;
        this.somaPreco = 0; 
    }

    public Container(int qtdCargas, int pesoTotal, int volumeTotal, int somaPreco, double caixaQuadrada, double caixaCone, double caixaEsferica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setInitValues(Caixa caixaQuadrada, Esfera caixaEsferica, TroncoCone caixaCone,int qtdCargas,
            int pesoTotal, int volumeTotal, int somaPreco)
    {
       this.caixaQuadrada = caixaQuadrada;
       this.caixaEsferica = caixaEsferica;
       this.caixaCone = caixaCone;
       this.qtdCargas = 0;
       this.pesoTotal = 0;
       this.volumeMaxContainer = 5 ;
       this.somaPreco = somaPreco;
       this.setInitValues(caixaQuadrada,caixaEsferica,caixaCone,qtdCargas,volumeTotal,pesoTotal,somaPreco);
    }

    public Caixa getCaixaQuadradada()
    {
        return caixaQuadrada;
    }

    public Esfera getCaixaEsferica()
    {
        return caixaEsferica;
    }

    public TroncoCone getCaixaCone()
    {
        return caixaCone;
    }
    
    public int getQtdCargas()
    {
        return qtdCargas;
    }
    
    public int getPeso()
    {
        return pesoTotal;
    }
    
    public int getVolume()
    {
        return volumeMaxContainer;
    }
    
    public int getPrecos()
    {
        return somaPreco;
    }
    
    public void getDescricaoObjetos()
    {
        this.caixaCone.getDescricao();
        this.caixaEsferica.getDescricao();
        this.caixaQuadrada.getDescricao();
    }

    public boolean carregarObjetos()
    {
        boolean ok = false;
        {
            if(qtdCargas==0)
            {
                this.caixaCone = caixaCone;
                qtdCargas++;
                this.caixaEsferica = caixaEsferica;
                qtdCargas++;
                this.caixaQuadrada = caixaQuadrada;
                qtdCargas++;
                ok = true;
            }
            return ok;
        }
    }
    
    public boolean descarregarObjetos()
    {
        boolean ok =false;
        {
            if(qtdCargas>0)
            {
                this.caixaCone = caixaCone;
                qtdCargas--;
                this.caixaEsferica = caixaEsferica;
                qtdCargas--;
                this.caixaQuadrada = caixaQuadrada;
                qtdCargas--;
                ok = true;
            }
            return ok;
        }
    }
    
    public boolean setVolumeObjetos()
    {
        boolean ok = false;
        {
            if(caixaCone.getVolume()<=5 && caixaQuadrada.getVolume()<=5 && caixaEsferica.getVolume()<=5)
            {
                volumeMaxContainer++;
                ok = true;
            }
            return ok;
        }
    }
    
    public void setPrecoObjetos()
    {
        this.caixaQuadrada.getPreco();
        this.caixaEsferica.getPreco();
        this.caixaCone.getPreco();
        somaPreco++;
    }
    
    public void setPesoObjetos()
    {
        this.caixaCone.getPeso();
        this.caixaEsferica.getPeso();
        this.caixaQuadrada.getPeso();
        pesoTotal++;
    } 
}