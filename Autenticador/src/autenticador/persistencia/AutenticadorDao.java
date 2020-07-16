package autenticador.persistencia;

import everest.geral.Arquivo;

public class AutenticadorDao
{
    public String[][] carregarUsuarios()
    {
        Arquivo arq = new Arquivo("usuarios.txt");
        int cont = 0;
        
        if (arq.abrirLeitura())
        {
            String linha = arq.lerLinha();
            while (linha != null)
            {
                cont ++;
                linha = arq.lerLinha();
            }
            arq.fecharArquivo();
        }

        String[][] users = new String[cont][2];

        if (arq.abrirLeitura())
        {
            for (int i = 0; i < cont; i++)
            {
                String linha = arq.lerLinha();
                String campos[] = linha.split(";");
        
                users[i][0] = campos[0];
                users[i][1] = campos[1];
            }
            arq.fecharArquivo();
        }
        return users;
    }
}
