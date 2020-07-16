package autenticador.exemplo;

import autenticador.negocio.Autenticavel;

public class SistemaNasaDeLancamentoFoguetes implements Autenticavel
{

    @Override
    public void rodar()
    {
        System.out.println("ssssssssss");
    }

    @Override
    public void abortar()
    {
        System.out.println("abort");
    }

    @Override
    public void falhar()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}