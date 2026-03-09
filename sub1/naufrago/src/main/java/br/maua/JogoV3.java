package br.maua;
import java.util.Random;
public class JogoV3 {
  public static void main(String[] args) throws Exception {
    Random gerador = new Random();
    Personagem p1 = new Personagem();
    p1.nome = "John";
    while(true){
      int oQueFazer = gerador.nextInt(1, 4);
      switch(oQueFazer){
        case 1:
          p1.cacar();
          break;
        case 2:
          p1.comer();
          break;
        case 3:
          p1.dormir();
          break;
      }
      p1.exibirEstado();
      System.out.println("===========================");
      Thread.sleep(8000);
    }
  }    
}
