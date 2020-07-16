package frigorifico.apresentacao;

import everest.geral.Entrada;
import frigorifico.negocio.Sadia;

public class TelaFrigorifico
{
    private final Sadia maquina;
    
    public TelaFrigorifico(Sadia maquina)
    {
     this.maquina=maquina;   
    }
    
    public void Exibir()
    {
        maquina.nome=Entrada.leiaString("Digite seu nome:");
        System.out.println("Seja Bem-Vindo:"+" "+maquina.GetNome());
        
        char op = ' ';
        
        while (Character.toLowerCase(op) != 'x')
        {
            
            op = Entrada.leiaChar("M E N U\n\n"
                    + "[1] Adicionar Carnes\n"
                    + "[2] Adicionar Bebidas\n"
                    + "[3] Adicionar sobremesas\n"
                    + "[4] Iniciar o processo de congelamento \n"
                    + "[5] Consultar temperatura e status\n"  
                    + "[x] Sair do sistema");

            if (op == '1')
            {
                double kg = Entrada.leiaInt("Informe a quantidade (kg) de carnes:");
                if (maquina.setAdicionarCarne(kg))
                {
                    System.out.println("carnes adicionadas no compartimento com sucesso:");
                }
                else
                {
                    System.out.println("Reduza a sua quantidade de carnes:");
                }
            } 
            
            else if (op == '2')
            {
                double litros = Entrada.leiaInt("Informe a quantidade (litros) de bebidas:");
                if (maquina.setAdicionarBebidas(litros))
                {
                    System.out.println("Bebidas adiconado no comaprtimento com sucesso:");
                }
                else
                {
                    System.out.println("Reduza a sua quantidade de bebidas:");
                }
            }
            
            else if (op=='3')
            {
                double kg=Entrada.leiaInt("Informe a quantidade de sobremesas (kg):");
                if (maquina.setAdicionarSobremesas(kg))
                {
                    System.out.println("Sobremesas adicionado no compartimento com sucesso:");
                }
                else
                {
                    System.out.println("Reduza a sua quantidade de sobremesas:");
                }
            }
            
            else if (op == '4')
            {
                if (maquina.Setcongelar())
                {
                    System.out.println("Processo da operação realizada com sucesso:");
                } 
                else
                {
                    System.out.println("Falha na operação do processo:");
                }
            }
            
            else if (op == '5')
            {
                System.out.println("------ Maquina ------"+" "+"do(a)"+" "+maquina.nome);
                System.out.println("Carnes: " + maquina.getCompartimentoCarnes()+" kg. ");              
                System.out.println("Bebidas:  " + maquina.getNivelBebidas()+" litros.");
                System.out.println("Sobremesas:"+ maquina.getCompartimentoSobremesa()+"kg");
                System.out.println("Temperatura:"+maquina.getTemperatura()+"Graus");
            }
            else
            {
                System.out.println("Opção não encontrada, digite uma das alternativas válidas.");
            }
        }
    }   
}