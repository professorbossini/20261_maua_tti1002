package sub2.polimorfismo;
import java.util.*;
public class TestePolimorfismoEmpregados {
  public static void main(String[] args) {
    Random gerador = new Random();
    List <Empregado> empregados = new ArrayList<>();
    for(int i = 0; i < 10; i++){
      int tipo = gerador.nextInt(1, 6);
      switch(tipo){
        case 1:{
          double salario = gerador.nextDouble() * 1000 + 1000;
          empregados.add(new EmpregadoAssalariado(salario));
          break;
        }
        case 2:{
          //800 e 1300
          double salario = gerador.nextDouble() * 500 + 800;
          double comissao = gerador.nextDouble();
          empregados.add(new EmpregadoAssalariadoComissionado(salario, comissao));
          break;
        }
        case 3:{
          double salario = gerador.nextDouble() * 300 + 500;
          double comissao = gerador.nextDouble();
          double bonus = gerador.nextDouble() * 100 + 200;
          empregados.add(new EmpregadoAssalariadoComissionadoBonificado(salario, comissao, bonus));
          break;
        }
        case 4:{
          double valorHora = gerador.nextDouble() * 10 + 50;
          int numeroDeHoras = gerador.nextInt(100, 501);
          empregados.add(new EmpregadoHorista(valorHora, numeroDeHoras));
          break;
        }
        case 5:{
          double valorTarefa = gerador.nextDouble() * 50 + 50;
          int numeroTarefas = gerador.nextInt(500, 1001);
          empregados.add(new EmpregadoTarefeiro(numeroTarefas, valorTarefa));
          break;
        }
      }
    }    
    //processamento da folha
    //for each
    //princípio aberto/fechado
    for (Empregado empregado : empregados){
      System.out.println(empregado.calcularSalario());
    }
  }
}
