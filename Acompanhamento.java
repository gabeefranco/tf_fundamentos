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
    this.calcularRisco();
    return riscoPedagogico;
  }

  public String getRiscoLabel() {
    this.calcularRisco();
    if (riscoPedagogico <= 3.3) {
      return "O risco pedagógico deste aluno é BAIXO";
    }
    if (riscoPedagogico > 3.3 && riscoPedagogico < 6.6) {
      return "O risco pedagógico deste aluno é MODERADO";
    }
    if (riscoPedagogico >= 6.6) {
      return "O risco pedagógico deste aluno é ALTO";
    }
    return Erro.E7;
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

  public boolean setAtividadesIA(int atividadesIA) {
    if (atividadesIA > atividadesEntregues) {
      return true;
    }
    this.atividadesIA = atividadesIA;
    return false;
  }

  public boolean setAtividadesExplicadas(int atividadesExplicadas) {
    if (atividadesExplicadas > atividadesEntregues) {
      return true;
    }
    this.atividadesExplicadas = atividadesExplicadas;
    return false;
  }

  public boolean setAtividadesSemAjuda(int atividadesSemAjuda) {
    if (atividadesSemAjuda > atividadesEntregues) {
      return true;
    }
    this.atividadesSemAjuda = atividadesSemAjuda;
    return false;
  }

  public boolean setAtividadesNaoEstudadas(int atividadesNaoEstudadas) {
    if (atividadesNaoEstudadas > atividadesEntregues) {
      return true;
    }
    this.atividadesNaoEstudadas = atividadesNaoEstudadas;
    return false;
  }
}