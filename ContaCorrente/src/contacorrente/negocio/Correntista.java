package contacorrente.negocio;

import everest.geral.Data;


public class Correntista
{
    public static int getSequencial()
    {
        return sequencial;
    }

    public static void setSequencial(int aSequencial)
    {
        sequencial = aSequencial;
    }
    
    private int codigo;
    private String nome;
    private String endereco;
    private Data dataNascimento;
    
    private static int sequencial = 0;

    public Correntista(String nome, String endereco, Data dataNascimento)
    {
        this.codigo = ++sequencial;
        this.nome = nome;
        this.endereco = endereco;
        this.dataNascimento = dataNascimento;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public String getNome()
    {
        return nome;
    }

    public String getEndereco()
    {
        return endereco;
    }

    public Data getDataNascimento()
    {
        return dataNascimento;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public void setDataNascimento(Data dataNascimento)
    {
        this.dataNascimento = dataNascimento;
    }

}
