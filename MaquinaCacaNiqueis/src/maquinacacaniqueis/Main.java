package maquinacacaniqueis;

import maquinacacaniqueis.apresentacao.TelaPrincipal;
import maquinacacaniqueis.negocio.CacaNiqueis;
import maquinacacaniqueis.persistencia.CacaNiqueisBD;

public class Main
{

    public static void main(String[] args)
    {
        CacaNiqueisBD x = new CacaNiqueisBD();
        CacaNiqueis c = x.Ler();
        
        if (c == null)
        {
            c = new CacaNiqueis();
        }
        
        TelaPrincipal tela = new TelaPrincipal(c);
        tela.setVisible(true);
    }
}