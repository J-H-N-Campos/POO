package Pratica_06;

public class Arma {
    
    double calibre;
    int modeloArma;
    int qtdArmas;
    int capacidade;
    int qtdBalasAtual;
    double potencia;
    double cadencia;
    
    public boolean modeloCalibre(double calibre)
    {
        boolean ok=false;
        if ((calibre>0.0) && (calibre<=999.00))
                {
                    ok=true;
                }
        return ok;
    }
    public boolean quantidadeArmas(int qtdArmas)
    {
        boolean ok=false;
        
        if ((qtdArmas<=100) && (qtdArmas>0))
        {
            ok=true;
        }
        return ok;
    }
    public boolean modeloArma(int modeloArmaExistente)
    {
        boolean ok=false;
        if ((modeloArmaExistente<=100) && (modeloArmaExistente>0))
        {
            modeloArma=modeloArmaExistente;
            ok=true;
        }
        return ok;
    }
    public void diminuirCapacidade()
    {
        if ((capacidade==1000) && (capacidade>0))
        {
            qtdBalasAtual--;
        }
    }
    public void aumentarCapacidade()
    {
        if (capacidade==0)
        {
            qtdBalasAtual++;
        }
    }
    public void aumentarPotencia()
    {
        if (potencia==0.0)
        {
            potencia++;
        }
    }
    public void diminuirPotencia()
    {
        if ((potencia>0.0)&& (potencia<9999.00))
        {
            potencia--;
        }
    }
    public void aumentarCadencia()
    {
        if (cadencia==0.0)
        {
            cadencia++;
        }
    }
    public void diminuirCadencia()
    {
        if ((cadencia>0.0) && (cadencia==100))
        {
            cadencia--;
        }
    }
}