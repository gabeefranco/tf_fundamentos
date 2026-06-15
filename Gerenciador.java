// TODO: validação nos metodos com entrada

import java.util.Scanner;

public class Gerenciador {
  private Dados dados;
  private static Scanner input = new Scanner(System.in);
  
  String nome, local, curso, matricula, projeto, orientador;
  int idade, semestre, ano;
  boolean bolsista;

  public Gerenciador(Dados dados) {
    this.dados = dados;
  }

  public void cadastrarAluno() {
    System.out.println("Insira o nome do aluno:");
    nome = input.nextLine();

    System.out.println("Insira o local de nascimento do aluno:");
    local = input.nextLine();

    System.out.println("Insira o curso do aluno:");
    curso = input.nextLine();

    System.out.println("Insira a matricula do aluno:");
    matricula = input.nextLine();

    System.out.println("Insira a idade do aluno:");
    idade = input.nextInt();
    input.nextLine(); //buffer clear

    System.out.println("Insira o semestre do aluno:");
    semestre = input.nextInt();
    input.nextLine(); //buffer clear

    System.out.println("Insira o ano do aluno:");
    ano = input.nextInt();
    input.nextLine(); //buffer clear

    Aluno aluno = new Aluno(nome, idade, local, curso, matricula, semestre, ano, false);
    this.dados.appendAluno(aluno);

    System.out.println("O aluno é bolsista? (s/n)");
    String resposta = input.nextLine().toLowerCase();
    if (resposta.equals("s")){
      cadastrarBolsista(true, aluno);
    }

  }

  public void cadastrarBolsista(boolean resposta, Aluno alunoparametro) {

    Aluno aluno;

    if (resposta){
      aluno = alunoparametro;
      } else {
        System.out.println("Insira o nome do aluno a quem você deseja cadastrar uma bolsa:");
        aluno = this.dados.findAluno(input.nextLine());
      }

    System.out.println("Insira o nome do projeto:");
    String projeto = input.nextLine();

    System.out.println("Insira o nome do orientador:");
    String orientador = input.nextLine();

    Bolsista bolsista = new Bolsista(aluno, projeto, orientador);
    aluno.setBolsista(true);
    this.dados.appendBolsista(bolsista);

  }

  public void registrarAcompanhamento() {
    System.out.println("Insira o nome do Aluno que você deseja registrar o acompanhamento:");
    String nome = input.nextLine();
    Aluno aluno = this.dados.findAluno(nome);

    Acompanhamento acomp = new Acompanhamento(aluno, 0, 0, 0, 0, 0);

    System.out.println("Insira a quantidade de atividades entregues:");
    int entregues = input.nextInt();
    input.nextLine(); //buffer clear
    acomp.setAtividadesEntregues(entregues);

    System.out.println("Insira a quantidade de atividades entregues nas quais foi declarado o uso de IA:");
    int ia = input.nextInt();
    input.nextLine(); //buffer clear
    acomp.setAtividadesIA(ia);

    System.out.println("Insira a quantidade de atividades entregues que o aluno soube explicar:");
    int explicadas = input.nextInt();
    input.nextLine(); //buffer clear
    acomp.setAtividadesExplicadas(explicadas);

    System.out.println("Insira a quantidade de atividades entregues que foram feitas sem ajuda:");
    int semajuda = input.nextInt();
    input.nextLine(); //buffer clear
    acomp.setAtividadesSemAjuda(semajuda);

    System.out.println("Insira a quanntidade de atividades entregues que utilizarão estruturas não estudadas:");
    int naoestudadas = input.nextInt();
    input.nextLine(); //buffer clear
    acomp.setAtividadesNaoEstudadas(naoestudadas);

    this.dados.appendAcompanhamento(acomp);

  }

  public void listarAlunos() {
    this.dados.listAlunos();
  }

  public void listarBolsistas() {
    this.dados.listBolsistas();
  }

  public void maiorNome(){
    this.dados.maiorNome();
  }

  public void vogaisNomes(){
    System.out.println("Numero total de vogais: " + this.dados.totalVowels());
  }

  public void percentualAlunos() {

    System.out.println("Insira um curso:");
    String curso = input.nextLine();

    System.out.print("O percentual de alunos matriculados nesse curso é de: " + this.dados.coursePercent(curso) + "%\n");

  }

  public void mediaIdadeAlunos() {
    System.out.println("Idade média dos alunos: " + this.dados.averageAge());
  }

  public void criarChamada() {
    this.dados.makeChamada();
  }

  public void chamada() {
    this.dados.printChamada();
  }

  public void calcularRisco() {

    System.out.println("Insira o nome de um aluno:");
    Acompanhamento acomp = this.dados.findAcompanhamento(input.nextLine());

    System.out.println("O risco pedagógico deste aluno é " + acomp.getRiscoLabel());

  }

  public void relatorioRisco() {

    this.dados.riskReport();

  }

  public void altoRisco() {
    this.dados.riskReportHigh();
  }

  public void inovacao() {

  }
}