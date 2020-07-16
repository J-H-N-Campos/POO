package Pratica_08;

public class PipoqueiraMain
{
    public static void main(String[] args)
    {
        Reservatorio rpip = new Reservatorio();
        rpip.capacidade = 10000;
        rpip.nivel = 0;
        
        Reservatorio ra = new Reservatorio();
        ra.capacidade = 5000;
        ra.nivel = 0;
        
        Reservatorio rs = new Reservatorio();
        rs.capacidade = 1000;
        rs.nivel = 0;
                
        Pipoqueira p = new Pipoqueira();
        p.valorVendido = 0;
        p.valorPipocaGrande = 5.00;
        p.valorPipocaPequena = 3.00;
        p.depositoAcucar = ra;
        p.depositoMilho = rpip;
        p.depositoSal = rs;
        
        p.abastecerAcucar(3);
        p.abastecerMilho(5);
        p.abastecerSal(250);
        
        if (p.servirPipocaDocePequena())
        {
            System.out.println("sucesso");
        }
        else
        {
            System.out.println("deu m");
        }
        
        System.out.println("Vendas: "+p.consultarValorVendido());
        
        System.exit(0);
        
        
    }
}