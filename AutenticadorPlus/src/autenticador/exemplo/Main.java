/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticador.exemplo;

/**
 *
 * @author mouriac
 */
public class Main
{
    public static void main(String[] args)
    {
        Retangulo r = new Retangulo();
        int i = 90;
        Triangulo t = new Triangulo();
        Losango l = new Losango(3,3);

        FormaGeometrica a = new Losango(3,3);
        a.getArea();
        a.getPerimetro();
        
        
        
    }
}
