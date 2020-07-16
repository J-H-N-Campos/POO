package Pratica_01;

import Geral.Entrada;

/*4)Desenvolva um programa que recebe do usuário
10 número e no final exiba quantos são múltiplos de 5.*/

public class Múltiplos_De_5_04
{
    public static void main(String[] args)
    {
        int n;
        int qtd=0;
        
        for(int i=1; i<=10; i++)
        {
            System.out.println("----------------------------------");
            
        n=Entrada.leiaInt("Digite um número:");
        
        if (n%5==0)
        {
            System.out.println("Número múltiplo de cinco:"+n);
            System.out.println("Quantidades dos números múltiplos de cinco:"+qtd);
            qtd++;
        }
        }   
          System.exit(0);
    }
}