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

    System.out.println("Insira o semestre do aluno:");
    semestre = input.nextInt();

    System.out.println("Insira o ano do aluno:");
    ano = input.nextInt();

    Aluno aluno = new Aluno(nome, idade, local, curso, matricula, semestre, ano, bolsista); // Adicionar opção de bolsista
    this.dados.appendAluno(aluno);
  }

  public void cadastrarBolsista() {

  }

  public void registrarAcompanhamento() {
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
  }

  public void relatorioRisco() {

  }

  public void altoRisco() {

  }

  public void inovacao() {

  }
}
