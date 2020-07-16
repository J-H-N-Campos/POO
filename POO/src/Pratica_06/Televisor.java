
package Pratica_06;

public class Televisor
{
    int volume;
    int canal;
    boolean ligado;
    
    public void aumentarVolume()
    {
        if (volume < 50)
        {
            volume ++;
        }
    }
    
    public void diminurVolume()
    {
        if (volume > 0)
        {
            volume --;
        }
    }
         
    public void avancarCanal()
    {
        if (canal < 50)
        {
            canal ++;
        }
    }
    
    public void retrocederCanal()
    {
        if (canal > 1)
        {
            canal --;
        }
    }
    
    public boolean trocarCanal(int novoCanal)
    {
        boolean ok = false;
        if (novoCanal >= 1 && novoCanal <= 50)
        {
            canal = novoCanal;
            ok = true;
        }
        return ok;
    }
    
    public void power()
    {
        ligado = !ligado;
    }
}