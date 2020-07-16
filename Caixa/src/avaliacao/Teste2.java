/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliacao;

/**
 *
 * @author mouriac
 */
public class Teste2
{
    public static void main(String[] args)
    {
        CaixaEletronico cx = new CaixaEletronico();
        cx.reabastecer();
        
        for (int i = 0; i < 1000; i++)
        {
            int valor = ((int)(Math.random() * 100)+1)*10;
            
            System.out.print( valor + "\t" );
            System.out.print( cx.sacar( valor ) + "\t" );
            System.out.println( cx.getNotas100()+" \t "+cx.getNotas50()+" \t "+cx.getNotas20() );
        }
    }
}
