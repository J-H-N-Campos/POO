package Pratica_06;

public class Botao {
    boolean estaPressionado;
    
    public void pressionar()
    {
        estaPressionado = true;
    }
    
    public void soltar()
    {
        estaPressionado = false;
    }
    
    public boolean estaPressionado()
    {
        return estaPressionado;
    }
}