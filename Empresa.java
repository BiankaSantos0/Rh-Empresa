public class Empresa {
    private String razaoSocial;
    private int cadastropj;
    private String endereco;
    private String emailCorporativo;
    
    public Empresa (String razaoSocial, int cadastropj, String endereco, String emailCorporativo){
        this.razaoSocial = razaoSocial;
        this.cadastropj = cadastropj;
        this.endereco = endereco;
        this.emailCorporativo =  emailCorporativo;
    } 
 
    public String getRazaoSocial() {
        return razaoSocial;
    }
   
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public int getcadastropj() {
        return cadastropj;
    }
  
    public void setcadastropj(int cadastropj) {
        this.cadastropj = cadastropj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   
    public String getEmailCorporativo() {
        return emailCorporativo;
    }

    public void setEmailCorporativo(String emailCorporativo) {
        this.emailCorporativo = emailCorporativo;
    }
}