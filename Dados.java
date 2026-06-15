// TODO: acentos no isVowel()

public class Dados {
    private Aluno[] alunos;
    private String chamada;
    private Acompanhamento[] acompanhamentos;
    private Bolsista[] bolsistas;

    public Dados(){
        alunos = new Aluno[]{};
        chamada = "";
        acompanhamentos = new Acompanhamento[]{};
        bolsistas = new Bolsista[]{};
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

    public void appendAcompanhamento(Acompanhamento acomp){
        int size = this.acompanhamentos.length;

        Acompanhamento[] novoArray = new Acompanhamento[size + 1];

        for (int i = 0; i < size; i++){
            novoArray[i] = this.acompanhamentos[i];
        }

        novoArray[size] = acomp;
        this.acompanhamentos = novoArray;
    }

    public void appendBolsista(Bolsista bolsista){
        int size = this.bolsistas.length;

        Bolsista[] novoArray = new Bolsista[size + 1];

        for (int i = 0; i < size; i++){
            novoArray[i] = this.bolsistas[i];
        }

        novoArray[size] = bolsista;
        this.bolsistas = novoArray;

        
    }

    private int findAlunoIndex(String nome){
        for (int i = 0; i < alunos.length; i++){
            if (nome.equals(alunos[i].getNome()))
                return i;
        }
        return -1;
    }

    public Aluno findAluno(String nome){
        return alunos[findAlunoIndex(nome)];
    }

    public Acompanhamento findAcompanhamento(String nome){
        for (int i = 0; i < acompanhamentos.length; i++){
            if (acompanhamentos[i].getAluno().getNome().equals(nome)) {
                return acompanhamentos[i];
            }
        }

        return null;
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

    public void riskReport(){

        String relatorio = "";

        for (int i = 0; i < acompanhamentos.length; i++){
            relatorio = relatorio.concat(acompanhamentos[i].getAluno().getNome() + ": Risco ");
            relatorio = relatorio.concat(acompanhamentos[i].getRiscoLabel() + "\n");
        }

        System.out.println(relatorio);

    }

    public void riskReportHigh(){

        String relatorio = "";

        for (int i = 0; i < acompanhamentos.length; i++){
            if (acompanhamentos[i].getRiscoLabel().equals("ALTO")){
                relatorio = relatorio.concat(acompanhamentos[i].getAluno().getNome() + ": Risco ALTO\n");
            }
        }

        System.out.println(relatorio);
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
        
        int sum = 0;

        for (int k = 0; k < alunos.length; k++){
            String nome = alunos[k].getNome();

            for (int j = 0; j < nome.length(); j++){
                if (isVowel(nome.charAt(j))){
                    sum++;}
            }
        }
        

        return sum;
    }

    private boolean isVowel(char a){
    
        return (a == 'a') || (a == 'e') || (a == 'i') || (a == 'o') || (a == 'u') || (a == 'A') || (a == 'E') || (a == 'I') || (a == 'O') || (a == 'U');
    
    }

    public void makeChamada(){
        this.chamada = "";
        for (int i = 0; i < alunos.length; i++){
            this.chamada = this.chamada.concat(alunos[i].getMatricula() + " / ");
            this.chamada = this.chamada.concat(alunos[i].getNome() + " / ");
            this.chamada = this.chamada.concat(alunos[i].getCurso() + "\n");
        }
    }

    public void printChamada(){
        System.out.println(chamada);
    }

    public double coursePercent(String curso){
        double num = 0;

        for (int i = 0; i < alunos.length; i++){
            if (alunos[i].getCurso().equals(curso))
                num++;
        }

        return (num / alunos.length) * 100;
    }
}