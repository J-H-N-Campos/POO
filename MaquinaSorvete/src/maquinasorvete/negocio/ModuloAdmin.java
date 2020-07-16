/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinasorvete.negocio;

import autenticador.Autenticavel;
import maquinasorvete.apresentacao.Tela;
import maquinasorvete.apresentacao.TelaAdmin;

public class ModuloAdmin implements Autenticavel
{
    private Tela telaPrincipal;
    private MaquinaSorvete ms;

    public ModuloAdmin(Tela telaPrincipal, MaquinaSorvete ms)
    {
        this.telaPrincipal = telaPrincipal;
        this.ms = ms;
    }
 

    public void inicializar()
    {
        TelaAdmin t = new TelaAdmin(telaPrincipal,ms);
        t.setVisible(true);
    }

    
}
