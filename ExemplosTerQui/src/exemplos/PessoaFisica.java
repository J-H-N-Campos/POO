package exemplos;

import everest.geral.Data;

public class PessoaFisica extends Pessoa
{
    private String nomePai;
    private String nomeMae;
    private int cpf;

    public PessoaFisica(String n, Data dt, String nomePai,
            String nomeMae, int cpf)
    {
        super(n);
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.cpf = cpf;
    }

    public String getNome()
    {
        return super.nome;
    }
    
    public String getNomePai()
    {
        return nomePai;
    }

    public void setNomePai(String nomePai)
    {
        this.nomePai = nomePai;
    }

    public String getNomeMae()
    {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae)
    {
        this.nomeMae = nomeMae;
    }

    public int getCpf()
    {
        return cpf;
    }

    public void setCpf(int cpf)
    {
        this.cpf = cpf;
    }

    @Override
    public double getValor()
    {
        return 1000000;
    }
    
    
}
