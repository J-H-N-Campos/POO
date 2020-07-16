/*Desenvolva um programa que verifique se um número recebido do usuário é
ou não um número primo.*/
package Pratica_02;

import Geral.Entrada;

public class Números_Primos_01
{
    public static void main(String[] args)
    {
     int np=Entrada.leiaInt("Digite algum número:");
     int nd=0;
     
     for(int i=1; i<=np; i++)
     {
         if (np%1==0)
         {
             nd++;
         }
     }
     if (nd==2)
     {
         System.out.println("O número digitado é primo:");
     }else
         System.out.println("O número digitado não é primo:");
    System.exit(0);
    }
}