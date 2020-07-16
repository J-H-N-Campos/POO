package everest.geral.exemplo;

import everest.geral.Entrada;

public class ProgramaNomeMaiorMenorV1
{
    public static void main(String[] args)
    {
        String nome = Entrada.leiaString();
        String nomeMaisCurto = nome;
        String nomeMaisLongo = nome;
        while (!nome.isEmpty())
        {
            if (nome.length() > nomeMaisLongo.length())
            {
                nomeMaisLongo = nome;
            }
            if (nome.length() < nomeMaisCurto.length())
            {
                nomeMaisCurto = nome;
            }
            nome = Entrada.leiaString();
        }
        System.out.println("Mais curto: "+nomeMaisCurto);
        System.out.println("Mais longo: "+nomeMaisLongo);
    }
}
