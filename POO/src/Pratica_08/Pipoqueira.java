package Pratica_08;

public class Pipoqueira
{
    double valorVendido;
    double valorPipocaPequena;
    double valorPipocaGrande;
    Reservatorio depositoMilho;
    Reservatorio depositoAcucar;
    Reservatorio depositoSal;
    
    
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
        if (depositoMilho.consultarNivel() >= 30*multiplo &&
            depositoSal.consultarNivel() >= 5*multiplo)
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
        if (depositoMilho.consultarNivel() >= 30*multiplo &&
            depositoAcucar.consultarNivel() >= 20*multiplo)
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
    
}