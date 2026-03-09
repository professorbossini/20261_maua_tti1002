public class Personagem{
    String nome;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    //métodos
    //tipo de retorno, nome, lista de parâmetros, corpo
    void cacar(){
        // if energia >=2 :
        if(energia >= 2){
            System.out.println(nome + " caçando...");
            energia = energia - 2;
        }
        else{
            System.out.printf("%s sem energia para caçar\n", nome);
        }
        if (fome < 10)
            fome = fome + 1;
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if(fome >= 1){
            //John comendo
            System.out.printf("%s comendo\n", nome);
            // fome = fome - 1;
            // fome -= 1;
            fome--;
            // --fome;
            // operador ternário ou if/else de uma linha só
            energia = energia < 10 ? energia + 1 : energia;
        }
        else{
            System.out.printf("%s sem fome\n", nome);
        }
    }
    
    void dormir(){
        if(sono > 0){
            System.out.print(nome + " dormindo\n");
            sono -= 1;
            switch(energia){
                case 10:
                    break;
                default:
                    energia = energia + 1;
            }
        }
        else{
            System.out.print(nome + " sem sono\n");
        }
    }

    void exibirEstado(){
        System.out.printf("%s: e: %d, f: %d, s: %d\n", nome, energia, fome, sono);
    }
}