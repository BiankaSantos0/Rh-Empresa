import java.util.List;
import java.util.ArrayList;

public class Candidato {
//Classe CANDIDATO possui relacao de HERANÇA com a classe PESSOA E AGREGAÇAO com a classe CURRICULO. Para o candidato existir
//não precisa do curriculo.
    private Pessoa pessoa;
    private Curriculo curriculo;
    private List<Vaga> vagas;
    
//Método construtor da classe. O candidato é uma pessoa que precisa cadastrar o curriculo.
    public Candidato (Pessoa pessoa, Curriculo curriculo ) {
        this.pessoa = pessoa;
        this.curriculo = curriculo; 
        this.vagas = new ArrayList<>();
    }
// MÉTODOS DE ACESSO. Criei todos publicos para podererm ser acessados por outras classes.
    public Curriculo getCurriculo() {
        return curriculo;
    }

    public void setCurriculo(Curriculo curriculo) {
        this.curriculo = curriculo;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }

    public void setVagas(List<Vaga> vagas) {
        this.vagas = vagas;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

//Método para criar o curriculo.                    
    public void criarCurriculo (String formacao, String objetivo, String experiencia) {
        this.curriculo = new Curriculo (formacao, objetivo, experiencia);
    }

    public void atualizarCurriculo (String formacao, String objetivo, String experiencia){
        this.curriculo.setFormacao (formacao);
        this.curriculo.setObjetivo(objetivo);
        this.curriculo.setExperiencia (experiencia);
    }

    public void listarVaga (){
// Implementacao para listar todas as vagas  
}
}
    