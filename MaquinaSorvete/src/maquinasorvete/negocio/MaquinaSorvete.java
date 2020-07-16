package maquinasorvete.negocio;

public class MaquinaSorvete
{
    private Reservatorio reservatorioLeite; //ml
    private Reservatorio reservatorioEmulsificante; // g
    private Reservatorio reservatorioEssenciaBaunilha; // ml
    private Reservatorio reservatorioEssenciaChocolate; // ml
    private int contadorSorveteBaunilha;
    private int contadorSorveteChocolate;

    public MaquinaSorvete()
    {
        this.reservatorioLeite = new Reservatorio(5000);
        this.reservatorioEmulsificante = new Reservatorio(7000);
        this.reservatorioEssenciaBaunilha = new Reservatorio(500);
        this.reservatorioEssenciaChocolate = new Reservatorio(500);
        this.contadorSorveteBaunilha = 0;
        this.contadorSorveteChocolate = 0;
    }

    public MaquinaSorvete(int quantLeite, int quantEmulsificante, int quantEssenciaBaunilha, int quantEssenciaChocolate, int contadorSorveteBaunilha, int contadorSorveteChocolate)
    {
        this.reservatorioLeite = new Reservatorio(5000,quantLeite);
        this.reservatorioEmulsificante = new Reservatorio(7000,quantEmulsificante);
        this.reservatorioEssenciaBaunilha = new Reservatorio(500,quantEssenciaBaunilha);
        this.reservatorioEssenciaChocolate = new Reservatorio(500,quantEssenciaChocolate);
        this.contadorSorveteBaunilha = contadorSorveteBaunilha;
        this.contadorSorveteChocolate = contadorSorveteChocolate;
    }

    public void reabastecerLeite()
    {
        this.reservatorioLeite.encher();
    }

    public void reabastecerEmulsificante()
    {
        this.reservatorioEmulsificante.encher();
    }

    public void reabastecerEssenciaBaunilha()
    {
        this.reservatorioEssenciaBaunilha.encher();
    }

    public void reabastecerEssenciaChocolate()
    {
        this.reservatorioEssenciaChocolate.encher();
    }
    
    public void reabastecerTudo()
    {
        this.reabastecerLeite();
        this.reabastecerEmulsificante();
        this.reabastecerEssenciaBaunilha();
        this.reabastecerEssenciaChocolate();
    }
    
    public boolean servirSorveteBaunilha()
    {
        boolean ok = false;
        if (this.reservatorioLeite.getNivel()>=25 && 
            this.reservatorioEmulsificante.getNivel()>=35 &&
            this.reservatorioEssenciaBaunilha.getNivel() >= 5)
        {
            this.reservatorioLeite.consumir(25);
            this.reservatorioEmulsificante.consumir(35);
            this.reservatorioEssenciaBaunilha.consumir(5);
            this.contadorSorveteBaunilha ++;
            ok = true;
        }
        return ok;
    }
    
    public boolean servirSorveteChocolate()
    {
        boolean ok = false;
        if (this.reservatorioLeite.getNivel()>=25 && 
            this.reservatorioEmulsificante.getNivel()>=35 &&
            this.reservatorioEssenciaChocolate.getNivel() >= 5)
        {
            this.reservatorioLeite.consumir(25);
            this.reservatorioEmulsificante.consumir(35);
            this.reservatorioEssenciaChocolate.consumir(5);
            this.contadorSorveteChocolate ++;
            ok = true;
        }
        return ok;
    }

    public int getQuantLeite()
    {
        return this.reservatorioLeite.getNivel();
    }

    public int getQuantEmulsificante()
    {
        return this.reservatorioEmulsificante.getNivel();
    }

    public int getQuantEssenciaBaunilha()
    {
        return this.reservatorioEssenciaBaunilha.getNivel();
    }

    public int getQuantEssenciaChocolate()
    {
        return this.reservatorioEssenciaChocolate.getNivel();
    }

    public int getContadorSorveteBaunilha()
    {
        return contadorSorveteBaunilha;
    }

    public int getContadorSorveteChocolate()
    {
        return contadorSorveteChocolate;
    }

    public Reservatorio getReservatorioLeite()
    {
        return reservatorioLeite;
    }

    public Reservatorio getReservatorioEmulsificante()
    {
        return reservatorioEmulsificante;
    }

    public Reservatorio getReservatorioEssenciaBaunilha()
    {
        return reservatorioEssenciaBaunilha;
    }

    public Reservatorio getReservatorioEssenciaChocolate()
    {
        return reservatorioEssenciaChocolate;
    }
    
    
    
}
