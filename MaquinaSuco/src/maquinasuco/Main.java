/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinasuco;

import maquinasuco.apresentacao.TelaSuco;
import maquinasuco.negocio.MaquinaSuco;
import maquinasuco.persistencia.MaquinaSucoDao;

/**
 *
 * @author mouriac
 */
public class Main
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        MaquinaSucoDao dao = new MaquinaSucoDao();
        MaquinaSuco ms = dao.ler();
        
        TelaSuco tela = new TelaSuco(ms);
        tela.setVisible(true);
    }
    
}
