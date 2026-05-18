package sub1.heranca.construtores;

public class Pessoa {
  private String nome;
  private int idade;

  public Pessoa(String nome, int idade){
    System.out.println("Construindo pessoa...");
    setNome(nome);
    setIdade(idade);
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
