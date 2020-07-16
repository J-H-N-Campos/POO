package autenticador;

import java.util.ArrayList;

public class Autenticador
{
    private Autenticavel autenticavel;

    public Autenticador(Autenticavel autenticavel)
    {
        this.autenticavel = autenticavel;
    }
    
    public void entrarSistema()
    {
        autenticavel.inicializar();
    }
    
    
    public boolean autenticar(String nome, String senha)
    {
        AutenticadorDao x = new AutenticadorDao();
        ArrayList<Usuario> users = x.carregar();
        
        boolean ok = false;
        /*
        for (int i = 0; i < users.size(); i++)
        {
            Usuario u = users.get(i);
            
            if (u.getNome().equals(nome))
            {
                // achei o usuário
                if (u.getSenha().equals(senha))
                {
                    ok = true;
                    break;
                }
            }
        }
        */
        for (Usuario u: users)
        {
            if (u.getNome().equals(nome))
            {
                // achei o usuário
                if (u.getSenha().equals(senha))
                {
                    ok = true;
                    break;
                }
            }
        }

        return ok;
    }
    
}
