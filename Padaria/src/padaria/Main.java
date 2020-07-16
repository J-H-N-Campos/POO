package padaria;

public class Main
{
    public static void main(String[] args)
    {
        Bolo b1 = new Bolo("Choco", true, 1.5, 20.0, 50);
        
        Pao p1 = new Pao(1, 4.6, 30, 0.400);
        Pao p2 = new Pao(1, 4.6, 30, 0.430);
        Pao p3 = new Pao(1, 4.6, 40, 0.430);
        Pao p4 = new Pao(1, 4.6, 30, 0.399);
        
        MaquinaFatiar mf = new MaquinaFatiar();
        
        mf.fatiar(b1);
        mf.fatiar(p2);
        mf.fatiar(p3);
        int f = mf.fatiar( p4 );
        System.out.println(f);
        
        System.out.println( mf.getPesoProduzido() );
    }
}
