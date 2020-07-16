package autenticador.exemplo;

import autenticador.negocio.Autenticavel;

public class Sistema implements Autenticavel
{

    @Override
    public void rodar()
    {
        System.out.println("estou rodando o sistema");
    }

    @Override
    public void abortar()
    {
        System.out.println("O sistema foi abortado");
    }

    @Override
    public void falhar()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}