package autenticador.exemplo;

public class Retangulo implements FormaGeometrica
{

    public void getBase()
    {
        System.out.println("estou chutando");
    }   
    
    @Override
    public double getArea()
    {
        return 50;
    }  
}