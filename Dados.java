// TODO: acentos no isVowel()

public class Dados {
    private Aluno[] alunos;
    private String chamada;
    private Acompanhamento[] acompanhamentos;
    private Bolsista[] bolsistas;

    public Dados(){
        this.alunos = new Aluno[256];
        this.chamada = "";
        this.acompanhamentos = new Acompanhamento[256];
        this.bolsistas = new Bolsista[256];
    }

    public String appendAluno(Aluno aluno){
        if (checkDuplicate(aluno.getNome())){
            return Erro.E3;
        }

        int size = 0;

        for (int i = 0; i < this.alunos.length; i++){
            if (this.alunos[i] == null){
                size = i;
                break;
            }
        }

        if (size == 255){
            return Erro.E10;
        }

        this.alunos[size] = aluno;

        System.out.println("debug_alunos.size:"+size);

        return "Aluno cadastrado com sucesso.";
    }

    public String appendAcompanhamento(Acompanhamento acomp){

        int size = 0;

        for (int i = 0; i < this.acompanhamentos.length; i++){
            if (this.acompanhamentos[i] == null){
                size = i;
                break;
            }
        }

        if (size == 255){
            return Erro.E10;
        }

        this.acompanhamentos[size] = acomp;

        System.out.println("debug_acompanhamentos.size:"+size);

        return "Acompanhamento cadastrado com sucesso.";
    }

    public String appendBolsista(Bolsista bolsista){

        int size = 0;

        for (int i = 0; i < this.bolsistas.length; i++){
            if (this.bolsistas[i] == null){
                size = i;
                break;
            }
        }

        if (size == 255){
            return Erro.E10;
        }

        this.bolsistas[size] = bolsista;

        return "Bolsista cadastrado com sucesso.";
    }

    private boolean checkDuplicate(String nome){

        int size = 0;

        for (int i = 0; i < this.alunos.length; i++){
            if (this.alunos[i] == null){
                size = i;
                break;
            }
        }

        for (int i = 0; i < size; i++){
            if (nome.equals(alunos[i].getNome())){
                return true;
            }
        }

        return false;
    }

    private int findAlunoIndex(String nome){

        int size = 0;

        for (int i = 0; i < this.alunos.length; i++){
            if (this.alunos[i] == null){
                size = i;
                break;
            }
        }

        for (int i = 0; i < size; i++){
            if (nome.equals(alunos[i].getNome()))
                return i;
        }
        return -1;
    }

    public Aluno findAluno(String nome){
        int index = findAlunoIndex(nome);

        if (index == -1){
            return null;
        }

        return alunos[index];
    }

    public Acompanhamento findAcompanhamento(String nome){

        int size = 0;

        for (int i = 0; i < this.acompanhamentos.length; i++){
            if (this.acompanhamentos[i] == null){
                size = i;
                break;
            }
        }

        System.out.println("debug_acompanhamentos.size:"+size);

        for (int i = 0; i < size; i++) {
            if (this.acompanhamentos[i].getAluno().getNome().equals(nome)) {
                return acompanhamentos[i];
            }
        }

        return null;
    }

    public String listAlunos(){
        int size = 0;
        for (int i = 0; i < this.alunos.length; i++){
            if (this.alunos[i] == null){
                size = i;
                break;
            }
        }

        if (size == 0)
            return Erro.E5;
        
        String lista = "";
        for (int i = 0; i < size; i++){
            lista = lista.concat(alunos[i].getNome() + "\n");
        }

        return lista;
    }

    public String listBolsistas(){
        int size = 0;

        for (int i = 0; i < this.bolsistas.length; i++){
            if (this.bolsistas[i] == null){
                size = i;
                break;
            }
        }

        if (size == 0)
            return Erro.E5;

        String lista = "";
        for (int i = 0; i < size; i++){
            lista = lista.concat(bolsistas[i].getNome());
        }

        return lista;
    }

