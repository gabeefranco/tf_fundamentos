public class Aluno {
    private Pessoa pessoa;
    private String curso;
    private String matricula;
    private int semestre;
    private int ano;
    private boolean bolsista;

    public Aluno(int nome, int idade, String localNascimento, String curso, String matricula, int semestre, int ano, boolean bolsista){
        this.pessoa = new Pessoa(nome, idade, localNascimento);
        this.curso = curso;
        this.matricula = matricula;
        this.semestre = semestre;
        this.ano = ano;
        this.bolsista = bolsista;
    }

    public int getNome(){
        return this.pessoa.getNome();
    }

    public int getIdade(){
        return this.pessoa.getIdade();
    }

    public String getLocal(){
        return this.pessoa.getLocal();
    }

    public String getCurso(){
        return this.curso;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public int getSemestre(){
        return this.semestre;
    }

    public int getAno(){
        return this.ano;
    }

    public boolean getBolsista(){
        return this.bolsista;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void setBolsista(boolean bolsista){
        this.bolsista = bolsista;
    }
}
