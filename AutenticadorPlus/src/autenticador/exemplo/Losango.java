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
public class Losango implements FormaGeometrica
{
    private int dia1;
    private int dia2;

    public Losango(int dia1, int dia2)
    {
        this.dia1 = dia1;
        this.dia2 = dia2;
    }

    public int getDia1()
    {
        return dia1;
    }

    public void setDia1(int dia1)
    {
        this.dia1 = dia1;
    }

    public int getDia2()
    {
        return dia2;
    }

    public void setDia2(int dia2)
    {
        this.dia2 = dia2;
    }

    @Override
    public void getArea()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPerimetro()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
