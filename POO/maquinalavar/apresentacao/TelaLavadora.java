package maquinalavar.apresentacao;

import maquinalavar.negocio.Bosstemp;

public class TelaLavadora
{
    private Bosstemp maquina;

    public TelaLavadora(Bosstemp maquina)
    {
        this.maquina = maquina;
    }
    
    public void exibir()
    {
        char op = ' ';
        while (Character.toLowerCase(op) != 'x')
        {
            op = Entrada.leiaChar("M E N U\n\n"
                    + "[1] Colocar roupa\n"
                    + "[2] Colocar amaciante\n"
                    + "[3] Colocar sabão\n"
                    + "[4] Lavar\n"
                    + "[5] Retirar roupas\n"
                    + "[6] Consultar status\n"
                    + "[x] Sair do sistema");

            if (op == '1')
            {
                double kg = Entrada.leiaDouble("Informe peso (kg) das roupas");
                if (maquina.colocarRoupas(kg))
                {
                    System.out.println("Roupas estão no compartimento");
                }
                else
                {
                    System.out.println("As roupas estão lavadas ou o compartimento está lotado");
                }
            } 
            else if (op == '2')
            {
                int ml = Entrada.leiaInt("Informe quantidade (ml) de amaciante");
                if (maquina.colocarAmaciante(ml))
                {
                    System.out.println("Amaciante adiconado com sucesso");
                }
                else
                {
                    System.out.println("Compartimento cheio");
                }
            }
            else if (op == '3')
            {
                int gr = Entrada.leiaInt("Informe quantidade (gr) de sabão");
                if (maquina.colocarSabao(gr))
                {
                    System.out.println("Sabão adiconado com sucesso");
                }
                else
                {
                    System.out.println("Compartimento cheio");
                }
            }
            else if (op == '4')
            {
                if (maquina.lavar())
                {
                    System.out.println("Operação realizada com sucesso");
                } 
                else
                {
                    System.out.println("Falha na operação");
                }
            }
            else if (op == '5')
            {
                if (maquina.retirarRoupas())
                {
                    System.out.println("Operação realizada com sucesso");
                } 
                else
                {
                    System.out.println("Compartimento está vazio");
                }
            }
            else if (op == '6')
            {
                System.out.println("------ Maquina ------");
                System.out.println("Roupas:     " + maquina.getNivelRoupas()+" kg "+
                (maquina.isRoupaLavada() ? "Roupa lavada" : (maquina.getNivelRoupas()>0 ? "Roupa suja" : "")) );
                System.out.println("Amaciante:  " + maquina.getNivelAmaciante()+" ml" );
                System.out.println("Sabão:      " + maquina.getNivelSabao()+" g" );
            }
            else
            {
                System.out.println("Opção não encontrada, digite uma das alternativas válidas");
            }
        }
    }
}
