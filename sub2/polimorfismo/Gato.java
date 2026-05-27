package sub2.polimorfismo;

public class Gato extends Animal{
  //sobrescrita de métodos (ou sobreposição)
  //personalizamos o funcionamento de um método herdado
  @Override
  public void fazerBarulho() {
    System.out.println("Miau");
  }
}
