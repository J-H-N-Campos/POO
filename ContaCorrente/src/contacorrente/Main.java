package contacorrente;

import contacorrente.apresentacao.TelaPrincipal;
import contacorrente.negocio.ContaCorrente;
import contacorrente.negocio.Correntista;
import everest.geral.Data;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        //Correntista[] correntistas = new Correntista[10];
        ArrayList<Correntista> correntistas = new ArrayList();
         
        //ContaCorrente[] contas = new ContaCorrente[10];
        ArrayList<ContaCorrente> contas = new ArrayList();
        
        TelaPrincipal tela = new TelaPrincipal(correntistas,contas);
        tela.exibir();
        
        System.exit(0);
        
    }
}
