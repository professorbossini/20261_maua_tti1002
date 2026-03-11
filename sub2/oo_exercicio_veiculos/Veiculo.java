public class Veiculo {
  // adicionar três propriedades
  // encapsular as propriedades
  private String tipoCombustivel = "flex";
  private double velocidade = 0;
  private double aceleracao = 0;
  private boolean tanqueCheio = false;

  // escrever os métodos setters para todas
  public void setTipoCombustivel(String tipoCombustivel) {
    if (tipoCombustivel.equals("flex") || tipoCombustivel.equals("Gasolina") || tipoCombustivel.equals("etanol"))
      this.tipoCombustivel = tipoCombustivel;

  }

  public void setVelocidade(double velocidade){
    if(velocidade >= 0)
      this.velocidade = velocidade;
  }

  public void setAceleracao(double aceleracao) {
    this.aceleracao = aceleracao;
  }

    // definir dois comportamentos que um veículo tem
  public boolean abastecer(){
    if(!tanqueCheio){
      System.out.println("Abastecendo...");
      tanqueCheio = true;
      return true;
    }
    else{
      return false;
    }
  }

  public void acelerar(){
    tanqueCheio = false;
    System.out.println("Acelerando...");
  }

}
