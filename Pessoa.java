public class Pessoa{
    private String nome;
    private int idade;
    private String localNascimento;

    public Pessoa(String nome, int idade, String localNascimento){
        this.nome = nome;
        this.idade = idade;
        this.localNascimento = localNascimento;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public String getLocal(){
        return this.localNascimento;
    }

}