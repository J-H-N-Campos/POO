package avaliacao;

/**
 * Módulo utilitários.
 * @author mouriac
 */
public class Util
{
    public static boolean verificarOrdem( int[] vetor )
    {
        boolean ok = true;
        if (vetor[0] <= vetor[vetor.length-1]) // crescente
        {
            for (int i = 0; i < vetor.length-1 && ok; i++)
            {
                if (vetor[i] > vetor[i+1])
                {
                    ok = false;
                }
            }
        }
        else
        {
            for (int i = 0; i < vetor.length-1 && ok; i++)
            {
                if (vetor[i] < vetor[i+1])
                {
                    ok = false;
                }
            }
        }
        return ok;
    }
    
    public static Cliente procuraCliente( Cliente[] vetor, String nomeDoCliente)
    {
        Cliente clienteLocalizado = null;
        for (Cliente cliente: vetor)
        {
            if (cliente.getNome().equalsIgnoreCase(nomeDoCliente))
            {
                clienteLocalizado = cliente;
            }
        }
        return clienteLocalizado;
    }
    
    public static Cliente procuraClienteV2( Cliente[] vetor, String nomeDoCliente)
    {
        Cliente clienteLocalizado = null;
        
        for (int i = 0; i < vetor.length; i++)
        {
            if (vetor[i].getNome().equalsIgnoreCase(nomeDoCliente))
            {
                clienteLocalizado = vetor[i];
            }
        }
        return clienteLocalizado;
    }
    
}
