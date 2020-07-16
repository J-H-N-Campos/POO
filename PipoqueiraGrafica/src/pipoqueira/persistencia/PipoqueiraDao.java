package pipoqueira.persistencia;

import everest.geral.Arquivo;
import pipoqueira.negocio.Pipoqueira;

public class PipoqueiraDao
{
    public void salvar(Pipoqueira p)
    {
        Arquivo arq = new Arquivo("pipoqueira.txt");
        
        if (arq.abrirEscrita())
        {
            arq.escreverLinha( p.getValorPipocaPequena()+"" );
            arq.escreverLinha( p.getValorPipocaGrande()+"" );
            arq.escreverLinha( p.getValorVendido()+"" );
            arq.escreverLinha( p.getNivelPipoca()+"" );
            arq.escreverLinha( p.getNivelAcucar()+"" );
            arq.escreverLinha( p.getNivelSal()+"" );
            
            arq.fecharArquivo();
        }
    }
    
    public Pipoqueira ler()
    {
        Pipoqueira p = null;
        Arquivo arq = new Arquivo("pipoqueira.txt");
        
        if (arq.abrirLeitura())
        {
            double vlrPipocaPequena = Double.parseDouble( arq.lerLinha() );
            double vlrPipocaGrande = Double.parseDouble( arq.lerLinha() );
            double vlrVendido = Double.parseDouble( arq.lerLinha() );
            double nivelPipoca = Double.parseDouble( arq.lerLinha() );
            double nivelAcucar = Double.parseDouble( arq.lerLinha() );
            int nivelSal = Integer.parseInt( arq.lerLinha() );
            
            arq.fecharArquivo();
            
            p = new Pipoqueira( vlrPipocaPequena, vlrPipocaGrande, 
                    vlrVendido, nivelPipoca, nivelAcucar, nivelSal );
            
        }
        return p;
    }
}
