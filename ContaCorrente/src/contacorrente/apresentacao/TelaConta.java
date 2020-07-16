package contacorrente.apresentacao;

import contacorrente.negocio.Correntista;
import contacorrente.negocio.ContaCorrente;
import everest.geral.Data;
import everest.geral.Entrada;
import java.util.ArrayList;

public class TelaConta
{
    private ContaCorrente conta;
    private ArrayList<ContaCorrente> contas;

    public TelaConta(ContaCorrente conta, ArrayList<ContaCorrente> contas)
    {
        this.conta = conta;
        this.contas = contas;
    }
    
    public void exibir()
    {
        char op = ' ';
        while (Character.toLowerCase(op) != 'x')
        {
            op = Entrada.leiaChar("CONTA DO "+conta.getCorrentista().getNome()+"\n\n"
                    + "M E N U\n\n"
                    + "[1] Depositar\n"
                    + "[2] Sacar\n"
                    + "[3] Pagar conta\n"
                    + "[4] Descontar Cheque\n"
                    + "[5] Transferir para outra conta\n"
                    + "[6] Editar limite de crédito\n"
                    + "[7] Consultar status\n"
                    + "[x] Sair do sistema\n\n");

            if (op == '1')
            {
                double valor = Entrada.leiaDouble("Valor a depositar");
                if (conta.depositar(valor))
                {
                    System.out.println("Valor depositado com sucesso");
                }
                else
                {
                    System.out.println("O valor precisa ser positivo");
                }
            } 
            else if (op == '2')
            {
                double valor = Entrada.leiaDouble("Valor para sacar");
                if (conta.sacar(valor))
                {
                    System.out.println("Valor sacado com sucesso");
                }
                else
                {
                    System.out.println("Falou saldo ou o valor é negativo");
                }
            }
            else if (op == '3')
            {
                double valor = Entrada.leiaDouble("Valor da conta");
                String vcto = Entrada.leiaString("Data vencimento (dd/mm/aaaa)",new Data().formatarData(1));
                if (conta.pagarBoleto(valor, new Data(vcto) ))
                {
                    System.out.println("Boleto pago com sucesso");
                }
                else
                {
                    System.out.println("Faltou saldo");
                }
                
            }
            else if (op == '4')
            {
                double valor = Entrada.leiaDouble("Valor do cheque");
                int nro = Entrada.leiaInt("Número do cheque");
                if (conta.descontarCheque(valor, nro))
                {
                    System.out.println("Cheque descontado");
                }
                else
                {
                    System.out.println("Faltou saldo");
                }
            }
            else if (op == '5')
            {
                double valor = Entrada.leiaDouble("Valor da transferência");
                int nro = Entrada.leiaInt("Número da conta de destino");
                
                if (nro >=0 && nro < contas.size())
                {
                    ContaCorrente destino = contas.get(nro);
                    if (conta.transferir(valor, destino))
                    {
                        System.out.println("Tranferência realizada");
                    }
                    else
                    {
                        System.out.println("Faltou saldo");
                    }
                }
            }
            else if (op == '6')
            {
                double limite = Entrada.leiaDouble("Digite novo limite", conta.getLimiteCredito() );
                conta.setLimiteCredito(limite);
                System.out.println("Novo limite ajustado");
            }
            else if (op == '7')
            {
                System.out.println("--- CONTA CORRENTE ------------------------");
                System.out.println("Limite.................: " + conta.getLimiteCredito() );
                System.out.println("Saldo..................: " + conta.getSaldo() );
                System.out.println("Disponível.............: " + (conta.getSaldo()+conta.getLimiteCredito()) );
                System.out.println("Data último movimento..: " + conta.getDataUltimoMovimento().formatarData(1) );
                System.out.println("");
                System.out.println(conta.getExtrato());
            }
            
        }
    }
}
