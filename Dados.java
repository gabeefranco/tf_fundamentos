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

    public String appendAluno(Aluno aluno){
        if (checkDuplicate(aluno.getNome())) {return Erro.E3;}

        int size = this.alunos.length;

        Aluno[] novoArray = new Aluno[size + 1];

        for (int i = 0; i < size; i++){
            novoArray[i] = this.alunos[i];
        }

        novoArray[size] = aluno;
        this.alunos = novoArray;

        return "Aluno cadastrado com sucesso.";
    }

    public String appendAcompanhamento(Acompanhamento acomp){
        int index = findAcompanhamentoIndex(acomp.getAluno().getNome());

        if (index != -1){
            acompanhamentos[index] = acomp;
            return "Acompanhamento atualizado com sucesso.";
        }

        int size = this.acompanhamentos.length;

        Acompanhamento[] novoArray = new Acompanhamento[size + 1];

        for (int i = 0; i < size; i++){
            novoArray[i] = this.acompanhamentos[i];
        }

        novoArray[size] = acomp;
        this.acompanhamentos = novoArray;

        return "Acompanhamento cadastrado com sucesso.";
    }

    public int findAcompanhamentoIndex(String nome){
        for (int i = 0; i < acompanhamentos.length; i++){
            if (nome.equals(acompanhamentos[i].getAluno().getNome()))
                return i;
        }

        return -1;
    }

    public String appendBolsista(Bolsista bolsista){
        int index = findBolsistaIndex(bolsista.getNome());

        if (index != -1){
            bolsistas[index] = bolsista;
            return "Bolsista atualizado com sucesso.";
        }

        int size = this.bolsistas.length;

        Bolsista[] novoArray = new Bolsista[size + 1];

        for (int i = 0; i < size; i++){
            novoArray[i] = this.bolsistas[i];
        }

        novoArray[size] = bolsista;
        this.bolsistas = novoArray;

        return "Bolsista cadastrado com sucesso.";   
    }

    private boolean checkDuplicate(String nome){
        for (int i = 0; i < alunos.length; i++){
            if (nome.equals(alunos[i].getNome())){
                return true;
            }
        }

        return false;
    }

    private int findAlunoIndex(String nome){
        for (int i = 0; i < alunos.length; i++){
            if (nome.equals(alunos[i].getNome()))
                return i;
        }

        return -1;
    }

    private int findBolsistaIndex(String nome){
        for (int i = 0; i < bolsistas.length; i++){
            if (nome.equals(bolsistas[i].getNome()))
                return i;
        }

        return -1;
    }

    public Aluno findAluno(String nome){
        int index = findAlunoIndex(nome);

        if (index == -1) {return null;}
        else {return alunos[index];}
    }

    public Acompanhamento findAcompanhamento(String nome){
        int index = findAcompanhamentoIndex(nome);

        if (index == -1) {return null;}
        else {return acompanhamentos[index];}
    }

    public String listAlunos(){
        if (alunos.length == 0) {return Erro.E5;}
            
        String lista = "";
        for (int i = 0; i < alunos.length; i++){
            lista = lista.concat(alunos[i].getNome() + "\n");
        }

        return lista;
    }

    public String listBolsistas(){
        if (bolsistas.length == 0) {return Erro.E5;}

        String lista = "";
        for (int i = 0; i < bolsistas.length; i++){
            lista = lista.concat(bolsistas[i].getNome());
        }

        return lista;
    }

    public String riskReport(){
        if (acompanhamentos.length == 0) {return Erro.E8;}
            
        String relatorio = "";

        for (int i = 0; i < acompanhamentos.length; i++){
            relatorio = relatorio.concat(acompanhamentos[i].getAluno().getNome() + ": ");
            relatorio = relatorio.concat(acompanhamentos[i].getRiscoLabel() + "\n");
        }

        return relatorio;
    }

    public String riskReportHigh(){
        if (acompanhamentos.length == 0) {return Erro.E8;}

        String relatorio = "";

        for (int i = 0; i < acompanhamentos.length; i++){
            if (acompanhamentos[i].getRiscoLabel().equals("ALTO")){
                relatorio = relatorio.concat(acompanhamentos[i].getAluno().getNome() + ": Risco ALTO\n");
            }
        }

        if (relatorio.length() == 0) {return Erro.E9;}

        return relatorio;
    }

    public String maiorNome(){
        if (alunos.length == 0) {return Erro.E5;}
            
        if (alunos.length == 1) {return alunos[0].getNome();}
            
        int k = 0;
        for (int i = 1; i < alunos.length; i++){
            if (alunos[i].getNome().length() > alunos[k].getNome().length())
                k = i;
        }

        return alunos[k].getNome();
    }

    public String averageAge(){
        if (alunos.length == 0) {return Erro.E5;}
            
        double sum = 0;

        for (int i = 0; i < alunos.length; i++){
            sum += alunos[i].getIdade();
        }

        sum = sum / alunos.length;
        return "Idade media dos alunos: " + sum;
    }

    public String totalVowels(){
        if (alunos.length == 0) {return Erro.E5;}
            
        int sum = 0;

        for (int k = 0; k < alunos.length; k++){
            String nome = alunos[k].getNome();

            for (int j = 0; j < nome.length(); j++){
                if (isVowel(nome.charAt(j))){
                    sum++;}
            }
        }
        
        return "Numero total de vogais:" + sum;
    }

    private boolean isVowel(char a){
        return (a == 'a') || (a == 'e') || (a == 'i') || (a == 'o') || (a == 'u')
        || (a == 'A') || (a == 'E') || (a == 'I') || (a == 'O') || (a == 'U');
    }

    public void makeChamada(){
        this.chamada = "";

        if (alunos.length == 0) {return;}
            
        for (int i = 0; i < alunos.length; i++){
            this.chamada = this.chamada.concat(alunos[i].getMatricula() + " / ");
            this.chamada = this.chamada.concat(alunos[i].getNome() + " / ");
            this.chamada = this.chamada.concat(alunos[i].getCurso() + "\n");
        } 
    }

    public String printChamada(){
        if (chamada.length() == 0) {return Erro.E6;}
            
        return chamada;
    }

    public double coursePercent(String curso){
        if (alunos.length == 0) {return -1;}

        double num = 0;

        for (int i = 0; i < alunos.length; i++){
            if (alunos[i].getCurso().equals(curso))
                num++;
        }

        return (num / alunos.length) * 100;
    }

    public String rankingRisco(){
        if (acompanhamentos.length == 0) {return Erro.E8;}

        int size = acompanhamentos.length;
        Acompanhamento[] sorted = new Acompanhamento[size];
        double sum = 0;

        for (int i = 0; i < size; i++){
            sorted[i] = acompanhamentos[i];
            sum += sorted[i].getRiscoPedagogico();
        }

        Acompanhamento aux;

        while (true){
            boolean c = false;

            for (int i = 0; i+1 < size; i++){
                if (sorted[i].getRiscoPedagogico() < sorted[i+1].getRiscoPedagogico()){
                    aux = sorted[i];
                    sorted[i] = sorted[i+1];
                    sorted[i+1] = aux;
                    c = true;
                }
            }

            if (!c){break;}
        }

        String ranking = "";

        for (int i = 0; i < size; i++){
            ranking += "Aluno: " + sorted[i].getAluno().getNome() + ". " + sorted[i].getRiscoLabel() + "\n";
        }

        ranking += "\nA media de risco eh: " + sum/size;
        return ranking;
    }
}
