package sub2.polimorfismo;

public class EmpregadoTarefeiro extends Empregado{
  private int numeroTarefas;
  private double valorTarefa;

  public EmpregadoTarefeiro (int numeroTarefas, double valorTarefa){
    this.numeroTarefas = numeroTarefas;
    this.valorTarefa = valorTarefa;
  }

  @Override
  public double calcularSalario() {
    return numeroTarefas * valorTarefa;
  }
}
