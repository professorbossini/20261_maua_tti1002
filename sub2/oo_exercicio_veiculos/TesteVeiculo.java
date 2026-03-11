public class TesteVeiculo {
  // no método main
  // construir dois veículos
  // atribuir valores a todas as variáveis de ambos
  // chamar os dois métodos de ambos
  public static void main(String[] args) {
    Veiculo v1 = new Veiculo();
    v1.setTipoCombustivel("Gasolina");
    boolean abasteceu = v1.abastecer();
    if(abasteceu){
      System.out.println("Sim, abasteceu, agora o tanque está cheio");
    }
    else{
      System.out.println("O tanque já estava cheio...");
    }
    v1.acelerar();
    System.out.println("Acabou");
  }
}