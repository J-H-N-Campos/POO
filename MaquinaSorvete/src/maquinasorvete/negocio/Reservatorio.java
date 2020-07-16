package maquinasorvete.negocio;

/**
 * Modela o funcionamento de um reservatório de qualquer substância.
 * O volume do reservatório é dado somente em inteiros.
 * @author mouriac
 */
public class Reservatorio
{
    private int capacidadeMaxima;
    private int nivel;

    /**
     * Gera um novo objeto dessa classe. O nível do reservatório 
     * é inicializado com zero.
     * @param capacidadeMaxima o tamanho máximo
     */
    public Reservatorio(int capacidadeMaxima)
    {
        this.capacidadeMaxima = capacidadeMaxima;
        this.nivel = 0;
    }

    public Reservatorio(int capacidadeMaxima, int nivel)
    {
        this.capacidadeMaxima = capacidadeMaxima;
        this.nivel = nivel;
    }

    public int getNivel()
    {
        return nivel;
    }

    public void encher()
    {
        nivel = this.capacidadeMaxima;
    }
    
    public boolean consumir(int quant)
    {
        boolean ok = false;
        if (nivel >= quant)
        {
            nivel -= quant;
            ok = true;
        }
        return ok;
    }
    

    public int getCapacidadeMaxima()
    {
        return capacidadeMaxima;
    }

    
    
    
}
