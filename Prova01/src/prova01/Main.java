package prova01;

import prova01.apresentacao.Tela;
import prova01.negocio.Lampada;

public class Main
{
    public static void main(String[] args)
    {
        Lampada l = new Lampada();
        
        Tela t = new Tela(l);
        t.exibir();
        
        System.exit(0);
    }
}
