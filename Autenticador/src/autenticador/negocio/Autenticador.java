package autenticador.negocio;

import autenticador.persistencia.AutenticadorDao;

public class Autenticador
{
    private Autenticavel sistema;

    public Autenticador(Autenticavel sistema)
    {
        this.sistema = sistema;
    }

    public void executarSistema()
    {
        sistema.rodar();
    }

    public void abortarSistema()
    {
        sistema.abortar();
    }

    public void executarErro()
    {
        sistema.falhar();
    }  
    
    public boolean autenticar( String user, String senha )
    {
        boolean ok = false;
        
        AutenticadorDao d = new AutenticadorDao();
        String[][] matriz = d.carregarUsuarios();
        
        for (int i = 0; i < matriz.length; i++)
        {
            if (matriz[i][0].equalsIgnoreCase(user))
            {
                if (matriz[i][1].equals(senha))
                {
                    ok = true;
                }
            }
        }
        
        return ok;
    }
}