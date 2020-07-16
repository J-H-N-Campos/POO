package pipoqueira;

import everest.geral.Reservatorio;

public class Pipoqueira
{
    private double valorVendido;
    private double valorPipocaPequena;
    private double valorPipocaGrande;
    private Reservatorio depositoMilho;
    private Reservatorio depositoAcucar;
    private Reservatorio depositoSal;

    public Pipoqueira( double valorPipocaPequena, double valorPipocaGrande )
    {
        this.valorVendido = 0;
        this.valorPipocaPequena = valorPipocaPequena;
        this.valorPipocaGrande = valorPipocaGrande;
        this.depositoMilho = new Reservatorio(5000);
        this.depositoAcucar = new Reservatorio(1500);
        this.depositoSal = new Reservatorio(500);
    }

    public double getValorVendido()
    {
        return valorVendido;
    }

    public double getValorPipocaPequena()
    {
        return valorPipocaPequena;
    }

    public double getValorPipocaGrande()
    {
        return valorPipocaGrande;
    }
    
    public double getNivelPipoca()
    {
        return depositoMilho.getNivel()/1000D;
    }

    public double getNivelAcucar()
    {
        return depositoAcucar.getNivel()/1000D;
    }

    public int getNivelSal()
    {
        return depositoSal.getNivel();
    }
        
    
    
    
    
    public boolean abastecerMilho(double quilos)
    {
        return depositoMilho.adicionar( (int)(quilos*1000) );
    }
    
    public boolean abastecerAcucar(int quilos)
    {
        return depositoAcucar.adicionar( (int)(quilos*1000) );
    }
    
    public boolean abastecerSal(int gramas)
    {
        return depositoSal.adicionar(gramas);
    }

    public void valorarPipocaPequena(double valor)
    {
        if (valor > 0)
        {
            valorPipocaPequena = valor;
        }
    }

    public void valorarPipocaGrande(double valor)
    {
        if (valor > 0)
        {
            valorPipocaGrande = valor;
        }
    }

    public double consultarValorVendido()
    {
        return valorVendido;
    }
    
    private boolean servirPipocaSalgada( int gramas, double valor )
    {
        double multiplo = gramas/100D;
        boolean ok = false;
        if (depositoMilho.getNivel() >= 30*multiplo &&
            depositoSal.getNivel() >= 5*multiplo)
        {
            valorVendido += valor;
            depositoSal.consumir( (int)(5*multiplo) );
            depositoMilho.consumir( (int)(30*multiplo) );
            ok = true;
        }
        return ok;
    }
    
    public boolean servirPipocaSalgadaPequena()
    {
        return servirPipocaSalgada(250, valorPipocaPequena );
    }
    
    public boolean servirPipocaSalgadaGrande()
    {
        return servirPipocaSalgada(550, valorPipocaGrande );
    }
   
    
    private boolean servirPipocaDoce( int gramas, double valor )
    {
        double multiplo = gramas/100D;
        boolean ok = false;
        if (depositoMilho.getNivel() >= 30*multiplo &&
            depositoAcucar.getNivel() >= 20*multiplo)
        {
            valorVendido += valor;
            depositoAcucar.consumir( (int)(20*multiplo) );
            depositoMilho.consumir( (int)(30*multiplo) );
            ok = true;
        }
        return ok;
    }
    
    public boolean servirPipocaDocePequena()
    {
        return servirPipocaDoce(250, valorPipocaPequena );
    }
    
    public boolean servirPipocaDoceGrande()
    {
        return servirPipocaDoce(550, valorPipocaGrande );
    }

    public void completarMilho()
    {
        depositoMilho.completar();
    }
    
    public void completarAcucar()
    {
        depositoAcucar.completar();
    }

    public void completarSal()
    {
        depositoSal.completar();
    }
    
    
    
}
