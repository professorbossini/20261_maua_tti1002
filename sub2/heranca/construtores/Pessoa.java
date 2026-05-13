package sub2.heranca.construtores;

public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade){
    System.out.println("Construindo pessoa...");
    this.nome = nome;
    this.idade = idade;
  }
}
