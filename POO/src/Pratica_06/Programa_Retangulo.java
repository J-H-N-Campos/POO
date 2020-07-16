package Pratica_06;

import Geral.Entrada;

class Programa_Retangulo
{
    public static void main(String[] args)
    {
        double bas = Entrada.leiaDouble();
        double alt = Entrada.leiaDouble();
        
        Retangulo r = new Retangulo();
        r.base = bas;
        r.altura = alt;
        
        double p = r.calcularPerimetro();
        
        System.out.println(p);
    }
}