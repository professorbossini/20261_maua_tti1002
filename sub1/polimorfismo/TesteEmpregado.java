package sub1.polimorfismo;

import java.util.*;
public class TesteEmpregado {
  public static void main(String[] args) {
    List<Empregado> empregados = new ArrayList<Empregado>();
    Random gerador = new Random();
    for(int i = 0; i < 10; i++){
      int tipo = gerador.nextInt(0, 3);
      switch(tipo){
        case 0:{
          double salario = gerador.nextDouble() * 1500 + 1700;
          empregados.add(new EmpregadoAssalariado(salario));
          break;
        }
        case 1:{
          double salario = gerador.nextDouble() * 1000 + 1500;
          double comissao = gerador.nextDouble();
          empregados.add(new EmpregadoAssalariadoComissionado(salario, comissao));
          break;
        }
        case 2:{
          int numeroHoras = gerador.nextInt(200, 301);
          double valorHora = gerador.nextDouble() * 100 + 120;
          empregados.add(new EmpregadoHorista(numeroHoras, valorHora));
          break;
        }
      }
    }
    //processamento da folha (polimorfismo acontece aqui)
    for(Empregado e : empregados){
      System.out.printf("R$%.2f\n", e.calcularSalario());
    }
  }
}
