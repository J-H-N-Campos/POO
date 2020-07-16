package frigorifico;

import frigorifico.apresentacao.TelaFrigorifico;
import frigorifico.negocio.Sadia;

public class Main
{
    public static void main(String[] args)
    {
        Sadia sd=new Sadia();
        
        TelaFrigorifico tela= new TelaFrigorifico(sd);
        tela.Exibir();
        System.exit(0);
    }
}