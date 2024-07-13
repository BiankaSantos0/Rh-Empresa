import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main2 {

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    List<Vaga> vagas = new ArrayList<>();
    List<Pessoa> pessoas = new ArrayList<>();
    //Menu de acesso ao usuário. Enquanto for verdadeiro ele retornará ao menu. O while possibilita retornar infinitamente até que o usuário escolha
    //a opção "3" SAIR (BREAK).

    while (true) {
        System.out.println("Digite a opçao indicada para acessar:");
        System.out.println("( 1 ) Area Recrutador");
        System.out.println("( 2 ) Perfil Candidato");
        System.out.println("( 3 ) SAIR");
        System.out.println("( 4 ) SAIR");

        int opcao = scanner.nextInt();
        scanner.nextLine(); // consumir nova linha 
        //Selecionando a opção Área do Recrutador. Seguirá o fluxo do Recrutador.
        if (opcao == 1 ) {
        //Fluxo do Recrutador
        // Dados do Recrutador
                System.out.println ("Nome completo: ");
                String nome = scanner.nextLine();
                System.out.println ("email: ");
                String email = scanner.nextLine();
                System.out.println ("telefone com ddd: ");
                String telefone = scanner.nextLine();
                System.out.println ("endereco: ");
                String endereco = scanner.nextLine();
                System.out.println ("cpf: ");
                String cpf = scanner.nextLine();
                System.out.println ("Registro do Recrutador: ");
                String registro = scanner.nextLine();
                 //Método para instanciar pessoa-recrutador na lista pessoa.
                Pessoa pessoa = new Pessoa (nome,email, telefone, endereco, cpf);
                Recrutador recrutador = new Recrutador (registro, pessoa);
                //método para adicionar pessoa na lista pessoa.
                pessoas.add(pessoa);
                //Após preencher o cadastro do recrutador, o sistema mostrará outro menu "menuzinho do recrutador" com duas opcoes, 
                //1 - criar vaga ou 2 - gerenciar candidaturas.
                //Menuzinho ainda do Recrutador
                System.out.println ("1 Criar Vaga");
                System.out.println ("2 Gerenciar Candidaturas");

                int opcaoRecrutador = scanner.nextInt();
                scanner.nextLine();  // consumir nova linha 

                    if (opcaoRecrutador ==1){ 

                        //Criar Vaga
                        System.out.println ("Título da Vaga:  ");
                        String titulo = scanner.nextLine();   
                        System.out.println ("Razão Social:  ");
                        String razaoSocial = scanner.nextLine();
                        System.out.println ("Cnpj da Empresa:  ");
                        int cadastropj = scanner.nextInt();
                        System.out.println ("endereco da empresa:  ");
                        String enderecoEmpresa = scanner.nextLine();
                        System.out.println ("emailCorporativo:  ");
                        String emailCorporativo = scanner.nextLine();
                        System.out.println ("Modalidade da vaga:  ");
                        String modalidade = scanner.nextLine();  
                        // System.out.println ("descricao da Vaga:  ");
                        // String descricao = scanner.nextLine();   
                        System.out.println ("Requisito da Vaga:  ");
                        String requisito = scanner.nextLine();   
                        System.out.println ("Salário:  ");
                        int salario = scanner.nextInt();   
                        System.out.println ("Carga Horária:  ");
                        int cargaHoraria = scanner.nextInt(); 
                        scanner.nextLine();
                        //métodod para instaciar vaga
                        Empresa empresa = new Empresa(razaoSocial, cadastropj, enderecoEmpresa, emailCorporativo);
                        Vaga vaga = new Vaga(titulo, empresa, modalidade, requisito, salario, cargaHoraria, recrutador, EstadoVaga.ABERTO);
                       //métodod para adicionar nova vaga  na lista.
                        vagas.add(vaga);


                    System.out.println("Vaga criada com sucesso!");
                    
                //Menuzinho ainda do Recrutador opcaoRecrutador gerenciar candidatura - 2
                } else if (opcaoRecrutador == 2) {
                    // Gerenciar Candidaturas
                    // Listar vagas e permitir que o recrutador gerencie candidaturas
                }
            //VOLTAMOS AO MENU INICIAL. Agora o fluxo será do candidato.
            } else if (opcao == 2) {
                // Fluxo do candidato
                System.out.println("Nome do candidato:");
                String nome = scanner.nextLine();
                System.out.println("Email do candidato:");
                String email = scanner.nextLine();
                System.out.println("Telefone do candidato:");
                String telefone = scanner.nextLine();
                System.out.println("Endereço do candidato:");
                String endereco = scanner.nextLine();
                System.out.println("CPF do candidato:");
                String cpf = scanner.nextLine();
                //após informar seus dados ele terá que preencher o curriculo
                Pessoa pessoa = new Pessoa (nome, email, telefone, endereco, cpf);
                System.out.println ("Para se candidatar a vaga, preencha seu curriculo");
                scanner.nextLine();
                System.out.println("Formação do candidato:");
                String formacao = scanner.nextLine();
                System.out.println("Objetivo do candidato:");
                String objetivo = scanner.nextLine();
                System.out.println("Experiência do candidato:");
                String experiencia = scanner.nextLine();

                Curriculo curriculo = new Curriculo(formacao, objetivo, experiencia);
                Candidato candidato = new Candidato(pessoa, curriculo);
                pessoas.add(pessoa);
                //na sequencia do preenchimento do curriculo ele podera escolher uma vaga para se candidatar.
                
            } else if (opcao == 3) {
                break;
            }
        }

        scanner.close();
    }
}
// scanner.close();    