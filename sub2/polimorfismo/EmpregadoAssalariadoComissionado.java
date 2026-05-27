package sub2.polimorfismo;

public class EmpregadoAssalariadoComissionado extends Empregado {

  private double salario;
  private double comissao;

  public EmpregadoAssalariadoComissionado (double salario, double comissao){
    this.salario = salario;
    this.comissao = comissao;
  }

  @Override
  public double calcularSalario() {
    return salario + salario * comissao;
  }
}
