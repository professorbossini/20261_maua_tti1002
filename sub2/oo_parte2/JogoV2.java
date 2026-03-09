import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception{
        //adicionar um segundo personagem
        //dar um nome para ele
        //sortear separadamente o que ele tem que fazer
        //exibir o seu estado ao final tbm
        //desafio extra: fazer o personagem guloso, ou seja, ele tem maior probabilidade de comer
        //60% de probabilidade de comer, 30% de caçar e 10% de dormir
        Random gerador = new Random();
        Personagem cacador = new Personagem();
        cacador.nome = "John";
        //1: caçar
        //2: comer
        //3: dormir
        if( 4 <= oqueFazer && oqueFazer <= 5)
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
            cacador.exibirEstado();
            System.out.println("====================================");
            Thread.sleep(5000);
        }
    }    
}


if (a > 1 && a < 2)
