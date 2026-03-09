public class TestePersonagem {
    public static void main(String[] args) {
        //construir um personagem
        Personagem p1 = new Personagem();
        p1.nome = "Enzo";
        //fazê-lo caçar, comer e dormir
        p1.cacar();
        p1.comer();
        p1.dormir();
    }
}