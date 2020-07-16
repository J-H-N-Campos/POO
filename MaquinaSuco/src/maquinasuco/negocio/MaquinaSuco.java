package maquinasuco.negocio;

import everest.geral.Reservatorio;

/**
 * Uma classe que modela o funcionamento de uma máquina de suco.
 * @author mouriac
 */
public class MaquinaSuco
{
    private Reservatorio estoqueLarajas;
    private Reservatorio estoqueEmbalagens;
    private Reservatorio estoqueAcucar;
    private Reservatorio reservatorioAgua;
    private int contatorLotesProduzidos;

    /**
     * Cria uma máquina de suco com estado inicial zerado.
     */
    public MaquinaSuco()
    {
        this.estoqueLarajas = new Reservatorio( 10000 );
        this.estoqueEmbalagens = new Reservatorio( 2000 );
        this.estoqueAcucar = new Reservatorio( 5000 );
        this.reservatorioAgua = new Reservatorio( 500000 );
        this.contatorLotesProduzidos = 0;
    }

    public void zerarContador()
    {
        this.contatorLotesProduzidos = 0;
    }
    
    /**
     * Cria uma máquina de suco com estado inicial conforme
     * os níveis e quantidades indicados.
     * @param quantLarajas quantidade de laranjas disponíveis para produção de sucos
     * @param quantEmbalagens quantidade de embalagens disponíveis para produção de lotes de suco
     * @param nivelAcucar nível de açucar disponível para produzir suco
     * @param nivelAgua nível de água no reservatório
     * @param contatorLotesProduzidos número de lotes já produzidos
     */
    public MaquinaSuco(int quantLarajas, int quantEmbalagens, int nivelAcucar, 
                       int nivelAgua, int contatorLotesProduzidos)
    {
        this.estoqueLarajas = new Reservatorio( 10000, quantLarajas );
        this.estoqueEmbalagens = new Reservatorio( 2000, quantEmbalagens );
        this.estoqueAcucar = new Reservatorio( 5000, nivelAcucar );
        this.reservatorioAgua = new Reservatorio( 500000, nivelAgua );
        this.contatorLotesProduzidos = contatorLotesProduzidos;
    }

    /**
     * Retorna a quantidade de lotes já produzidos.
     * @return lotes produzidos
     */
    public int getContatorLotesProduzidos()
    {
        return contatorLotesProduzidos;
    }

    
     /* Retorna o nível de açucar do reservatório.
     * @return nível de açucar*/
     
    public int getNivelAcucar()
    {
        return estoqueAcucar.getNivel();
    }

    public int getQuantEmbalagens()
    {
        return estoqueEmbalagens.getNivel();
    }

    public int getQuantLaranjas()
    {
        return estoqueLarajas.getNivel();
    }

    public int getNivelAgua()
    {
        return reservatorioAgua.getNivel();
    }

    public void encherReservatorioAcucar()
    {
        estoqueAcucar.completar();
    }

    public void carregarEmbalagens()
    {
        estoqueEmbalagens.completar();
    }

    public void encherReservatorioLaranjas()
    {
        estoqueLarajas.completar();
    }

    public void encherReservatorioAgua()
    {
        reservatorioAgua.completar();
    }

    public boolean produzirLoteSuco()
    {
        boolean ok = false;
        
        int sucoPorLaranja = (int)(Math.random()*41+80);
        int quantAguaNecessaria = 12000 - (sucoPorLaranja*100);
        
        if (this.getQuantLaranjas() >= 100 &&
            this.getNivelAcucar() >= 30 &&
            this.getQuantEmbalagens() >= 12 &&
            this.getNivelAgua() >= quantAguaNecessaria )
        {
            this.estoqueAcucar.consumir(30);
            this.estoqueEmbalagens.consumir(12);
            this.estoqueLarajas.consumir(100);
            this.reservatorioAgua.consumir(quantAguaNecessaria);
            this.contatorLotesProduzidos ++;
            ok = true;
        }
        return ok;
    }
    
    
}
