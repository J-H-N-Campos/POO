package autenticador.negocio;

import autenticador.apresentacao.TelaAutenticacao;

public class Lancador
{
    private Autenticavel sistema;

    public Lancador(Autenticavel sistema)
    {
        this.sistema = sistema;
    }
    
    public void executar()
    {
        Autenticador aut = new Autenticador(sistema);
        TelaAutenticacao t = new TelaAutenticacao(aut);
        t.setVisible(true);
    }  
}