package sub2.polimorfismo;

public class EmpregadoHorista extends Empregado{
  private double valorHora;
  private int numeroDeHoras;

  public EmpregadoHorista(double valorHora, int numeroDeHoras){
    this.valorHora = valorHora;
    this.numeroDeHoras = numeroDeHoras;
  }
  
  @Override
  public double calcularSalario() {
    return valorHora * numeroDeHoras;
  }
}
