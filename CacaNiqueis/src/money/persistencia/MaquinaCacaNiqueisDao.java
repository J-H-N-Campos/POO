/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package money.persistencia;

import everest.geral.Arquivo;
import money.negocio.MaquinaCacaNiqueis;

/**
 *
 * @author mouriac
 */
public class MaquinaCacaNiqueisDao
{
    public void salvar(MaquinaCacaNiqueis maq)
    {
        Arquivo x = new Arquivo("dados.txt");
        
        if (x.abrirEscrita())
        {
            x.escreverLinha(maq.getContadorApostas()+"");
            x.escreverLinha(maq.getPremiosDistribuidos()+"");
            x.escreverLinha(maq.getSaldoCaixa()+"");
            x.fecharArquivo();
        }
        
    }
    
    public MaquinaCacaNiqueis ler()
    {
        MaquinaCacaNiqueis maq = new MaquinaCacaNiqueis();
        
        Arquivo x = new Arquivo("dados.txt");
        if (x.abrirLeitura())
        {
            int contador = Integer.parseInt( x.lerLinha() );
            double premio = Double.parseDouble( x.lerLinha() );
            double saldo = Double.parseDouble( x.lerLinha() );
            
            maq = new MaquinaCacaNiqueis(saldo, contador, premio);
            x.fecharArquivo();
        }
        return maq;
    }
}
