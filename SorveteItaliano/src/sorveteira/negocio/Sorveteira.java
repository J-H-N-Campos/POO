package sorveteira.negocio;

import everest.geral.Reservatorio;

public class Sorveteira
{
    private Reservatorio reservatorioChocolate;
    private Reservatorio reservatorioBaunilha;
    private Reservatorio reservatorioEmulsificante;
    private Reservatorio reservatorioLeite;
    private int sorvetesVendidosChocolate;
    private int sorvetesVendidosBaunilha;

    public Sorveteira()
    {
        this.reservatorioChocolate = new Reservatorio(2500);
        this.reservatorioBaunilha = new Reservatorio(2500);
        this.reservatorioEmulsificante = new Reservatorio(2500);
        this.reservatorioLeite = new Reservatorio(10000);
        this.sorvetesVendidosBaunilha=0;
        this.sorvetesVendidosChocolate=0;
    }

    public Sorveteira(int sorvChocoVen, int sorvBauVen, int rsvtoLeite, int rsvtoChocolate,
                      int rsvtoBaunilha, double rsvtoEmulsificante)
    {    
        this.sorvetesVendidosBaunilha =sorvChocoVen;
        this.sorvetesVendidosChocolate = sorvBauVen;
        this.reservatorioLeite = new Reservatorio(10000);
        this.reservatorioChocolate = new Reservatorio(2500);
        this.reservatorioBaunilha = new Reservatorio(2500);
        this.reservatorioEmulsificante= new Reservatorio(2500);
        this.setInitValues(sorvChocoVen,sorvBauVen,rsvtoLeite,rsvtoChocolate,rsvtoBaunilha,rsvtoEmulsificante);
    }
    
    public int getSorvetechocolateVendidos()
    {
        return sorvetesVendidosChocolate;
    }
    
    public int getSorveteBaunilhaVendidos()
    {
        return sorvetesVendidosBaunilha;
    }

    public int getNivelReservatorioChocolate()
    {
        return reservatorioChocolate.getNivel();
    }

    public int getNivelReservatorioBaunilha()
    {
        return reservatorioBaunilha.getNivel();
    }

    public int getNivelReservatorioEmulsificante()
    {
        return reservatorioEmulsificante.getNivel();
    }

    public int getNivelReservatorioLeite()
    {
        return reservatorioLeite.getNivel();
    }
    
    public void getCompletarNivelChocolate()
    {
        reservatorioChocolate.completar();
    }
    
    public void getCompletarNivelBaunilha()
    {
        reservatorioBaunilha.completar();
    }
    
    public void getCompletarNivelEmulsificante()
    {
        reservatorioEmulsificante.completar();
    }
    
    public void completarNivelLeite()
    {
        reservatorioLeite.completar();
    }

    public boolean setAdicionarNivelChocolate(int ml)
    {
        return reservatorioChocolate.adicionar(ml);
    }

    public boolean setAdicionarNivelBaunilha(int ml)
    {
         return reservatorioBaunilha.adicionar(ml);
    }

    public boolean setAdicionarNivelEmulsificante(int kg)
    {
        return reservatorioEmulsificante.adicionar(kg);
    }

    public boolean setAdicionarNivelLeite(int ml)
    {
        return reservatorioLeite.adicionar(ml);
    }
    
    public boolean setConsumirNivelChocolate(int ml)
    {
        return reservatorioChocolate.consumir(ml);
    }
    
    public boolean setConsumirNivelBaunilha(int ml)
    {
        return reservatorioBaunilha.consumir(ml);
    }
    
    public boolean setConsumirNivelEmulsificante(int kg)
    {
        return reservatorioEmulsificante.consumir(kg);
    }
    
    public boolean setConsumirNivelLeite(int ml)
    {
        return reservatorioLeite.consumir(ml);
    }
    
    public boolean setFazerSorveteChocolate()
    {
        boolean ok=false;
        if(reservatorioChocolate.getNivel()>=5 && reservatorioLeite.getNivel()>=25 && reservatorioEmulsificante.getNivel()>=35)
        {
            reservatorioChocolate.consumir(5);
            reservatorioLeite.consumir(25);
            reservatorioEmulsificante.consumir(35);
            sorvetesVendidosChocolate++;
        ok=true;
        }
        return ok;
    }
    
    public boolean setFazerSorveteBaunilha()
    {
        boolean ok=false;
        if(reservatorioBaunilha.getNivel()>=5 && reservatorioLeite.getNivel()>=25 && reservatorioEmulsificante.getNivel()>=35)
        {
            reservatorioBaunilha.consumir(5);
            reservatorioLeite.consumir(25);
            reservatorioEmulsificante.consumir(35);
            sorvetesVendidosBaunilha++;
        ok=true;
        }
        return ok;
    }
    
     private void setInitValues(int sorvChocoVen, int sorvBauVen,int rsvtoLeite, int rsvtoChocolate,
                                int rsvtoBaunilha, double rsvorsvtoEmulsificante)
    {
        if (sorvChocoVen >= 0 && sorvBauVen>=0)
        {
            this.sorvetesVendidosBaunilha = sorvBauVen;
            this.sorvetesVendidosChocolate = sorvChocoVen;
        }
        
        this.reservatorioBaunilha.adicionar(rsvtoBaunilha);
        this.reservatorioLeite.adicionar(rsvtoLeite);
        this.reservatorioChocolate.adicionar(rsvtoChocolate);
        this.reservatorioEmulsificante.adicionar((int)rsvorsvtoEmulsificante);
    }
}