/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package everest.container;

/**
 *
 * @author mouriac
 */
public class TroncoCone implements Transportavel
{
    private double raioBaseMaior;
    private double raioBaseMenor;
    private double altura;
    private String descricao;
    private double preco;
    private double peso;    

    public TroncoCone(double raioBaseMaior, double raioBaseMenor, double altura)
    {
        this.raioBaseMaior = raioBaseMaior;
        this.raioBaseMenor = raioBaseMenor;
        this.altura = altura;
        this.descricao = "Cone ["+raioBaseMaior+";"+raioBaseMenor+";"+altura+"]";
        this.preco = 0;
        this.peso = 0;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        if (altura > 0)
        {
            this.altura = altura;
        }
    }

    public double getRaioBaseMaior()
    {
        return raioBaseMaior;
    }

    public void setRaioBaseMaior(double raioBaseMaior)
    {
        if (raioBaseMaior > 0)
        {
            this.raioBaseMaior = raioBaseMaior;
        }
    }

    public double getRaioBaseMenor()
    {
        return raioBaseMenor;
    }

    public void setRaioBaseMenor(double raioBaseMenor)
    {
        if (raioBaseMenor >= 0)
        {
            this.raioBaseMenor = raioBaseMenor;
        }
    }
    
    public void setDescricao(String descricao)
    {
        if (!descricao.isEmpty())
        {
            this.descricao = descricao;
        }
    }

    public void setPreco(double preco)
    {
        if (preco >= 0)
        {
            this.preco = preco;
        }
    }

    public void setPeso(double peso)
    {
        if (peso > 0)
        {
            this.peso = peso;
        }
    }
    
    public String getDescricao()
    {
        return descricao;
    }

    public double getPreco()
    {
        return preco;
    }

    public double getPeso()
    {
        return peso;
    }
    
    public double getVolume()
    {
        return (Math.PI*this.altura/3)*(Math.pow(this.raioBaseMaior, 2) + this.raioBaseMaior*this.raioBaseMenor + Math.pow(this.raioBaseMenor, 2));
    }
}
