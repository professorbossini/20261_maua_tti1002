package sub2.polimorfismo;

//Cachorro passa no teste É-UM Animal
public class Cachorro extends Animal{

  @Override
  public void fazerBarulho() {
    System.out.println("Au au");
  }
}
