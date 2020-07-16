package autenticador.exemplo;

public class Main
{
    public static void main(String[] args)
    {
        Retangulo x = new Retangulo();
        x.getBase();
        x.getArea();
        
        FormaGeometrica y = new Retangulo();
        y.getArea();
        
        System.out.println( dobrarArea( x ) );        
    }
 
    public static double dobrarArea(FormaGeometrica f)
    {
        return 2*f.getArea();
    }
}