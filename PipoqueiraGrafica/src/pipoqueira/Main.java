package pipoqueira;


public class Main
{

    public static void main(String[] args)
    {
        Pipoqueira p = new Pipoqueira( 5.40, 7.60 );
        
        Tela tela = new Tela(p);
        tela.setVisible(true);
        
        
    }
    
}
