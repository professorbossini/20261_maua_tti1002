package sub1.heranca.construtores;

public class Aluno extends Pessoa{
  public Aluno(String nome, int idade){
    super(nome, idade);
    System.out.println("Construindo aluno...");
  }
}
