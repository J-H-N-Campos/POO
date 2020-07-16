package Pratica_08;

import Geral.Entrada;

public class TelaMuseu
{
    private Museu museu;

    public TelaMuseu(Museu museu)
    {
        this.museu = museu;
    }
    
    public void exibir()
    {
        char op = ' ';
        while (op != 'x')
        {
            op = Entrada.leiaChar("M E N U\n\n"
                    + "[1] Entrar no museu\n"
                    + "[2] Entrar na Galeria 01\n"
                    + "[3] Entrar na Galeria 02\n"
                    + "[4] Sair do Museu\n"
                    + "[5] Sair da Galeria 01\n"
                    + "[6] Sair da Galeira 02\n"
                    + "[7] Trocar o valor do ingresso\n"
                    + "[8] Consultar\n"
                    + "[x] Sair do sistema");

            if (op == '1')
            {
                museu.entrarMuseu();
                System.out.println("Entrou no museu");
            } 
            else if (op == '2')
            {
                if (museu.entrarGaleria1())
                {
                    System.out.println("Entrou na galeria 01");
                } else
                {
                    System.out.println("A galeria está lotada ou não há visitantes no saguão");
                }
            }
            else if (op == '3')
            {
                if (museu.entrarGaleria2())
                {
                    System.out.println("Entrou na galeria 02");
                } else
                {
                    System.out.println("A galeria está lotada ou não há visitantes no saguão");
                }
            }
            else if (op == '4')
            {
                if (museu.sairMuseu())
                {
                    System.out.println("Saiu com sucesso");
                } else
                {
                    System.out.println("Falha ao sair");
                }
            }
            else if (op == '5')
            {
                if (museu.sairGaleria1())
                {
                    System.out.println("Saiu com sucesso da Galeria 01");
                } else
                {
                    System.out.println("Falha ao sair");
                }
            }
            else if (op == '6')
            {
                if (museu.sairGaleria2())
                {
                    System.out.println("Saiu com sucesso da Galeria 02");
                } else
                {
                    System.out.println("Falha ao sair");
                }
            }
            else if (op == '7')
            {
                double b = Entrada.leiaDouble("Novo valor ingresso");
                museu.setValorIngresso(b);
            }
            else if (op == '8')
            {
                System.out.println("------ Numero visitantes dentro do museu ------");
                System.out.println("Saguão:     " + museu.getNroTotalVisitantesSaguao() );
                System.out.println("Galeria 01: " + museu.getNroVisistantesAgoraG1() );
                System.out.println("Galeria 02: " + museu.getNroVisistantesAgoraG2() );
                System.out.println("");
                System.out.println("------ Numero total de visitantes ------");
                System.out.println("Museu:      " + museu.getNroTotalVisitantes() );
                System.out.println("Galeria 01: " + museu.getNroVisistantesG1() );
                System.out.println("Galeria 02: " + museu.getNroVisistantesG2() );
                System.out.println("");
                System.out.println("------ Valor em caixa ------");
                System.out.println("Caixa: "+museu.getValorCaixa());
            }
        }
    }
    
}