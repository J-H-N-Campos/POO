public class SistemaDeFornecimentoDeBebidasQuentes
{

    public static void main(String[] args) 
    {
        Cafeteira c = new Cafeteira();
        Tela t = new Tela(c);
        t.exibir();
        System.exit(0);
    }
}
