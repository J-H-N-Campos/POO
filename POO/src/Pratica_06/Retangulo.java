package Pratica_06;

public class Retangulo
{
    double base;
    double altura;
    
    public double calcularPerimetro()
    {
        double p = base*2+altura*2;
        return p;
    }
    
    public double calcularArea()
    {
        double ar = base * altura;
        return ar;
    }
    
    public void aumentarTamanho( double b, double a)
    {
        base += b;
        altura += a;
    }
    
}