public class ContaBancaria {
  private String titular;
  private String numero;
  private double saldo;

  public ContaBancaria(String titular, String numero, double saldo){
    this.titular = titular;
    this.numero = numero;
    this.saldo = saldo;  
  }
  
  public void depositar(double valor){
    if(valor > 0){
      saldo = saldo + valor;
      System.out.println("Depósito OK.");
    }
    else{
      System.out.println("Depósito NOK. Valor deve ser positivo.");
    }
  }

  public void sacar(double valor){
    if (valor > 0 && valor <= saldo){
      System.out.println("Saque OK.");
      valor -= saldo;
    }
    else{
      System.out.println("O valor deve ser positivo e, no máximo, igual ao seu saldo.");
    }
  }

  public void transferir(ContaBancaria destino, double valor){
    if (valor <= 0 || valor > saldo){
      System.out.println("Transferência NOK.");
    }
    else{
      sacar(valor);
      destino.depositar(valor);
      System.out.println("Transferência OK.");
      // saldo -= valor;
      // destino.saldo += valor;
    }
  }

  public void consultarSaldo(){
    System.out.printf(
      "Conta: %s | Titular: %s | Saldo: R$ %.2f\n",
      numero, titular, saldo
    );
  }

  public void exibirExtrato(){
    System.out.println("--- Extrato ---");
    System.out.println("Titular: " + titular);
    System.out.println("Conta: " + numero);
    System.out.printf("Saldo: R$%.2f\n", saldo);
    System.out.println("------------------");
  }
}
