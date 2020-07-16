package contacorrente.apresentacao;

import contacorrente.negocio.ContaCorrente;
import contacorrente.negocio.Correntista;
import everest.geral.Entrada;
import java.util.ArrayList;

public class TelaPrincipal
{
    private ArrayList<Correntista> correntistas;
    private ArrayList<ContaCorrente> contas;

    public TelaPrincipal(ArrayList<Correntista> correntistas, ArrayList<ContaCorrente> contas)
    {
        this.correntistas = correntistas;
        this.contas = contas;
    }

    public TelaPrincipal(Correntista[] correntistas, ContaCorrente[] contas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void exibir()
    {
        char op = ' ';
        while (Character.toLowerCase(op) != 'x')
        {
            op = Entrada.leiaChar("M E N U\n\n"
                    + "[1] Cadastrar Correntistas\n"
                    + "[2] Criar Contas\n"
                    + "[3] Operar com uma conta\n"
                    + "[4] Consultar correntistas\n"
                    + "[5] Consultar contas\n"
                    + "[x] Sair do sistema\n\n");

            if (op == '1')
            {
                TelaCadastroCorrentista tela = new TelaCadastroCorrentista(correntistas);
                tela.exibir();
            } 
            else if (op == '2')
            {
                TelaCadastroConta tela = new TelaCadastroConta(correntistas, contas);
                tela.exibir();
            }
            else if (op == '3')
            {
                int cod = Entrada.leiaInt("Número da conta:");
                if (cod >= 0 && cod < contas.size())
                {
                    TelaConta tela = new TelaConta(contas.get(cod),contas);
                    tela.exibir();
                }
                else
                {
                    System.out.println("Conta não existe");
                }
                       
                
            }
            else if (op == '4')
            {   /*
                for (int i = 0; i < correntistas.size(); i++)
                {
                     System.out.println( i+" -> "+correntistas.get(i).getNome() );
                }*/
                int y = 0;
                for (Correntista x: correntistas)
                {
                    System.out.println( y+" -> "+x.getNome() );
                    y++;
                }
                
                
                
                
            }
            else if (op == '5')
            {
                for (int i = 0; i < contas.size(); i++)
                {
                    System.out.println( i+" -> "+contas.get(i).getCorrentista().getNome()+" - "+contas.get(i).getSaldo());
                }
            }
        }
    }
    
    
}
