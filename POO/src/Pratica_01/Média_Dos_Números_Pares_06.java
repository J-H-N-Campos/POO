package Pratica_01;

import Geral.Entrada;

/*6)Desenvolver um programa que solicite vários números até que o número zero seja digitado.
O programa então deve exibir a média dos número pares*/

public class Média_Dos_Números_Pares_06
{
    public static void main (String[] args)
    {
        double media=0;
        int q=0;
        
         int num=Entrada.leiaInt("Digite algum número:");
         
       while(num != 0)
        {                 
                if(num%2==0)
                {
                    media=media+num/2;
                    q++;
                }
                num=Entrada.leiaInt();
        }
                    System.out.println("A média de números pares será:"+media); 
                System.exit(0);
    }
}