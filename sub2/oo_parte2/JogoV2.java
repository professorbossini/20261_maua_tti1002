import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception{
        Random gerador = new Random();
        Personagem cacador = new Personagem();
        cacador.nome = "John";
        Personagem guloso = new Personagem(5, 8, 0);
        guloso.nome = "Guloso";
        while(true){
            int oQueFazer = gerador.nextInt(1, 4);
            switch(oQueFazer){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;
            }
            oQueFazer = gerador.nextInt(1, 11);
            switch(oQueFazer){
                case 1, 2, 3, 4, 5, 6:
                    guloso.comer();
                    break;
                case 7, 8:
                    guloso.cacar();
                    break;
                default:
                    guloso.dormir();
                    break;
            }
            cacador.exibirEstado();
            guloso.exibirEstado();
            System.out.println("====================================");
            Thread.sleep(5000);
        }
    }    
}

