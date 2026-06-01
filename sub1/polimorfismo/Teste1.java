package sub1.polimorfismo;

public class Teste1 {
  public static void main(String[] args) {
    //variável polimórfica
    Animal g = new Gato();
    Animal c = new Cachorro();
    // Animal a = new Animal();
    //polimorfismo dinâmico
    g.fazerBarulho();
    c.fazerBarulho();
  }  
}
