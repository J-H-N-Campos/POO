package contacorrente;

import contacorrente.apresentacao.TelaPrincipal;
import contacorrente.negocio.ContaCorrente;
import contacorrente.negocio.Correntista;
import everest.geral.Data;

public class Main2
{
    public static void main(String[] args)
    {
        
        Correntista[] correntistas = new Correntista[10];
        ContaCorrente[] contas = new ContaCorrente[10];
        
        TelaPrincipal tela = new TelaPrincipal(correntistas,contas);
        tela.exibir();
        
        System.exit(0);
        
    }
}
