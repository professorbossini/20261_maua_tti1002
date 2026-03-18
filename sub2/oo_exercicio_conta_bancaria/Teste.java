import java.util.Random;
public class Teste {
  public static void main(String[] args) throws Exception{
    Random gerador = new Random();
    ContaBancaria conta1 = new ContaBancaria("Ana", "123456", 1000);
    ContaBancaria conta2 = new ContaBancaria("João", "555555", 1000);
    while(true){
      int qualConta = gerador.nextInt(1, 3);
      int qualOperacao = gerador.nextInt(1, 4);
      double qualValor = gerador.nextDouble(1, 500);
      switch(qualConta){
        case 1:
            if(qualOperacao == 1){
              System.out.printf("=== Operação : DEPÓSITO na conta de %s ===\n", conta1.getTitular());
              conta1.depositar(qualValor);
            }
            else if(qualOperacao == 2){
              System.out.printf("=== Operação: SAQUE na conta de %s ===\n", conta1.getTitular());
              conta1.sacar(qualValor);
            }
            else{
              System.out.printf(
                "=== Operação: TRANSFERÊNCIA de %s para %s ===\n",
                conta1.getTitular(),
                conta2.getTitular()
              );
              conta1.transferir(conta2, qualValor);
            }
          break;
        case 2:
          System.out.println("Caiu no case 2");
          break;
      }
      conta1.exibirExtrato();
      conta2.exibirExtrato();
      Thread.sleep(8000);
    }
  }  
}
