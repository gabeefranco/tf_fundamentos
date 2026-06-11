public class Pessoa{
    private int nome;
    private int idade;
    private String localNascimento;

    public Pessoa(int nome, int idade, String localNascimento){
        this.nome = nome;
        this.idade = idade;
        this.localNascimento = localNascimento;
    }

    public int getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getLocal(){
        return this.localNascimento;
    }

}