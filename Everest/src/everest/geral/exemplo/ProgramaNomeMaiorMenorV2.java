package everest.geral.exemplo;

import everest.geral.Arquivo;
import everest.geral.Entrada;

public class ProgramaNomeMaiorMenorV2
{
    public static void main(String[] args)
    {
        Arquivo a = new Arquivo("nomes.txt");
        
        if (a.abrirLeitura())
        {
            String nome = a.lerLinha();
            String nomeMaisCurto = nome;
            String nomeMaisLongo = nome;
            while (nome != null)
            {
                if (nome.length() > nomeMaisLongo.length())
                {
                    nomeMaisLongo = nome;
                }
                if (nome.length() < nomeMaisCurto.length())
                {
                    nomeMaisCurto = nome;
                }
                nome = a.lerLinha();
            }
            if (nomeMaisCurto != null)
            {
                System.out.println("Mais curto: "+nomeMaisCurto);
                System.out.println("Mais longo: "+nomeMaisLongo);
            }
            a.fecharArquivo();
        }
    }
}
