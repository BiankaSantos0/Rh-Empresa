public class Curriculo {
    private String formacao;
    private String objetivo;
    private String experiencia;

    public Curriculo (String formacao, String objetivo, String experiencia){
        this.formacao = formacao;
        this.objetivo = objetivo;
        this.experiencia = experiencia;
    }
   
        public String getFormacao() {
            return formacao;
    }
 
        public void setFormacao(String formacao) {
            this.formacao = formacao;
    }
     
        public String getObjetivo() {
            return objetivo;
    }
       
        public void setObjetivo(String objetivo) {
            this.objetivo = objetivo;
    }
        
        public String getExperiencia() {
            return experiencia;
   }
       
        public void setExperiencia(String experiencia) {
            this.experiencia = experiencia;
    }
}
