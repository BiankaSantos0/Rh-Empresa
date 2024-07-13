public class Candidatura {
    private Candidato candidato;
    private Vaga vagaPretendida;
    private StatusCandidatura statusCandidatura;
//Atributos Candidatura. Essa classe NÃO EXISTE SEM O CANDIDATO E A VAGA. O Status da Candidatura será alterado pelo Recrutador.
//Obs: para ele se candidatar ele precisará preencher o curriculo.

//Método Construtor Candidatura
    public Candidatura(Candidato candidato, Vaga vagaPretendida, StatusCandidatura statusCandidatura) {
        this.candidato = candidato;
        this.vagaPretendida = vagaPretendida;
        this.statusCandidatura = statusCandidatura;
    }

    public Candidato getCandidato() {
        return candidato;
    }   

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public StatusCandidatura getStatusCandidatura() {
        return statusCandidatura;
    }

    public void setStatusCandidatura(StatusCandidatura statusCandidatura) {
        this.statusCandidatura = statusCandidatura;
    }

    public Vaga getVagaPretendida() {
        return vagaPretendida;
    }

    public void setVagaPretendida(Vaga vagaPretendida) {
        this.vagaPretendida = vagaPretendida;
    }
}
