
public class ContaBancaria {
  private String titular;
  private String numero;
  private double saldo;

  public ContaBancaria(String titular, String numero, double saldo){
    this.titular = titular;
    this.numero = numero;
    setSaldo(saldo);
  }
  
  public void setSaldo(double saldo){
    if(saldo >= 0)
      this.saldo = saldo;
  }

  public String getTitular(){
    return titular;
  }
  
  public void depositar(double valor){
    if (valor <= 0){
      System.out.println("Erro: Valor de depósito deve ser positivo");
    } 
    else{
      // saldo = saldo + valor;
      saldo += valor;
      System.out.printf("Depósito de R$%.2f realizado com sucesso\n", valor);
    } 
  }
  
  public void sacar(double valor){
    if(valor <= 0){
      System.out.println("Erro: o valor de saque deve ser positivo."); 
    }
    else if (valor > saldo){
      System.out.println(
        "Erro: saldo insuficiente para sacar R$" + String.format("%.2f", valor)
      );
    }
    else{
      saldo -= valor;
      System.out.printf("Saque de R$%.2f realizado com sucesso.\n", valor);  
    }
  }
  
  public void transferir(ContaBancaria destino, double valor){
    if(valor <= 0){
      System.out.println("Erro: valor de transferência deve ser positivo.");
    }
    else if(valor > saldo){
      System.out.printf("Saldo insuficiente para transferir R$%.2f\n", valor);
    } 
    else{
      saldo -= valor;
      destino.saldo += valor;
      System.out.printf(
        "Valor de R$%.2f transferido de %s para %s\n", 
        valor, titular, destino.titular
      );
    }  
  }
  
  public void consultarSaldo(){
    System.out.printf(
      "Conta: %s | Titular: %s | Saldo: R$%.2f\n", 
      numero, titular, saldo
    );
  }

  public void exibirExtrato(){
    System.out.println("--- Extrato ---");
    System.out.println("Titular: " + titular);
    System.out.println("Conta: " + numero);
    System.out.printf("Valor: R$%.2f\n", saldo);
    System.out.println("---------------------");  
  }
}
