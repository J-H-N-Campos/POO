package prova01.apresentacao;

import prova01.negocio.Lampada;
import everest.geral.Entrada;

public class Tela
{
    private Lampada lampada;

    public Tela(Lampada lampada)
    {
        this.lampada = lampada;
    }
    
    public void exibir()
    {
        String menu = "[p] Power\n"
                    + "[a] Aumentar intensidade\n"
                    + "[d] Reduzir intesidade\n"
                    + "[r] Mudar cor para vermelho\n"
                    + "[g] Mudar cor para verde\n"
                    + "[b] Mudar cor para Azul\n"
                    + "[w] Mudar cor para Branco\n"
                    + "[s] Ver estado da lâmpada\n"
                    + "[x] Sair do sistema";
        char op = ' ';
        while (Character.toLowerCase(op) != 'x')
        {
            op = Entrada.leiaChar(menu);
            if (op == 'p')
            {
                if (lampada.isLigada())
                {
                    lampada.desligar();
                    System.out.println("Desligou");
                }
                else
                {
                    lampada.ligar();
                    System.out.println("Ligou");
                }
            }
            else if (op == 'a')
            {
                try
                {
                    lampada.aumentarIntensidade();
                    System.out.println("Aumentou intensidade");
                }
                catch (RuntimeException e)
                {
                    System.out.println( e.getMessage() );
                }
            }
            else if (op == 'd')
            {
                lampada.reduzirIntensidade();
                System.out.println("Reduziu intensidade");
            }
            else if (op == 'r')
            {
                lampada.setVermelho();
                System.out.println("Trocou para vermelho");
            }
            else if (op == 'g')
            {
                lampada.setVerde();
                System.out.println("Trocou para verdade");
            }
            else if (op == 'b')
            {
                lampada.setAzul();
                System.out.println("Trocou para azul");
            }
            else if (op == 'w')
            {
                lampada.setBranco();
                System.out.println("Trocou para branco");
            }
            else if (op == 's')
            {
                if (lampada.isLigada())
                {
                    System.out.println("Ligada");
                }
                else
                {
                    System.out.println("Desligada");
                }
                System.out.println("Intensidade atual: "+lampada.getIntensidade());
                System.out.println("Cor atual: "+lampada.getCor());
            }
        }
    }
}
