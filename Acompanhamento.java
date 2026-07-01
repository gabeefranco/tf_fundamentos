public class Acompanhamento {
  private Aluno aluno;
  private int atividadesEntregues;
  private int atividadesIA;
  private int atividadesExplicadas;
  private int atividadesSemAjuda;
  private int atividadesNaoEstudadas;
  private double riscoPedagogico;

  public Acompanhamento(Aluno aluno, int atividadesEntregues, int atividadesIA, int atividadesExplicadas, int atividadesSemAjuda, int atividadesNaoEstudadas){
    this.aluno = aluno;
    this.atividadesEntregues = atividadesEntregues;
    this.atividadesIA = atividadesIA;
    this.atividadesExplicadas = atividadesExplicadas;
    this.atividadesSemAjuda = atividadesSemAjuda;
    this.atividadesNaoEstudadas = atividadesNaoEstudadas;

    this.riscoPedagogico = this.calcularRisco();
  }

  private double calcularRisco(){
    double razaoIa = (double) atividadesIA / (double) atividadesEntregues;
    double razaoNaoExplicadas = (double) (atividadesEntregues - atividadesExplicadas) / (double) atividadesEntregues;
    double razaoComAjuda = (double) (atividadesEntregues - atividadesSemAjuda) / (double) atividadesEntregues;
    double razaoNaoEstudadas = (double) atividadesNaoEstudadas / (double) atividadesEntregues;
    double media = (razaoIa + razaoNaoExplicadas + razaoComAjuda + razaoNaoEstudadas) / (double) 4;

    return media * 10;
  }

  public double getRiscoPedagogico(){
    return this.calcularRisco();
  }

  public String getRiscoLabel(){
    this.riscoPedagogico = this.calcularRisco();

    if (this.riscoPedagogico <= 3.3){
      return "O risco pedagogico deste aluno eh BAIXO";
    }
    if (this.riscoPedagogico > 3.3 && this.riscoPedagogico < 6.6){
      return "O risco pedagogico deste aluno eh MODERADO";
    }
    if (this.riscoPedagogico >= 6.6){
      return "O risco pedagogico deste aluno eh ALTO";
    }

    return Erro.E7;
  }

  public Aluno getAluno(){
    return this.aluno;
  }

}