public class Bolsista{
    private Aluno aluno;
    private String projeto;
    private String orientador;

    public Bolsista(String nome, int idade, String localNascimento, String curso, String matricula, int semestre, int ano, boolean bolsista, String projeto, String orientador){
        this.aluno = new Aluno(nome, idade, localNascimento, curso, matricula, semestre, ano, bolsista);
        this.projeto = projeto;
        this.orientador = orientador;
    }

    public String getNome(){
        return this.aluno.getNome();
    }

    public int getIdade(){
        return this.aluno.getIdade();
    }

    public String getLocal(){
        return this.aluno.getLocal();
    }

    public String getCurso(){
        return this.aluno.getCurso();
    }

    public String getMatricula(){
        return this.aluno.getMatricula();
    }

    public int getSemestre(){
        return this.aluno.getSemestre();
    }

    public int getAno(){
        return this.aluno.getAno();
    }

    public String getProjeto(){
        return this.projeto;
    }

    public String getOrientador(){
        return this.orientador;
    }

    public void setCurso(String curso){
        this.aluno.setCurso(curso);
    }

    public void setMatricula(String matricula){
        this.aluno.setMatricula(matricula);
    }

    public void setSemestre(int semestre){
        this.aluno.setSemestre(semestre);
    }

    public void setAno(int ano){
        this.aluno.setAno(ano);
    }

    public void setBolsista(boolean bolsista){
        this.aluno.setBolsista(bolsista);
    }

    public void setProjeto(String projeto){
        this.projeto = projeto;
    }

    public void setOrientador(String orientador){
        this.orientador = orientador;
    }
}