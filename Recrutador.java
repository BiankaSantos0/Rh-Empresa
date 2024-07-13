public class Recrutador {
//Recrutador herda de pessoa. O atributo registro criei para o sistema incrementar.
    private String registro;
    private Pessoa pessoa;

//Método constutor da classe.    
public Recrutador(String registro, Pessoa pessoa ) {
     this.registro = registro;
     this.pessoa = pessoa;
}
// MÉTODOS DE ACESSO. Criei todos publicos para podererm ser acessados por outras classes.
 public String getRegistro() {
    return registro;
}

public void setRegistro(String registro) {
    this.registro = registro;
}

public Pessoa getPessoa() {
    return pessoa;
}

public void setPessoa(Pessoa pessoa) {
    this.pessoa = pessoa;

}

//Métodos para gerenciar vagas e candidaturas
public void selecionarCandidato (Candidato candidato) {
//Implementação para selecionar candidatos
}

public void editarEstadoVaga (Vaga vaga, EstadoVaga estadoVaga){
    vaga.setEstadoVaga (estadoVaga);
} 

public void gerenciarCandidaturas(Vaga vaga) {
// Implementação para gerenciar candidaturas
}

public void editarStatusCandidatura (Candidatura candidatura, StatusCandidatura statusCandidatura){
    candidatura.setStatusCandidatura (statusCandidatura);
}

public void listarCandidatura () {
// Implementação para listar candidatos a vagas
}
}

  