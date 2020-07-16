package Pratica_01;

import Geral.Entrada;

/*Faça um programa que sorteie um número inteiro de 1 a 1000 e depois 
recebe um número do usuário e então diga se esse número é menor 
ou maior do que o número sorteado.*/

public class Sorteio_09
{
    public static void main(String[] args)
    {
         int num = (int)(Math.random()*1000)+1;
        
        int x = Entrada.leiaInt();
        
        if (x > num)
        {
            System.out.println("O seu número é maior");
        }
        else if (x < num)
        {
            System.out.println("O seu número é menor");
        }
        else
        {
            System.out.println("Você acertou exatamente o número que o computador sorteou");
        }
            
        System.out.println("O número sorteado era: "+num);
        System.exit(0);
    }
}