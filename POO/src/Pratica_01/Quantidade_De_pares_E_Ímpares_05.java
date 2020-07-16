package Pratica_01;

import Geral.Entrada;

/*5)Desenvolver um programa que solicite vários números até que o número zero seja digitado.
O programa então deve exibir a quantidade de números pares 
e de números ímpares que foram digitados.*/

public class Quantidade_De_pares_E_Ímpares_05 
{
    public static void main (String[] args)
    {
        int q=0;
        int x=0;
        int num=Entrada.leiaInt("Digite um número:");
                
        while (num!=0)
        {
            System.out.println("-----------------");
           if (num%2==0)
            {
            System.out.println("Número par:"+num);
            System.out.println("Quantidade de números pares:"+q);
            q++;
            }
           if (num%2==1)
           {
            System.out.println("Número ímpar:"+num);
           System.out.println("Quantidade de números ímpares:"+x);
            x++;
            }
           num=Entrada.leiaInt();
        }
        System.exit(0);
    }
}