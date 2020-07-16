
public class Tela
{

    private Cafeteira cafeteira;

    public Tela(Cafeteira cafeteira)
    {
        this.cafeteira = cafeteira;
    }

    public void exibir()
    {
        String m = "1) Reabastecer\n"
                + "2) Servir Capuccino\n"
                + "3) Servir Café\n"
                + "4) Servir Chocolate\n"
                + "5) Exibir situação\n"
                + "6) Reinicializar\n"
                + "7) Sair";

        int op = 0;
        while (op != 7)
        {
            op = Entrada.leiaInt(m);
            if (op == 1)
            {
                this.cafeteira.abastecerCafé();
                this.cafeteira.abastecerCapuccino();
                this.cafeteira.abastecerChocolate();
                this.cafeteira.abastecerÁgua();
            } 
            else if (op == 2)
            {
                if (cafeteira.servirCapuccino())
                {
                    System.out.println("Capuccino servido com sucesso");
                } 
                else
                {
                    System.out.println("Faltou insumos");
                }
            } 
            else if (op == 3)
            {
                if (cafeteira.servirCafé())
                {
                    System.out.println("Café servido com sucesso");
                } 
                else
                {
                    System.out.println("Faltou insumos");
                }
            } 
            else if (op == 4)
            {
                if (cafeteira.servirChocolate())
                {
                    System.out.println("Chocolate servido com sucesso");
                } 
                else
                {
                    System.out.println("Faltou insumos");
                }
            } 
            else if (op == 5)
            {
                System.out.println("Nível água................: "+cafeteira.getNívelÁgua());
                System.out.println("Nível mistura capuccino...: "+cafeteira.getNívelCapuccino());
                System.out.println("Nível mistura café........: "+cafeteira.getNívelCafé());
                System.out.println("Nível mistura chocolate...: "+cafeteira.getNívelChocolate());
                System.out.println("Número doses servidas.....: "+cafeteira.getContador());
            }
            else if (op == 6)
            {
                cafeteira.reinizializarContador();
                System.out.println("Reinicializado com sucesso");
            }
        }
    }
}

