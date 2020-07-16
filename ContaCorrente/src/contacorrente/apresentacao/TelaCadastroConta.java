package contacorrente.apresentacao;

import contacorrente.negocio.ContaCorrente;
import contacorrente.negocio.Correntista;
import everest.geral.Entrada;
import java.util.ArrayList;

public class TelaCadastroConta
{
    private ArrayList<Correntista> correntistas;
    private ArrayList<ContaCorrente> contas;

    public TelaCadastroConta(ArrayList<Correntista> correntistas, ArrayList<ContaCorrente> contas)
    {
        this.correntistas = correntistas;
        this.contas = contas;
    }

    public void exibir()
    {
        int cod = Entrada.leiaInt("Código do Correntista:");
        if (cod >= 0 && cod < correntistas.size())
        {
            Correntista cor = correntistas.get(cod);
            
            double limite = Entrada.leiaDouble("Limite de crédito:");
            ContaCorrente conta = new ContaCorrente(0, cor, limite);

            contas.add(conta);
            System.out.println("Registro gravado com sucesso.");
            
        } 
        else
        {
            System.out.println("Correntista inválido");
        }
    }
}
