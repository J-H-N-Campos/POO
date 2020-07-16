package Pratica_08;

public class museuPrograma
{
    public static void main(String[] args)
    {
        
    Galerias gm1=new Galerias();
    gm1.limite=50;
    gm1.qtdVisitantes=0;
    gm1.visitantesTotais=0;
    
    Galerias gm2=new Galerias();
    gm2.limite=50;
    gm2.qtdVisitantes=0;
    gm2.visitantesTotais=0;
    
    Museu m=new Museu();
    m.numerosPessoas();
    m.filaEspera();
    m.caixa();
    
    if(gm1.qtdVisitantes<50)
    {
        System.out.println("ok");
    }else{
        gm1=gm2;
    }
    if(gm2.qtdVisitantes<50)
    {
        System.out.println("ok");
    }else{
        gm2=gm1;
    }    
    System.out.println("Quantidade de pessoas na galeria 1:"+gm1);
    System.out.println("Quantidade de pessoas na galeria 2:"+gm2);
    System.out.println("Caixa,fila em espera e numeros de pessoas do museu:"+m);
    System.exit(0);
    }
}