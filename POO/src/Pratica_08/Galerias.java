package Pratica_08;

public class Galerias
{
    int qtdVisitantes;
    int visitantesTotais;
    int limite;
    double caixa;
    
    public void diminuirQtdVisitantes()
    {
        if (qtdVisitantes>limite)
        {
            qtdVisitantes--;
        }
    }
    public void aumentarQtdVisitantes()
    {
        if (qtdVisitantes<limite)
        {
            qtdVisitantes++;
        }
    }
    public int totalVisitantes()
    {
        return qtdVisitantes;
    }
    public void totalCaixa(double valor)
    {
        caixa=visitantesTotais+valor;
    }
}