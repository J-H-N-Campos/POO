package exemplos;

import everest.geral.Data;

public class Main
{

    public static void main(String[] args)
    {
        Data dt = new Data(10,10,2000);
        
        
        Pessoa pf = new PessoaFisica("Juca",dt,"Ivo","Dulce",383);
        pf.getValor();
        
        
        System.out.println( pf.getNome() );
        
        
        
        //Pessoa pj = new PessoaJuridica();
        
        
        
        
    }
    
}
