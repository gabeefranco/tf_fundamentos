// TODO: atualizar README.md

import java.util.Scanner;

public class Menu {

  private static Dados dados;
  private static Gerenciador gerenciador;

  public static void main(String[] args) {
    dados = new Dados();
    gerenciador = new Gerenciador(dados);

    Scanner input = new Scanner(System.in);
    String result = null;
    while (true) {
      System.out.println(
          "\fEscolha uma opcao:" + "\n" +
              "1 - Cadastro de Aluno" + "\n" +
              "2 - Cadastro de Bolsisa " + "\n" +
              "3 - Regisrar dados de acompanhamento" + "\n" +
              "4 - Listar alunos" + "\n" +
              "5 - Listar alunos bolsistas" + "\n" +
              "6 - Nome mais longo de alunos cadastrados" + "\n" +
              "7 - Total de vogais em nomes cadastrados" + "\n" +
              "8 - Calcular percentual de alunos" + "\n" +
              "9 - Calcular media de idade de alunos" + "\n" +
              "10 - Criar/Atualizar lista de chamada" + "\n" +
              "11 - Lista de chamada" + "\n" +
              "12 - Calcular nivel de risco pedagogico" + "\n" +
              "13 - Relatorio geral de risco pedagogico" + "\n" +
              "14 - Alunos em alto risco" + "\n" +
              "15 - (Colocar inovacao aqui)" + "\n" +
              "16 - Encerrar o programa\n\n" +
              result);

      result = prompt(input.nextInt());
    }
  }

  public static String prompt(int option) {
    switch (option) {
      case 1:
        return gerenciador.cadastrarAluno(); 
      case 2:
        return gerenciador.cadastrarBolsista(false, null);
      case 3:
        return gerenciador.registrarAcompanhamento();
      case 4:
        return gerenciador.listarAlunos();
      case 5:
        return gerenciador.listarBolsistas();
      case 6:
        return gerenciador.maiorNome();
      case 7:
        return gerenciador.vogaisNomes();
      case 8:
        return gerenciador.percentualAlunos();
      case 9:
        return gerenciador.mediaIdadeAlunos();
      case 10:
        return gerenciador.criarChamada();
      case 11:
        return gerenciador.chamada();
      case 12:
        return gerenciador.calcularRisco();
      case 13:
        return gerenciador.relatorioRisco();
      case 14:
        return gerenciador.altoRisco();
      // TODO: IMPLEMENTAR INOVAÇÃO
      case 15:
        return gerenciador.inovacao();
      case 16:
        System.exit(0);
    }
    return Erro.E1;
  }
}