package maquinasorvete.persistencia;


import everest.geral.Arquivo;
import maquinasorvete.negocio.MaquinaSorvete;


/**
 *
 * @author mouriac
 */
public class MaquinaSorveteDaoTxt implements MaquinaSorveteDao
{

    @Override
    public void save(MaquinaSorvete maquina)
    {
        Arquivo x = new Arquivo("ms.txt");
        if (x.abrirEscrita())
        {
            x.escreverLinha( maquina.getQuantLeite()+"" );
            x.escreverLinha( maquina.getQuantEmulsificante()+"" );
            x.escreverLinha( maquina.getQuantEssenciaBaunilha()+"" );
            x.escreverLinha( maquina.getQuantEssenciaChocolate()+"" );
            x.escreverLinha( maquina.getContadorSorveteBaunilha()+"" );
            x.escreverLinha( maquina.getContadorSorveteChocolate()+"" );
            x.fecharArquivo();
        }
    }

    @Override
    public MaquinaSorvete load()
    {
        MaquinaSorvete ms = null;
        Arquivo x = new Arquivo("ms.txt");
        if (x.abrirLeitura())
        {
           int qL = Integer.parseInt( x.lerLinha() );
           int qE = Integer.parseInt( x.lerLinha() );
           int qEB = Integer.parseInt( x.lerLinha() );
           int qEC = Integer.parseInt( x.lerLinha() );
           int cB = Integer.parseInt( x.lerLinha() );
           int cC = Integer.parseInt( x.lerLinha() );
           ms = new MaquinaSorvete(qL,qE,qEB,qEC,cB,cC);
        }
        else
        {
            ms = new MaquinaSorvete();
        }
        return ms;
    }
    
}