    public String riskReport(){
        int size = 0;
        for (int i = 0; i < this.acompanhamentos.length; i++){
            if (this.acompanhamentos[i] == null){
                size = i;
                break;
            }
        }

        if (size == 0)
            return Erro.E8;

        String relatorio = "";

        for (int i = 0; i < size; i++){
            relatorio = relatorio.concat(acompanhamentos[i].getAluno().getNome() + ": Risco ");
            relatorio = relatorio.concat(acompanhamentos[i].getRiscoLabel() + "\n");
        }

        return relatorio;

    }

    public String riskReportHigh(){
        int size = 0;
        for (int i = 0; i < this.acompanhamentos.length; i++){
            if (this.acompanhamentos[i] == null){
                size = i;
                break;
            }
        }

        if (size == 0)
            return Erro.E8;

        String relatorio = "";

        for (int i = 0; i < size; i++){
            if (acompanhamentos[i].getRiscoLabel().equals("ALTO")){
                relatorio = relatorio.concat(acompanhamentos[i].getAluno().getNome() + ": Risco ALTO\n");
            }
        }

        if (relatorio.length() == 0)
            return Erro.E9;

        return relatorio;
    }

    public String maiorNome(){
        int size = 0;
        for (int i = 0; i < this.alunos.length; i++){
            if (this.alunos[i] == null){
                size = i;
                break;
            }
        }

        if (size == 0)
            return Erro.E5;
        if (size == 1)
            return alunos[0].getNome();

        int k = 0;
        for (int i = 1; i < size; i++){
            if (alunos[i].getNome().length() > alunos[k].getNome().length())
                k = i;
        }
        return alunos[k].getNome();
    }

    public String averageAge(){
        int size = 0;
        for (int i = 0; i < this.alunos.length; i++){
            if (this.alunos[i] == null){
                size = i;
                break;
            }
        }

        if (size == 0)
            return Erro.E5;

        double sum = 0;

        for (int i = 0; i < size; i++){
            sum += alunos[i].getIdade();
        }

        sum = sum / size;
        return "Idade média dos alunos: " + sum;
    }

    public String totalVowels(){
        int size = 0;
        for (int i = 0; i < this.alunos.length; i++){
            if (this.alunos[i] == null){
                size = i;
                break;
            }
        }

        if (size == 0)
            return Erro.E5;
        
        int sum = 0;

        for (int k = 0; k < size; k++){
            String nome = alunos[k].getNome();

            for (int j = 0; j < nome.length(); j++){
                if (isVowel(nome.charAt(j))){
                    sum++;}
            }
        }
        

        return "Numero total de vogais:" + sum;
    }

    private boolean isVowel(char a){
    
        return (a == 'a') || (a == 'e') || (a == 'i') || (a == 'o') || (a == 'u') || (a == 'A') || (a == 'E') || (a == 'I') || (a == 'O') || (a == 'U');
    
    }

    public void makeChamada(){
        this.chamada = "";

        int size = 0;
        for (int i = 0; i < this.alunos.length; i++){
            if (this.alunos[i] == null){
                size = i;
                break;
            }
        }

        if (size == 0){
            this.chamada = Erro.E5;
        } else {
            for (int i = 0; i < size; i++){
                this.chamada = this.chamada.concat(alunos[i].getMatricula() + " / ");
                this.chamada = this.chamada.concat(alunos[i].getNome() + " / ");
                this.chamada = this.chamada.concat(alunos[i].getCurso() + "\n");
            }
        }
    }

    public String printChamada(){
        if (chamada.length() == 0)
            return Erro.E6;

        return chamada;
    }

    public double coursePercent(String curso){
        double num = 0;
        int size = 0;
        for (int i = 0; i < this.alunos.length; i++){
            if (this.alunos[i] == null){
                size = i;
                break;
            }
        }

        for (int i = 0; i < size; i++){
            if (alunos[i].getCurso().equals(curso))
                num++;
        }

        return (num / size) * 100;
    }
}