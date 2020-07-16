package exemplos;

import everest.geral.Data;

public class PessoaJuridica extends Pessoa
{
    private String nomeFantasia;
    private int cnpj;

    public PessoaJuridica(String nome, Data dtNasc, String nomeFantasia, int cnpj)
    {
        super(nome, dtNasc);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia()
    {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia)
    {
        this.nomeFantasia = nomeFantasia;
    }

    public int getCnpj()
    {
        return cnpj;
    }

    public void setCnpj(int cnpj)
    {
        this.cnpj = cnpj;
    }

    @Override
    public double getValor()
    {
        return 89;
    }
    
    
}
