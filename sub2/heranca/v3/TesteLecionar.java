package sub2.heranca.v3;

public class TesteLecionar {
  public static void main(String[] args) {
    ProfessorPesquisador pp = new ProfessorPesquisador();
    pp.lecionar();
    pp.setNome("José");
    System.out.println(pp.getNome());
  }
}
