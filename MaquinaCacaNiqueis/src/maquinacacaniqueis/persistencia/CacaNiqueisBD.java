package maquinacacaniqueis.persistencia;

import everest.geral.Arquivo;
import maquinacacaniqueis.negocio.CacaNiqueis;

public class CacaNiqueisBD
{
    public void Salvar(CacaNiqueis x)
    {
        Arquivo arq = new Arquivo ("Caça-Níqueis.txt");
        
        if(arq.abrirEscrita())
        {
            arq.escreverLinha(x.getNumeroJogadas()+"" );
            arq.escreverLinha(x.getCaixa()+"" );
            arq.escreverLinha(x.getPremiacao()+"" );
            
            arq.fecharArquivo();
        }
    }
    
    public CacaNiqueis Ler()
    {
        CacaNiqueis x = null;
        Arquivo arq = new Arquivo("Caça-Níqueis.txt");
        
        if(arq.abrirLeitura())
        {
            int qtdJogadas = Integer.parseInt(arq.lerLinha());
            double  caixaTotal= Double.parseDouble(arq.lerLinha());
            double premios = Double.parseDouble(arq.lerLinha());
            
            arq.fecharArquivo();
            
            x = new CacaNiqueis (qtdJogadas, caixaTotal,(int) premios);
        }
        return x;
    }
}