/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticador;

/**
 *
 * @author mouriac
 */
public class Lancador
{
    private Autenticavel autenticavel;

    public Lancador(Autenticavel autenticavel)
    {
        this.autenticavel = autenticavel;
    }
    
    public void start()
    {
        Autenticador a = new Autenticador(autenticavel);
        
        TelaAutenticacao t = new TelaAutenticacao(a);
        t.setVisible(true);
    }
    
}
