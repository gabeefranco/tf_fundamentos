public class Acompanhamento {
  private Aluno aluno;
  private int atividadesEntregues;
  private int atividadesIA;
  private int atividadesExplicadas;
  private int atividadesSemAjuda;
  private int atividadesNaoEstudadas;
  private double riscoPedagogico;

  public Acompanhamento(Aluno aluno, int atividadesEntregues, int atividadesIA, int atividadesExplicadas,
      int atividadesSemAjuda, int atividadesNaoEstudadas) {
    this.aluno = aluno;
    this.atividadesEntregues = atividadesEntregues;
    this.atividadesIA = atividadesIA;
    this.atividadesExplicadas = atividadesExplicadas;
    this.atividadesSemAjuda = atividadesSemAjuda;
    this.atividadesNaoEstudadas = atividadesNaoEstudadas;
  }

  private void calcularRisco() {
    double razaoIa = atividadesIA / atividadesEntregues;
    double razaoNaoExplicadas = (atividadesEntregues - atividadesExplicadas) / atividadesEntregues;
    double razaoComAjuda = (atividadesEntregues - atividadesSemAjuda) / atividadesEntregues;
    double razaoNaoEstudadas = atividadesNaoEstudadas / atividadesEntregues;
    double media = (razaoIa + razaoNaoExplicadas + razaoComAjuda + razaoNaoEstudadas) / 4;
    this.riscoPedagogico = media * 10;

  }

  public double getRiscoPedagogico() {
    return riscoPedagogico;
  }

  public String getRiscoLabel() {
    this.calcularRisco();
    if (riscoPedagogico <= 3.3) {
      return "BAIXO";
    }
    if (riscoPedagogico > 3.3 && riscoPedagogico < 6.6) {
      return "MODERADO";
    }
    return "ALTO";
  }

  public Aluno getAluno() {
    return this.aluno;
  }

  public void setAluno(Aluno aluno) {
    this.aluno = aluno;
  }

  public void setAtividadesEntregues(int atividadesEntregues) {
    this.atividadesEntregues = atividadesEntregues;
  }

  public void setAtividadesIA(int atividadesIA) {
    this.atividadesIA = atividadesIA;
  }

  public void setAtividadesExplicadas(int atividadesExplicadas) {
    this.atividadesExplicadas = atividadesExplicadas;
  }

  public void setAtividadesSemAjuda(int atividadesSemAjuda) {
    this.atividadesSemAjuda = atividadesSemAjuda;
  }

  public void setAtividadesNaoEstudadas(int atividadesNaoEstudadas) {
    this.atividadesNaoEstudadas = atividadesNaoEstudadas;
  }

}
