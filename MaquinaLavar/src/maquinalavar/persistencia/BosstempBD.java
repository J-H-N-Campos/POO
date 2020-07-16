package maquinalavar.persistencia;

import everest.geral.Arquivo;
import maquinalavar.negocio.Bosstemp;

public class BosstempBD
{
    public void salvar(Bosstemp b)
    {
        Arquivo arq = new Arquivo("bosstemp.txt");
        
        if (arq.abrirEscrita())
        {
            arq.escreverLinha( b.getNivelAmaciante()+"" );
            arq.escreverLinha( b.getNivelRoupas()+"" );
            arq.escreverLinha( b.getNivelSabao()+"" );
            
            arq.fecharArquivo();
        }
    }
    
    public Bosstemp ler()
    {
        Bosstemp b = null;
        Arquivo arq = new Arquivo("bosstemp.txt");
        
        if (arq.abrirLeitura())
        {
            double compRoupas = Double.parseDouble( arq.lerLinha() );
            int compSabao = Integer.parseInt(arq.lerLinha() );
            int compAmaciante = Integer.parseInt(arq.lerLinha() );
            
            arq.fecharArquivo();
            
            b = new Bosstemp( (int) compRoupas, compSabao, 
                    compAmaciante);
        }
        return b;
    }
}