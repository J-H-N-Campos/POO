package everest.geral.exemplo;

import everest.geral.Arquivo;
import everest.geral.Data;

public class TesteArquivo
{
    public static void main(String[] args)
    {
        Data dt = new Data(20,5,1999);

        Arquivo arq = new Arquivo("teste.txt");
        
        arq.abrirEscrita();
        arq.escreverLinha( dt.obterDia()+"" );
        arq.escreverLinha( dt.obterMes()+"" );
        arq.escreverLinha( dt.obterAno()+"" );
        
        arq.fecharArquivo();
        
        /*
        Arquivo arq = new Arquivo("teste.txt");
        arq.abrirLeitura();
        int dia = Integer.parseInt( arq.lerLinha() );
        int mes = Integer.parseInt( arq.lerLinha() );
        int ano = Integer.parseInt( arq.lerLinha() );
        arq.fecharArquivo();
        
        Data dt = new Data(dia,mes,ano);
     
        System.out.println( dt.formatarData(1) );
        */
    }
}
