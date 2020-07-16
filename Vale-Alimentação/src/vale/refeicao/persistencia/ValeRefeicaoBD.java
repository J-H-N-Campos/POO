package vale.refeicao.persistencia;

import everest.geral.Arquivo;
import vale.refeicao.negocio.Valerefeicao;

public class ValeRefeicaoBD
{
    public void Salvar(Valerefeicao va)
    {
        Arquivo arq = new Arquivo ("Vale-Refeição.txt");
        
        if(arq.abrirEscrita())
        {
            arq.escreverLinha(va.getCaixa()+"" );
            arq.escreverLinha(va.getPreco()+"" );
            arq.escreverLinha(va.getValeRefeicao()+"" );
            arq.escreverLinha(va.getValeSolicitacao()+"" );
            arq.escreverLinha(va.getQuantidadeValeGeral()+"" );
            
            arq.fecharArquivo();
        }
    }
    
    public Valerefeicao Ler()
    {
        Valerefeicao va = null;
        Arquivo arq = new Arquivo("Vale-Refeição.txt");
        
        if(arq.abrirLeitura())
        {
            int valeSolicitacao = Integer.parseInt(arq.lerLinha());
            int valeRefeicao = Integer.parseInt(arq.lerLinha());
            int valeGeral = Integer.parseInt(arq.lerLinha());
            double saldoCaixa = Double.parseDouble(arq.lerLinha());
            double valor = Double.parseDouble(arq.lerLinha());
            
            arq.fecharArquivo();
            
            va = new Valerefeicao ( valeSolicitacao, valeRefeicao, valeGeral, saldoCaixa, valor);
        }
        return va;
    }
}

