package sub2.polimorfismo;

public class EmpregadoAssalariado extends Empregado {

  private double salario;

  public EmpregadoAssalariado(double salario){
    this.salario = salario;
  }
  @Override
  public double calcularSalario() {
    return salario;
  }
}
