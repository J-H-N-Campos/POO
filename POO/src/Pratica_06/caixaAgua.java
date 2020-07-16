
package Pratica_06;

public class caixaAgua 
{
    int capacidade=2500;
    int totalConsumido;
    int nivelAtual;
    double preco;
    
public void aumentarCapacidade()
    {
        if (capacidade>=0)
        {
            capacidade++;
        }
    }
public void diminuirCapacidade()
{
    if (capacidade<=500)
    {
        capacidade--;
    }
}
public boolean totalConsumido(int litros)
{
     boolean ok= false;
        if (litros>=1 && litros<=2500)
        {
            capacidade=litros;
            ok=true;
        }
        return ok;
    }
public int nivelAtual(int litros)
{
    return capacidade;
}
public boolean precoAgua (int preco)
{
    boolean ok=false;
    if (preco>=0)
    {
        ok=true;
    }
    return ok;
}
}