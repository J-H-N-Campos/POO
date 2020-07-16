package Pratica_01;

import Geral.Entrada;

/*3)Desenvolva um programa que recebe as coordenadas
de um ponto no Plano Cartesiano e depois informe
a qual quadrante o ponto pertence 
(ignorar a possibilidade de estar sobre os eixos).*/

public class Coordenadas_03
{
    public static void main(String[] args)
    {
       double x = Entrada.leiaDouble("Digite o ponto x do seu plano cartesiano:");
       double y = Entrada.leiaDouble("Digite o ponto y do seu plano cartesiano:");
        
        int num=0;
        
        if (x > 0 && y > 0)
        {
            num = 1;
        }
        if (x < 0 && y > 0)
        {
            num = 2;
        }
        if (x < 0 && y < 0)
        {
            num = 3;
        }
        if (x > 0 && y < 0)
        {
            num = 4;
        }
        
        if (num == 0)
        {
            System.out.println("O ponto está sobre o eixo:");
        }
        else
        {
            System.out.println("O ponto está no: "+num+"º quandrante.");
        }
        System.exit(0);

    }
}