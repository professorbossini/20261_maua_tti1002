package br.maua;

public class JogoV2 {
    public static void main(String[] args) throws Exception{
        Personagem p1 = new Personagem();
        p1.nome = "Márcio";
        while(true){
            p1.cacar();
            p1.comer();
            p1.dormir();
            p1.cacar();
            p1.cacar();
            p1.cacar();
            p1.exibirEstado();
            System.out.println("===================");
            Thread.sleep(8000);
        }
    }
}
