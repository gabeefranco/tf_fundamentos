// TODO: atualizar README.md

import java.util.Scanner;

public class Menu {

  private static Dados dados;
  private static Gerenciador gerenciador;
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    dados = new Dados();
    gerenciador = new Gerenciador(dados);

    while (true) {
      System.out.println(
          "Escolha uma opcao:" + "\n" +
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
              "16 - Encerrar o programa");
      prompt(input.nextInt());
    }
  }

  public static void prompt(int option) {
    
    switch (option) {
      case 1:
        gerenciador.cadastrarAluno(); // completar com o nome correto das gerenciadores
        break;
      case 2:
        gerenciador.cadastrarBolsista(false, null);
        break;
      case 3:
        gerenciador.registrarAcompanhamento();
        break;
      case 4:
        gerenciador.listarAlunos();
        break;
      case 5:
        gerenciador.listarBolsistas();
        break;
      case 6:
        gerenciador.maiorNome();
        break;
      case 7:
        gerenciador.vogaisNomes();
        break;
      case 8:
        gerenciador.percentualAlunos();
        break;
      case 9:
        gerenciador.mediaIdadeAlunos();
        break;
      case 10:
        gerenciador.criarChamada();
        break;
      case 11:
        gerenciador.chamada();
        break;
      case 12:
        gerenciador.calcularRisco();
        break;
      case 13:
        gerenciador.relatorioRisco();
        break;
      case 14:
        gerenciador.altoRisco();
        break;
      // TODO: IMPLEMENTAR INOVAÇÃO
      case 15:
        gerenciador.inovacao();
        break;
      case 16:
        System.exit(0);

      default:
        System.out.println("Opção inválida");
    }
  }
}