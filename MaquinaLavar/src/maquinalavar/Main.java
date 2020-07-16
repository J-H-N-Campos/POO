package maquinalavar;

import maquinalavar.apresentacao.TelaGrafica;
import maquinalavar.negocio.Bosstemp;
import maquinalavar.persistencia.BosstempBD;

public class Main
{
    public static void main(String[] args)
    {
        BosstempBD x = new BosstempBD();
        Bosstemp s = x.ler();
        
        if (s == null)
        {
            s = new Bosstemp();
        }
        
        TelaGrafica tela = new TelaGrafica(s);
        tela.setVisible(true);
    }
}