package autenticador;

import everest.geral.Arquivo;
import java.util.ArrayList;

public class AutenticadorDao
{
    public ArrayList<Usuario> carregar()
    {
        ArrayList<Usuario> users = new ArrayList();
        
        Arquivo arq = new Arquivo("usuarios.txt");
        
        if (arq.abrirLeitura())
        {
            String linha = arq.lerLinha();
            while (linha != null)
            {
                String[] vet = linha.split(";");
                Usuario u = new Usuario(vet[0],vet[1]);
                
                users.add(u);
                
                linha = arq.lerLinha();
            }
            arq.fecharArquivo();
        }
        return users;
    }
}
