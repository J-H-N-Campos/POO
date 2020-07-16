package frigorifico.negocio;

import everest.geral.Reservatorio;

public class Sadia
{
    private final Reservatorio carne;
    private final Reservatorio bebidas;
    private final Reservatorio sobremesas;
    private int temperatura;
    public String nome;
    
    public Sadia()
    {
        this.carne = new Reservatorio(500*1000);
        this.bebidas = new Reservatorio (100*1000);
        this.sobremesas = new Reservatorio (50*1000);
        this.temperatura =5;
        this.nome = nome;
    }
    
    public String GetNome()
    {
        return nome;
    }
    
    public int getTemperatura()
    {
        return temperatura;
    }
    
    public double getNivelBebidas()
    {
        return bebidas.getNivel()/1000D;
    }
    
    public double getCompartimentoCarnes()
    {
        return carne.getNivel()/1000D;
    }
    
    public double getCompartimentoSobremesa()
    {
        return sobremesas.getNivel()/1000D;
    }
    
    public boolean setAdicionarCarne(double kg)
    {
        return carne.adicionar((int)(kg*1000));
    }
    
    public boolean setAdicionarBebidas(double litros)
    {
        return bebidas.adicionar((int)(litros*1000));
    }
    
    public boolean setAdicionarSobremesas(double kg)
    {
        return sobremesas.adicionar((int)(kg*1000));
    }
    
    public boolean Setcongelar()
    {
     boolean ok=false;
     
     if(bebidas.getNivel()<=100*1000 && carne.getNivel()<=500*1000 && sobremesas.getNivel()<=50*1000)
             {
              bebidas.consumir(50*1000);
              carne.consumir(250*1000);
              sobremesas.consumir(10*1000);
              this.temperatura--;
              ok=true;
             }
     return ok;
    }
}