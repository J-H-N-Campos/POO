/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticador.exemplo;

import autenticador.Autenticavel;

/**
 *
 * @author mouriac
 */
public class ClasseQualquer implements Autenticavel
{

    @Override
    public void inicializar()
    {
        System.out.println("entrar no sistema");
    }
    
}
