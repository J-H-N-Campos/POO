/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everest.geral.exemplo;

import everest.geral.Arquivo;
import everest.geral.Entrada;

/**
 *
 * @author mouriac
 */
public class SalvaMegaSennaV1
{
    public static void main(String[] args)
    {
        Arquivo x = new Arquivo("megasenna.txt");
        if (x.abrirEscrita())
        {
            boolean continuar = true;
            while (continuar)
            {
                String aposta = "";
                for (int i = 0; i < 6; i++)
                {
                    int nro = Entrada.leiaInt("Digite o "+(i+1)+"º número");
                    aposta += nro+";";
                }
                x.escreverLinha(aposta);
                System.out.println("A aposta com os nros "+aposta+" foi salva");
                continuar = Entrada.leiaBoolean("Deseja continuar?");
            }
            x.fecharArquivo();
        }
    }
}
