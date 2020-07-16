package batatasfritas;

import batatasfritas.apresentacao.Tela;
import batatasfritas.negocio.BatatasFritas;
import batatasfritas.persistencia.batatasFritasBD;

public class Main
{
    public static void main(String[] args)
    {
        batatasFritasBD x = new batatasFritasBD();
        BatatasFritas b = x.Ler();
        
        if (b== null)
        {
            b = new BatatasFritas();
        }
        
        Tela tela = new Tela(b);
        tela.setVisible(true);
    }
}