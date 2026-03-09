package br.maua;
import java.util.Random;
public class JogoV3 {
  public static void main(String[] args) throws Exception {
    Random gerador = new Random();
    Personagem p1 = new Personagem();
    p1.nome = "John";
    Personagem p2 = new Personagem(10, 0, 7);
    p2.nome = "Pedro";
    //p2.setSono(7);
    Personagem p3 = new Personagem(10, 8, 0);
    p3.nome = "Marcio";
    //p3.setFome(8);
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
      oQueFazer = gerador.nextInt(1, 11);
      switch(oQueFazer){
        case 1, 2, 3, 4, 5, 6:
          p2.dormir();
          break;
        case 7, 8:
          p2.comer();
          break;
        default:
          p2.cacar();
          break;
      }
      p1.exibirEstado();
      p2.exibirEstado();
      System.out.println("===========================");
      Thread.sleep(8000);
    }
  }    
}
