package maquinasorvete;

import autenticador.Autenticavel;
import maquinasorvete.apresentacao.Tela;
import maquinasorvete.negocio.MaquinaSorvete;
import maquinasorvete.persistencia.MaquinaSorveteDao;
import maquinasorvete.persistencia.MaquinaSorveteDaoTxt;

public class Sistema implements Autenticavel
{

    @Override
    public void inicializar()
    {
        MaquinaSorveteDao dao = new MaquinaSorveteDaoTxt();
        MaquinaSorvete ms = dao.load();
        
        Tela t = new Tela(ms);
        t.setVisible(true);
    }
    
}
