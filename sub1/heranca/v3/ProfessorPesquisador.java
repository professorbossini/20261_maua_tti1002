package sub1.heranca.v3;

public class ProfessorPesquisador extends Professor {
  public void pesquisar(){
    System.out.printf("%s pesquisando\n", getNome());
  }
}
