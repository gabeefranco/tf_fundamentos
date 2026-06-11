public class Dados {
    private Aluno[] alunos;
    private String chamada;

    public Dados(){
        alunos = new Aluno[]{};
        chamada = "";
    }

    public void appendAluno(Aluno aluno){
        int size = this.alunos.length;

        Aluno[] novoArray = new Aluno[size + 1];

        for (int i = 0; i < size; i++){
            novoArray[i] = this.alunos[i];
        }

        novoArray[size] = aluno;
        this.alunos = novoArray;
    }

    private int findAlunoIndex(String nome){
        for (int i = 0; i < alunos.length; i++){
            if (nome.equals(alunos[i].getNome()))
                return i;
        }
        return -1;
    }

    public void listAlunos(){
        for (int i = 0; i < alunos.length; i++){
            System.out.println(alunos[i].getNome());
        }
    }

    public void listBolsistas(){
        for (int i = 0; i < alunos.length; i++){
            if (alunos[i].getBolsista())
                System.out.println(alunos[i].getNome());
        }
    }

    public void maiorNome(){
        int k = 0;
        for (int i = 1; i < alunos.length; i++){
            if (alunos[i].getNome().length() > alunos[k].getNome().length())
                k = i;
        }
        System.out.println(alunos[k].getNome());
    }

    public double averageAge(){
        double sum = 0;

        for (int i = 0; i < alunos.length; i++){
            sum += alunos[i].getIdade();
        }

        sum = sum / alunos.length;
        return sum;
    }

    public int totalVowels(){
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        int sum = 0;

        for (int i = 0; i < vowels.length; i++){
            for (int k = 0; k < alunos.length; k++){

                String nome = alunos[k].getNome();

                for (int j = 0; j < nome.length(); j++){
                    if (nome.charAt(j) == vowels[i]){
                        sum++;}
                }
            }
        }

        return sum;
    }

    public void makeChamada(){
        this.chamada = "";
        for (int i = 0; i < alunos.length; i++){
            this.chamada.concat(alunos[i].getMatricula() + " / ");
            this.chamada.concat(alunos[i].getNome() + " / ");
            this.chamada.concat(alunos[i].getCurso() + "/n");
        }
    }

    public void printChamada(){
        System.out.println(chamada);
    }
}
