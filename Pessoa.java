public class Pessoa {
// Atributos Pessoa
    private String nome;
    private String email;
    private String telefone;
    private String endereco;
    private String cpf;

//Método Construtor 
    public Pessoa ( String nome, String email, String telefone, String endereco, String cpf){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf; 
    
    }
// MÉTODOS DE ACESSO. Criei todos públicos para poder serem acessados por outras classes.
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getTelefone() {
        return telefone;
    }
   
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}