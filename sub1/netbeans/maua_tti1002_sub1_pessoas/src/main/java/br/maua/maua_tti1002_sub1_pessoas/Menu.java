
package br.maua.maua_tti1002_sub1_pessoas;

import java.util.Scanner;
import java.util.List;
public class Menu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String menu = 
            "1-Cadastrar\n2-Visualizar\n3-Atualizar\n4-Remover\n0-Sair";
        int opcao;
        do{
            System.out.println(menu);
            opcao = leitor.nextInt();
            switch(opcao){
                case 1:{
                    try{
                        System.out.println("Digite o nome");
                        String nome = leitor.next();
                        System.out.println("Digite o fone");
                        String fone = leitor.next();
                        System.out.println("Digite o e-mail");
                        String email = leitor.next();
                        Pessoa p = new Pessoa(nome, fone, email);
                        p.cadastrar();
                        System.out.println("Cadastro OK");
                    }
                    catch(Exception e){
                        System.out.println("Cadastro falhou...");
                        e.printStackTrace();
                    }
                    break;
                }
                case 2:{
                    try{
                        List<Pessoa> pessoas = Pessoa.listar();
                        for(Pessoa p : pessoas){
                            System.out.println(p);
                        }
                    }
                    catch(Exception e){
                        System.out.println("Listagem falhou...");
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }while(opcao != 0);
    } 
}
