package contacorrente.apresentacao;

import contacorrente.negocio.Correntista;
import everest.geral.Data;
import everest.geral.Entrada;
import java.util.ArrayList;

public class TelaCadastroCorrentista
{
    private ArrayList<Correntista> correntistas;

    public TelaCadastroCorrentista(ArrayList<Correntista> correntistas)
    {
        this.correntistas = correntistas;
    }
    
    public void exibir()
    {
        String nome = Entrada.leiaString("Nome:");
        String endereco = Entrada.leiaString("Endereço:");
        String dtNasc = Entrada.leiaString("Data Nascimento (dd/mm/aaaa):");

        Correntista c = new Correntista(nome,endereco,new Data(dtNasc));
        
        correntistas.add(c);
    }
    
}
