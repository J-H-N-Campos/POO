package Pratica_08;

public class MainMuseu
{
    public static void main(String[] args)
    {
        Museu m = new Museu(15.67);
        
        TelaMuseu t = new TelaMuseu(m);
        t.exibir();

        System.exit(0);
    }
}