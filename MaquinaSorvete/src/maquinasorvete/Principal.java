/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinasorvete;

import autenticador.Lancador;
import maquinasorvete.apresentacao.Tela;
import maquinasorvete.persistencia.MaquinaSorveteDao;
import maquinasorvete.persistencia.MaquinaSorveteDaoTxt;
import maquinasorvete.negocio.MaquinaSorvete;

/**
 *
 * @author mouriac
 */
public class Principal
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        MaquinaSorveteDao dao = new MaquinaSorveteDaoTxt();
//        MaquinaSorvete ms = dao.load();
//        
//        Tela t = new Tela(ms);
//        t.setVisible(true);

        Sistema s = new Sistema();
        
        Lancador x = new Lancador(s);
        x.start();
        
        
        
    }
    
}
