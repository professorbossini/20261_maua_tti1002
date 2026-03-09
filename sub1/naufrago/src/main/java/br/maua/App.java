package br.maua;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        //construir um objeto do tipo personagem
        Personagem p1 = new Personagem();
        //dar um nome para ele
        p1.nome = "Brian";
        //fazer com que ele caçe, coma e durma
        p1.cacar();
        p1.comer();
        p1.dormir();

    }
}
