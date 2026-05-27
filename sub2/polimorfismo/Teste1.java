package sub2.polimorfismo;

public class Teste1 {
  public static void main(String[] args) {
    //variáveis polimorficas
    Animal g = new Gato();
    Animal c = new Cachorro();
    g.fazerBarulho();
    c.fazerBarulho();
    // Animal a = new Animal();
    // a.fazerBarulho();
  }
}
