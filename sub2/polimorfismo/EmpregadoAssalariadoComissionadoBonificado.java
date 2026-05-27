package sub2.polimorfismo;

public class EmpregadoAssalariadoComissionadoBonificado extends Empregado {
  private double salario, comissao, bonus;

  public EmpregadoAssalariadoComissionadoBonificado(double salario, double comissao, double bonus){
    this.salario = salario;
    this.comissao = comissao;
    this.bonus = bonus;
  }

  @Override
  public double calcularSalario() {
    return salario + comissao * salario + bonus;
  }
}
