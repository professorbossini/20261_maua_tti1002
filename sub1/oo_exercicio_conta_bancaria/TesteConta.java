import java.util.Random;
public class TesteConta {
  public static void main(String[] args) throws Exception {
    Random gerador = new Random();
    ContaBancaria c1 = new ContaBancaria("Ana", "1234/4", 1000);
    ContaBancaria c2 = new ContaBancaria("José", "555/6", 1000);
    while(true){
      int contaAtiva = gerador.nextInt(1, 3);
      int operacao = gerador.nextInt(1, 4);
      double valor = gerador.nextDouble(1, 501);
      switch(contaAtiva){
        case 1:
          if(operacao == 1){
            c1.sacar(valor);
          }
          else if(operacao == 2){
            c1.depositar(valor);
          }
          else{
            c1.transferir(c2, valor);
          }
          break;
        case 2:
          switch(operacao){
            case 1:
              c2.sacar(valor);
              break;
            case 2:
              c2.depositar(valor);
              break;
            case 3:
              c2.transferir(c1, valor);
              break;
          }
          break;
      }
      
      System.out.println();
      c1.exibirExtrato();
      System.out.println();
      c2.exibirExtrato();
      System.out.println();
      Thread.sleep(8000);
    }
  }
}
