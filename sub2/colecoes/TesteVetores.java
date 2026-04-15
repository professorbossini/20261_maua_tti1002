public class TesteVetores {
  public static void main(String[] args) {
    int [] numeros = {42, 17, 8, 55, 23};
    //exibir os elementos do vetor
    //for comum
    for(int i = 0; i < numeros.length; i++){
      System.out.println(numeros[i]);
    }
    //enhanced for (Java 5+)
    //for each
    for(int numero : numeros){
      System.out.println(numero);
    }
    //criar o vetor
    //preenchido com zeros, pelo compilador
    // int [] numeros = new int [5]; 
    //preencher 1 a 1
    // numeros[0] = 42;
    // numeros[1] = 17;
    // numeros[2] = 8;
    // numeros[3] = 55;
    // numeros[4] = 23;
    // //erro em tempo de execução
    // numeros[5] = 99;
  }
}
