/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinalavar;

import maquinalavar.apresentacao.TelaLavadora;
import maquinalavar.negocio.Bosstemp;

/**
 *
 * @author mouriac
 */
public class Main
{

    public static void main(String[] args)
    {
        Bosstemp bt = new Bosstemp();

        TelaLavadora tela = new TelaLavadora(bt);
        tela.exibir();
        
        System.exit(0);
    }
    
}
