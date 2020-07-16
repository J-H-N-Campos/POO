/*Desenvolva um programa que tem como entradas o dia, o mês e ano de uma data
e depois informe se essa data é válida.*/

package Pratica_01;

import Geral.Entrada;

public class Data_Ano_Mês_08
{
    public static void main(String[] args)
    {
    boolean ok=false;
            
    int ano=Entrada.leiaInt("Digite o ano:");
    int mes=Entrada.leiaInt("Digite o mês:");
    int dia=Entrada.leiaInt("Digite o dia:");
    int[] udm = {31,28,31,30,31,30,31,31,30,31,30,31};
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
        {
            udm[1] = 29;
        }
                
        if (ano > 1582)
        {
            if (mes >= 1 && mes <= 12)
            {
                if (dia >= 1 && dia <= udm[mes-1] )
                {
                    ok = true;
                }
            }
        }
        
        if (ok)
        {
            System.out.println("A data está correta, é válida.");
        }else
        {
            System.out.println("A data é incorreta.");
        }
        System.exit(0);
    }
}