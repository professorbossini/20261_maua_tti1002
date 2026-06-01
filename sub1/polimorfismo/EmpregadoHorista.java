package sub1.polimorfismo;

public class EmpregadoHorista extends Empregado {
  private int numeroHoras;
  private double valorHora;

  public EmpregadoHorista(int numeroHoras, double valorHora){
    this.numeroHoras = numeroHoras;
    this.valorHora = valorHora;
  }

  @Override
  public double calcularSalario() {
    return numeroHoras * valorHora;
  }
}
