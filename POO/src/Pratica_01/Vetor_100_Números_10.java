/*Faça um programa que preencha um vetor com 100 números inteiros aleatórios entre a base e o teto. 
A base e o teto são recebidos do usuário.
Depois exibir o vetor preenchido.*/

package Pratica_01;

import Geral.Entrada;

public class Vetor_100_Números_10
{
    public static void main(String[] args)
    {
         int[] vetor = new int[100];
        
        int base = Entrada.leiaInt("Base");
        int teto = Entrada.leiaInt("Teto");
        
        for (int i = 0; i < 100; i++)
        {
            vetor[i] = (int)(Math.random()*(teto-base+1))+base;
        }
        
        for (int i = 0; i < 100; i++)
        {
            System.out.println(vetor[i]);
        }
    }
}