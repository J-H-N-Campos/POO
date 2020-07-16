package batatasfritas.persistencia;

import batatasfritas.negocio.BatatasFritas;
import everest.geral.Arquivo;

public class batatasFritasBD
{
    public void Salvar(BatatasFritas b)
    {
        Arquivo arq=new Arquivo ("batatas.txt");
        
        if(arq.abrirEscrita())
        {
            arq.escreverLinha(b.getDepositoBatatas()+"" );
            arq.escreverLinha(b.getLotes()+"" );
            arq.escreverLinha(b.getNivelOleo()+"" );
            
            arq.fecharArquivo();
        }
    }
    
    public BatatasFritas Ler()
    {
        BatatasFritas b=null;
        Arquivo arq=new Arquivo("batatas.txt");
        
        if(arq.abrirLeitura())
        {
            
            double qtdBatatas=Double.parseDouble(arq.lerLinha());
            int lotes=Integer.parseInt(arq.lerLinha());
            double nivelOleo=Double.parseDouble(arq.lerLinha());
            
            arq.fecharArquivo();
            
            b =new BatatasFritas (qtdBatatas, lotes, (int) nivelOleo);
        }
        return b;
    }
}
