import java.util.Scanner;

public class App {
    static Turma[] turmas = new Turma[10];
    // static Aluno alunos = new Aluno;
    static int quantidadeTurma = 0;
    static int quantidadeEstudantes = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opcao = 0;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            roteador(opcao);
        } while (opcao != 0);
    }

    public static void roteador(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarTurma();
                break;
            case 2:
                cadastrarCampus();
                break;
            case 3:
                cadastrarCurso();
                break;
            case 4:
                cadastrarAluno();
                break;
            case 5:
                cadastrarMatricula();
                break;    
            case 6:
                gerarRelatorio();
                break;
            default:
                if (opcao != 0) {
                    System.out.println("Opção inválida");
                }
                break;
        }
    }

    public static void gerarRelatorio() {
        for (int i = 0; i < quantidadeTurma; i++) {
            System.out.println("Nome turma: "+ turmas[i].nome);
            System.out.println("Numero minimo: "+ turmas[i].numeroMinimo);
            System.out.println("Ano de ingresso: "+ turmas[i].anoIngresso);
        }
    }

    public static void cadastrarTurma() {
        scanner.nextLine();//apaga o enter (\n)
        Turma turma = new Turma();
        System.out.println("Digite o nome da turma: ");
        turma.nome = scanner.nextLine();
        System.out.println("Digite a numero minimo de alunos: ");
        turma.numeroMinimo = scanner.nextInt();
        System.out.println("Digite o ano de ingresso: ");
        turma.anoIngresso = scanner.nextInt();
        turmas[quantidadeTurma] = turma;
        quantidadeTurma++;
    }

    public static void cadastrarCampus(){
        scanner.nextLine();
        Campus campus = new Campus();
        System.out.println("Informe o nome do campus: ");
        campus.nome = scanner.nextLine();
        System.out.println("Informe o endereço do campus: ");
        campus.endereco = scanner.nextLine();
        System.out.println("Informe a cidade do campus: ");
        campus.cidade = scanner.nextLine();

    }
      public static void cadastrarCurso(){
        scanner.nextLine();
        Curso curso = new Curso();
        System.out.println("Informe o nome do curso: ");
        curso.nome = scanner.nextLine();
        System.out.println("Informe a duração do curso: ");
        curso.duracao = scanner.nextLine();
        System.out.println("Informe a modalidade do curso: ");
        curso.modalidade = scanner.nextLine();

    }

    public static void cadastrarAluno(){
        scanner.nextLine();
        Aluno aluno = new Aluno();
        System.out.println("Informe o nome do aluno: ");
        aluno.nome = scanner.nextLine();
        System.out.println("Informe o CPF do aluno: ");
        aluno.cpf = scanner.nextLine();
        System.out.println("Informe o telefone do aluno: ");
        aluno.telefone = scanner.nextLine();
        System.out.println("Informe o endereço do aluno: ");
        aluno.endereco = scanner.nextLine();
        System.out.println("Informe a data de nascimento do aluno: ");
        aluno.dataNascimento = scanner.nextLine();

    }

     public static void cadastrarMatricula(){
        scanner.nextLine();
        Matricula matricula = new Matricula();
        System.out.println("Informe o RA da matrícula: ");
        matricula.ra = scanner.nextLine();
        System.out.println("Informe a data da matrícula: ");
        matricula.data = scanner.nextLine();
        System.out.println("Informe a situação da matrícula: ");
        // matricula.situacao = scanner.nextLine();

    }


  

    public static void exibirMenu() {
        System.out.println("============================");
        System.out.println("[1] Cadastro de turma: ");
        System.out.println("[2] Cadastro de campus: ");
        System.out.println("[3] Cadastro de curso: ");
        System.out.println("[4] Cadastro de estudante: ");
        System.out.println("[5] Cadastro de matricula: ");
        System.out.println("[6] Exibir tudo: ");
        System.out.println("[0] Sair: ");
        System.out.println("============================");
    }
}
