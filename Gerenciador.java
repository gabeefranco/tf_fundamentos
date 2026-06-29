import java.util.Scanner;

public class Gerenciador {
  private Dados dados;
  private static Scanner input = new Scanner(System.in);
  
  

  public Gerenciador(Dados dados) {
    this.dados = dados;
  }

  public String cadastrarAluno() {
    String nome = "", local = "", curso = "", matricula = "";
    int idade = 0, semestre = 0, ano = 0;
    
    while (nome.length() == 0){
      System.out.println("Insira o nome do aluno:");
      nome = input.nextLine();}

    while (local.length() == 0){
      System.out.println("Insira o local de nascimento do aluno:");
      local = input.nextLine();}

    while (curso.length() == 0){
    System.out.println("Insira o curso do aluno:");
    curso = input.nextLine();}

    while (matricula.length() == 0){
      System.out.println("Insira a matricula do aluno:");
      matricula = input.nextLine();}

    while (idade == 0 ){
      System.out.println("Insira a idade do aluno:");
      idade = input.nextInt();
      input.nextLine();} //buffer clear

    while (semestre == 0){
      System.out.println("Insira o semestre do aluno:");
      semestre = input.nextInt();
      input.nextLine();} //buffer clear

    while (ano == 0){
      System.out.println("Insira o ano do aluno:");
      ano = input.nextInt();
      input.nextLine();} //buffer clear

    Aluno aluno = new Aluno(nome, idade, local, curso, matricula, semestre, ano, false);
    this.dados.appendAluno(aluno);

    System.out.println("O aluno é bolsista? (s/n)");
    String resposta = input.nextLine().toLowerCase();
    if (resposta.equals("s")){
      return cadastrarBolsista(true, aluno);
    } 

    return "Aluno cadastrado com sucesso.";

  }

  public String cadastrarBolsista(boolean resposta, Aluno alunoparametro) {
    String projeto = "", orientador = "";

    Aluno aluno;

    if (resposta){
      aluno = alunoparametro;
      } else {
        System.out.println("Insira o nome do aluno a quem você deseja cadastrar uma bolsa:");
        aluno = this.dados.findAluno(input.nextLine());
        if (aluno == null)
          return Erro.E2;
      }

    while (projeto.length() == 0){
      System.out.println("Insira o nome do projeto:");
      projeto = input.nextLine();}

    while (orientador.length() == 0){
      System.out.println("Insira o nome do orientador:");
      orientador = input.nextLine();}

    Bolsista bolsista = new Bolsista(aluno, projeto, orientador);
    aluno.setBolsista(true);
    return this.dados.appendBolsista(bolsista);

  }

  public String registrarAcompanhamento() {
    System.out.println("Insira o nome do Aluno que você deseja registrar o acompanhamento:");
    String nome = input.nextLine();
    Aluno aluno = this.dados.findAluno(nome);

    if (aluno == null)
      return Erro.E2;

    System.out.println("Insira a quantidade de atividades entregues:");
    int entregues = input.nextInt();
    input.nextLine(); //buffer clear
    
    System.out.println("Insira a quantidade de atividades entregues nas quais foi declarado o uso de IA:");
    int ia = input.nextInt();
    input.nextLine(); //buffer clear

    System.out.println("Insira a quantidade de atividades entregues que o aluno soube explicar:");
    int explicadas = input.nextInt();
    input.nextLine(); //buffer clear

    System.out.println("Insira a quantidade de atividades entregues que foram feitas sem ajuda:");
    int semajuda = input.nextInt();
    input.nextLine(); //buffer clear

    System.out.println("Insira a quanntidade de atividades entregues que utilizaram estruturas não estudadas:");
    int naoestudadas = input.nextInt();
    input.nextLine(); //buffer clear

    if (ia > entregues || explicadas > entregues || semajuda > entregues || naoestudadas > entregues){
      return Erro.E4;
    }

    Acompanhamento acomp = new Acompanhamento(aluno, entregues, ia, explicadas, semajuda, naoestudadas);

    return this.dados.appendAcompanhamento(acomp);
  }

  public String listarAlunos() {
    return this.dados.listAlunos();
  }

  public String listarBolsistas() {
    return this.dados.listBolsistas();
  }

  public String maiorNome(){
    return this.dados.maiorNome();
  }

  public String vogaisNomes(){
    return this.dados.totalVowels();
  }

  public String percentualAlunos() {
    String curso = "";

    while (curso.length() == 0){
      System.out.println("Insira um curso:");
      curso = input.nextLine();
    }

    return "O percentual de alunos matriculados nesse curso é de: " + this.dados.coursePercent(curso) + "%";

  }

  public String mediaIdadeAlunos() {
    return this.dados.averageAge();
  }

  public String criarChamada() {
    this.dados.makeChamada();

    if (chamada().equals(Erro.E5))
      return chamada();

    return "Chamada criada com sucesso.";
  }

  public String chamada() {
    return this.dados.printChamada();
  }

  public String calcularRisco() {

    System.out.println("Insira o nome de um aluno:");
    Acompanhamento acomp = this.dados.findAcompanhamento(input.nextLine());
    if (acomp == null)
      return Erro.E10;

    return acomp.getRiscoLabel();

  }

  public String relatorioRisco() {

    return this.dados.riskReport();

  }

  public String altoRisco() {
    return this.dados.riskReportHigh();
  }

  public String inovacao() {
    return null;
  }
}