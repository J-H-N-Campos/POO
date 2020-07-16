/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package money;

import money.apresentacao.Tela;
import money.negocio.MaquinaCacaNiqueis;
import money.persistencia.MaquinaCacaNiqueisDao;

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
        MaquinaCacaNiqueisDao dao = new MaquinaCacaNiqueisDao();
        MaquinaCacaNiqueis maq = dao.ler();
        
        Tela tela = new Tela(maq);
        tela.setVisible(true);
    }
    
}
