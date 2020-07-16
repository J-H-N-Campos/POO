package batatasfritas.negocio;

public class BatatasFritas
{
    private final Reservatorio tachoOleo;
    private final Reservatorio depositoBatatas;
    private int  lotes;
    
    public BatatasFritas()
    {
        this.tachoOleo = new Reservatorio(50*1000);
        this.depositoBatatas = new Reservatorio (40*1000);
        this.lotes = 0;
    }
    
    public BatatasFritas( double nivelOleo, int qtdBatatas, int lotes)
    {       
        this.depositoBatatas = new Reservatorio (4000);
        this.tachoOleo = new Reservatorio (5000);
        this.lotes = lotes;
        this.setInitValues(qtdBatatas, lotes, nivelOleo);
    }
    
    public double getNivelOleo()
    {
        return tachoOleo.getNivel()/1000D;
    }
    
    public int getLotes()
    {
        return lotes;
    }

    public double getDepositoBatatas()
    {
        return depositoBatatas.getNivel()/1000D;
    }
    
    public void completarBatatas()
    {
        depositoBatatas.completar();
    }
    
    public boolean colocarBatatasFritas(double kg)
    {
        return depositoBatatas.adicionar((int)(kg*1000));
    }
    
    public boolean colocarOleo(double litros)
    {
     return tachoOleo.adicionar((int)(litros*1000));
    }
    
    public void completarOleo()
    {
        tachoOleo.completar();
    }
    
    public boolean fritar()
    {
        boolean ok=false;
        
        if(tachoOleo.getNivel()>=20 && depositoBatatas.getNivel()>=55)
        {
            tachoOleo.consumir(5*1000);
            depositoBatatas.consumir(55*1000);
            this.lotes++;  
            ok = true;
        }
        return ok;
    }
    
    private void setInitValues(int qtdBatatas, int lotes, double nivelOleo)
    {
        if (lotes == 0)
        {
            this.lotes = lotes;
        }
        this.depositoBatatas.adicionar(qtdBatatas*1000 );
        this.tachoOleo.adicionar((int) (nivelOleo*1000));
    }
}