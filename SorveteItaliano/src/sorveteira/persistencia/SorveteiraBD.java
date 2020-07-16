package sorveteira.persistencia;

import everest.geral.Arquivo;
import sorveteira.negocio.Sorveteira;

public class SorveteiraBD
{
    public void Salvar(Sorveteira s)
    {
        Arquivo arq=new Arquivo ("sorveteira.txt");
        
        if(arq.abrirEscrita())
        {
            arq.escreverLinha(s.getSorvetechocolateVendidos()+"" );
            arq.escreverLinha(s.getSorveteBaunilhaVendidos()+"" );
            arq.escreverLinha(s.getNivelReservatorioLeite()+"" );
            arq.escreverLinha(s.getNivelReservatorioEmulsificante()+"" );
            arq.escreverLinha(s.getNivelReservatorioChocolate()+"" );
            arq.escreverLinha(s.getNivelReservatorioBaunilha()+"" );
            
            arq.fecharArquivo();
        }
    }
    
    public Sorveteira Ler()
    {
        Sorveteira s=null;
        Arquivo arq=new Arquivo("sorveteira.txt");
        
        if(arq.abrirLeitura())
        {
            int sorvChocoVen=Integer.parseInt(arq.lerLinha());
            int sorvBauVen=Integer.parseInt(arq.lerLinha());
            int rsvtoLeite=Integer.parseInt(arq.lerLinha());
            int rsvtoChocolate=Integer.parseInt(arq.lerLinha());
            int rsvtoBaunilha=Integer.parseInt(arq.lerLinha());
            double rsvtoEmulsificante=Double.parseDouble(arq.lerLinha());
            
            arq.fecharArquivo();
            
            s=new Sorveteira (sorvChocoVen,sorvBauVen,rsvtoLeite,rsvtoChocolate,
                              rsvtoBaunilha,rsvtoEmulsificante);
        }
        return s;
    }
}