// TODO: validação nos metodos com entrada

import java.util.Scanner;

public class Gerenciador {
  private Dados dados;

  public Gerenciador(Dados dados) {
    this.dados = dados;
  }

  public void cadastrarAluno() {

    System.out.println("Insira o ano do aluno:");
    ano = input.nextInt();

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
    acomp.setAtividadesEntregues(entregues);

    System.out.println("Insira a quantidade de atividades entregues nas quais foi declarado o uso de IA:");
    int ia = input.nextInt();
    acomp.setAtividadesIA(ia);

    System.out.println("Insira a quantidade de atividades entregues que o aluno soube explicar:");
    int explicadas = input.nextInt();
    acomp.setAtividadesExplicadas(explicadas);

    System.out.println("Insira a quantidade de atividades entregues que foram feitas sem ajuda:");
    int semajuda = input.nextInt();
    acomp.setAtividadesSemAjuda(semajuda);

    System.out.println("Insira a quanntidade de atividades entregues que utilizarão estruturas não estudadas:");
    int naoestudadas = input.nextInt();
    acomp.setAtividadesNaoEstudadas(naoestudadas);

    this.dados.appendAcompanhamento(acomp);
    
  }

  public void listarAlunos() {

  }

  public void listarBolsistas() {
  }

  public void maiorNome() {

  }

  public void vogaisNomes() {

  }

  public void percentualAlunos() {

    System.out.println("Insira um curso:");
    String curso = input.nextLine();

    System.out.print("O percentual de alunos matriculados nesse curso é de: " + this.dados.coursePercent(curso) + "%\n");

  }

  public void mediaIdadeAlunos() {
  }

  public void criarChamada() {

  }

  public void chamada() {

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
