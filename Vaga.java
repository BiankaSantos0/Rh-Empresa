import java.util.List;
import java.util.ArrayList;

public class Vaga {
    private String titulo;
    private Empresa empresa;
    private String modalidade;
    private String requisito;
    private int salario;
    private int cargaHoraria;
    private Recrutador recrutador;
    private EstadoVaga estadoVaga;
    private List<Candidatura> candidaturas; 
    
//Trocar o atributo modalidade por descricao
public Vaga (String titulo, Empresa empresa, String modalidade, String requisito, int salario, int cargaHoraria, Recrutador recrutador, EstadoVaga estadoVaga){
    this.titulo = titulo;
    this.empresa = empresa;
    this.modalidade = modalidade;
    this.requisito = requisito;
    this.salario = salario;
    this.cargaHoraria = cargaHoraria;
    this.recrutador = recrutador;
    this.estadoVaga = estadoVaga;
    this.candidaturas = new ArrayList<>();
    
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getModalidade() {
    return modalidade;
}

public void setModalidade(String modalidade) {
    this.modalidade = modalidade;
}

public String getRequisito() {
    return requisito;
}

public void setRequisito(String requisito) {
    this.requisito = requisito;
}

public int getSalario() {
    return salario;
}

public void setSalario(int salario) {
    this.salario = salario;
}

public int getCargaHoraria() {
    return cargaHoraria;
}

public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
}

public List<Candidatura> getCandidaturas() {
    return candidaturas;
}

public void setCandidaturas(List<Candidatura> candidaturas) {
    this.candidaturas = candidaturas;
}

public Recrutador getRecrutador() {
    return recrutador;
}

public void setRecrutador(Recrutador recrutador) {
    this.recrutador = recrutador;
}

public EstadoVaga getEstadoVaga() {
    return estadoVaga;
}

public void setEstadoVaga(EstadoVaga estadoVaga) {
    this.estadoVaga = estadoVaga;
}

public Empresa getEmpresa() {
    return empresa;
}

public void editarEstadoVaga(EstadoVaga estado){
    this.estadoVaga = estado;
}

}

//Métodos a serem criados

//public void exibirVaga ();


//public void editarVaga();


//public void excluirVaga();


//public void editarStatusVaga();


      