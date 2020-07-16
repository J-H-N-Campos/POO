package vale.refeicao.main;

import vale.refeicao.apresentacao.Tela;
import vale.refeicao.negocio.Valerefeicao;
import vale.refeicao.persistencia.ValeRefeicaoBD;

/** @author João de Campos**/

public class Main
{
    public static void main(String[] args)
    {
        ValeRefeicaoBD bd = new ValeRefeicaoBD();
        Valerefeicao vr = bd.Ler();
        
        if (vr == null)
        {
            vr = new Valerefeicao();
        }
        
        Tela tela = new Tela(vr);
        tela.setVisible(true);
    }
}
