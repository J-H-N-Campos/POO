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
public class Retangulo implements FormaGeometrica
{
    int base;
    int altura;

    @Override
    public void getArea()
    {
        //return base * altura;
    }

    @Override
    public int getPerimetro()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
