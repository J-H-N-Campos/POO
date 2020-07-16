package Pratica_01;

import Geral.Entrada;

/*2)Desenvolva um programa que recebe o preço de um produto e 
se o mesmo for abaixo de 50 exiba o preço com 5% de desconto. Se o preço de 50 a 100 exiba o preço
com 10% de desconto e se o preço for superior a 100 exiba o preço com 15% de desconto.*/

public class Produto_02
{
    public static void main (String[] args)
    {
        Double p,d;
        
        p=Entrada.leiaDouble("Digite o preço do produto");
        
        if (p<50)
        {
            d=p*5/100;
        }else
            if (p<=100)
            {
                d=p*10/100;
            }else
               d=p*15/100;
                   
    System.out.println("O preço do produto, após o seu desconto será:"+d);
    System.exit(0);
}
}