package sorveteira;

import sorveteira.apresentacao.Tela;
import sorveteira.negocio.Sorveteira;
import sorveteira.persistencia.SorveteiraBD;

public class Main
{
    public static void main(String[] args)
    {
        SorveteiraBD x = new SorveteiraBD();
        Sorveteira s = x.Ler();
        
        if (s == null)
        {
            s = new Sorveteira();
        }
        
        Tela tela = new Tela(s);
        tela.setVisible(true);
    }
}