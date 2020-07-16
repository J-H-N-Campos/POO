package Pratica_01;

import Geral.Entrada;

/*7)Desenvolva um programa que recebe 1000 nomes e então mostre os nomes 
que iniciam por uma vogal na ordem inversa a que foram digitados,
ou seja, começando pelo milésimo nome (para testar reduza a quantidade).*/

public class Mil_Nomes_07
{
  public static void main (String[] args)
  {
    String[] vetor=new String[1000];
    
    for (int i = 0; i < vetor.length; i++)
        {
            vetor[i] = Entrada.leiaString("Digite os nomes:");
        }
        
        for (int i = vetor.length-1; i >= 0; i--)
        {
            if (vetor[i].charAt(0) == 'a' || vetor[i].charAt(0) == 'A' ||
                vetor[i].charAt(0) == 'e' || vetor[i].charAt(0) == 'E' ||
                vetor[i].charAt(0) == 'i' || vetor[i].charAt(0) == 'I' ||
                vetor[i].charAt(0) == 'o' || vetor[i].charAt(0) == 'O' ||
                vetor[i].charAt(0) == 'u' || vetor[i].charAt(0) == 'U')
            {
                System.out.println(vetor[i]);
            }
        }
        
        
    }
}