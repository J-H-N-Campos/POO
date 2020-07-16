/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autenticador.exemplo;

import autenticador.Autenticador;
import autenticador.TelaAutenticacao;

/**
 *
 * @author mouriac
 */
public class Teste
{
    public static void main(String[] args)
    {
        ClasseQualquer qq = new ClasseQualquer();

        Autenticador a = new Autenticador(qq);
        
        TelaAutenticacao t = new TelaAutenticacao(a);
        t.setVisible(true);
        
    }
}
