package maquinasuco.persistencia;

import everest.geral.Arquivo;
import maquinasuco.negocio.MaquinaSuco;

/**
 * Persistência da máquina de suco.
 * @author mouriac
 */
public class MaquinaSucoDao
{
    public void salvar(MaquinaSuco maq)
    {
        Arquivo x = new Arquivo("dados.txt");
        
        if (x.abrirEscrita())
        {
            x.escreverLinha( maq.getContatorLotesProduzidos()+"" );
            x.escreverLinha( maq.getNivelAcucar()+"" );
            x.escreverLinha( maq.getNivelAgua()+"" );
            x.escreverLinha( maq.getQuantEmbalagens()+"" );
            x.escreverLinha( maq.getQuantLaranjas()+"" );
            x.fecharArquivo();
        }
    }
    
    public MaquinaSuco ler()
    {
        MaquinaSuco maq = null;
        Arquivo x = new Arquivo("dados.txt");
        
        if (x.abrirLeitura())
        {
            int lotes = Integer.parseInt( x.lerLinha() );
            int nivelAcucar = Integer.parseInt( x.lerLinha() );
            int nivelAgua = Integer.parseInt( x.lerLinha() );     
            int quantEmbalagens = Integer.parseInt( x.lerLinha() );
            int quantLaranjas = Integer.parseInt( x.lerLinha() );
            x.fecharArquivo();
            
            maq = new MaquinaSuco(quantLaranjas, quantEmbalagens, nivelAcucar,
                                  nivelAgua, lotes);
            
        }
        else
        {
            maq = new MaquinaSuco();
        }
        return maq;
    }
    
    
    
}
