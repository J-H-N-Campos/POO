package exemplos;

import everest.geral.Data;

public abstract class Pessoa
{
    protected String nome;
    private Data dtNasc;
    private String endereco;

    public Pessoa(String nome, Data dtNasc)
    {
        this.nome = nome;
        this.dtNasc = dtNasc;
    }   

    public Pessoa(String nome)
    {
        this.nome = nome;
    }

    public Pessoa(String nome, Data dtNasc, String endereco)
    {
        this.nome = nome;
        this.dtNasc = dtNasc;
        this.endereco = endereco;
    }
    
    
    
    
    
    public abstract double getValor();

    String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    
    
    public Data getDtNasc()
    {
        return dtNasc;
    }

    public void setDtNasc(Data dtNasc)
    {
        this.dtNasc = dtNasc;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        if (!nome.isEmpty())
        {
            this.nome = nome;
        }
    }
    
    
    
    
    
}
