package br.maua;

public class Personagem {
    //variáveis
    String nome;
    private int energia;
    private int fome;
    private int sono;

    //construtor padrão
    Personagem(){
        energia = 10;
        fome = 0;
        sono = 0;
    }
    
    Personagem(int energia, int fome, int sono){
        setEnergia(energia);
        setFome(fome);
        setSono(sono);            
    }

    void setEnergia(int energia){
        if(energia >= 0 && energia <= 10)
            this.energia = energia;
    }

    void setSono(int sono){
        if(sono >= 0 && sono <= 10)
            this.sono = sono;    
    }

    void setFome(int fome){
        if(fome >= 0 && fome <= 10)
            this.fome = fome;
    }

    void cacar(){
        // if energia >= 2:
        if(energia >= 2){
            System.out.print(nome + " caçando\n");
            energia = energia - 2;
        }
        else{
            System.out.println(nome + " sem energia para caçar...");
        }
        if(fome < 10)
            fome = fome + 1;
        if(sono < 10)
            sono = sono + 1;
    }

    void comer(){
        if(fome >= 1){
            System.out.printf("%s comendo\n", nome);
            fome = fome - 1;
            if(energia < 10)
                energia += 1;
        }
        else{
            System.out.printf("%s sem fome\n", nome);
        }
    }

    void dormir(){
        if(sono >= 1){
            System.out.printf("%s dormindo\n", nome);
            energia = Math.min(energia + 1, 10);
            sono = Math.max(sono - 1, 0);
        }
        else{
            System.out.printf("%s sem sono\n", nome);
        }
    }

    void exibirEstado(){
        System.out.printf(
            "%s: e: %d, f: %d, s: %d\n",
            nome, energia, fome, sono
        );
        // print(f'{nome}: e: {energia}, f: {fome}, s: {sono}')
    }

}
