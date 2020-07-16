package maquinasorvete.persistencia;

import maquinasorvete.negocio.MaquinaSorvete;

public interface MaquinaSorveteDao
{
    public void save(MaquinaSorvete maquina);
    public MaquinaSorvete load();
}
