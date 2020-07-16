package Pratica_01;

import Geral.Entrada;

/*1)Desenvolva um programa que
tem como entradas os lados de um triângulo e como saída 
a área e o perímetro deste triângulo.*/

public class Triangulo_01
{
    public static void main (String[] args)
    {
        Double a,b,c,p,area,base,altura;
        
        a=Entrada.leiaDouble("Digite o tamanho do lado um:");
        b=Entrada.leiaDouble("Digite o tamanho do lado dois:");
        c=Entrada.leiaDouble("Digite o tamanho do lado três:");
        base=Entrada.leiaDouble("Digite o tamanho da base do triângulo:");
        altura=Entrada.leiaDouble("Digite o tamanho da altura do triângulo:");
        
        p=(a+b+c);
        area=(base*altura/2);
        
        System.out.println("Tamanho do perímetro do triângulo:"+p);
        System.out.println("Tamanho da área do triângulo:"+area);
        System.exit(0);
    }
}