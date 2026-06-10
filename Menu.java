
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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
        Menu.prompt(input.nextInt());
    }

    public static void prompt(int option) {
        while(true){
            switch(option){


                //passar parametros

                //String nome,int idade,String local, String curso, String matricula,int semestre,int ano ,bool bolsista, String projeto, String orientador

                case 1 : 
                    Class.cadastroAluno(); // completar com o nome correto das classes
                    break;
                case 2 : 
                    Class.cadastroBIA();
                    break;
                case 3 : 
                    Class.registroIA();
                    break;
                case 4 : 
                    Class.listaTurma();
                    break;
                case 5 : 
                    Class.listaBolsistas();
                    break;
                case 6 : 
                    Class.maiorNome();
                    break;
                case 7 : 
                    Class.vogaisNomes();
                    break;
                case 8 :
                    Class.percentualAlunos();
                    break;
                case 9 :
                    Class.mediaIdade();
                    break;
                case 10 :
                    Class.criarChamada();
                    break;
                case 11 :
                    Class.chamada();
                    break;
                case 12 : 
                    Class.calculoRisco();
                    break;
                case 13 : 
                    Class.relatorioRisco();
                    break;
                case 14 : 
                    Class.altoRisco();
                    break;
                //em teoria, precisamos fazer algo "inovador", não sei se voces já conversaram sobre isso
                // mas vou deixar de place-holder um método.
                case 15 : Class.inovacao(); 
                break;
                case 16 : System.exit(0);

                default :  System.out.println("Opção inválida");
            }
        }
    }
}