package sub1.heranca.v3;

public class TesteLecionar {
  public static void main(String[] args) {
    ProfessorPesquisador pp = new ProfessorPesquisador();
    ProfessorHorista ph = new ProfessorHorista();
    pp.setNome("José");
    ph.setNome("João");
    pp.lecionar();
    ph.lecionar();
  }
}
