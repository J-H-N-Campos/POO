package Container.persistencia;

import Container.negocio.Container;
import everest.geral.Arquivo;


public class ContainerBD
{
    public void salvar(Container c)
    {
        Arquivo arq = new Arquivo("Container.txt");
        
        if (arq.abrirEscrita())
        {
            arq.escreverLinha( c.carregarObjetos()+"" );
            arq.escreverLinha( c.descarregarObjetos()+"" );
            arq.escreverLinha( c.getCaixaCone()+"" );
            arq.escreverLinha( c.getCaixaEsferica()+"" );
            arq.escreverLinha( c.getCaixaQuadradada()+"" );
            arq.escreverLinha( c.getPeso()+"" );
            arq.escreverLinha( c.getVolume()+"" );
            arq.escreverLinha( c.getQtdCargas()+"" );
            arq.escreverLinha( c.getPrecos()+"" );
            
            arq.fecharArquivo();
        }
    }
    
    public Container ler()
    {
        Container c = null;
        Arquivo arq = new Arquivo("Container.txt");
        
        if (arq.abrirLeitura())
        {
            double caixaQuadrada = Double.parseDouble(arq.lerLinha() );
            double caixaEsferica = Double.parseDouble( arq.lerLinha() );
            double caixaCone = Double.parseDouble( arq.lerLinha() );
            int qtdCargas = Integer.parseInt( arq.lerLinha() );
            int nivelAcucar = Integer.parseInt( arq.lerLinha() );
            int nivelSal = Integer.parseInt( arq.lerLinha() );
            int pesoTotal = Integer.parseInt( arq.lerLinha() );
            int volumeTotal = Integer.parseInt( arq.lerLinha() );
            int somaPreco = Integer.parseInt( arq.lerLinha() );
            
            arq.fecharArquivo();
            
            c = new Container(qtdCargas, pesoTotal, volumeTotal, somaPreco, caixaQuadrada,
                    caixaCone, caixaEsferica );
            
        }
        return c;
    }
}