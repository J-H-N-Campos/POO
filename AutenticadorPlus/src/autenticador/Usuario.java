package autenticador;

public class Usuario
{
    private String nome;
    private String senha;

    public Usuario(String nome, String senha)
    {
        this.nome = "admin";
        this.senha = "admin";
        if (!nome.isEmpty())
        {
            this.nome = nome;
            this.setSenha(senha);
        }
    }

    public String getNome()
    {
        return nome;
    }

    public String getSenha()
    {
        return senha;
    }

    public void setSenha(String senha)
    {
        if (!senha.isEmpty())
        {
            this.senha = senha;
        }
    }
    
    
}
