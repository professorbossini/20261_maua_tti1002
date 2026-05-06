
package br.maua.maua_sub2_bd_pessoas;

import java.util.Scanner;
import java.util.List;
public class Menu {
    public static void main(String[] args) throws Exception{
        String menu = 
            "1-Cadastrar\n2-Visualizar\n3-Atualizar\n4-Apagar\n0-Sair";
        int opcao;
        Scanner leitor = new Scanner(System.in);
        do{
            System.out.println(menu);
            opcao = leitor.nextInt();
            switch(opcao){
                case 1:{
                    System.out.println("Digite o nome:");
                    String nome = leitor.next();
                    System.out.println("Digite o fone:");
                    String fone = leitor.next();
                    System.out.println("Digite o e-mail:");
                    String email = leitor.next();
                    Pessoa p = new Pessoa(nome, fone, email);
                    p.cadastrar();
                    System.out.println("Pessoa cadastrada!");
                    break;
                }
                case 2:{
                    List <Pessoa> pessoas = Pessoa.listar();
                    //for each e mostrar os dados de cada pessoa
                    for(Pessoa p : pessoas){
                        System.out.printf(
                            "%d, %s, %s, %s\n",
                            p.getCodigo(), p.getNome(), p.getFone(), p.getEmail()
                        );
                    }
                    break;
                }
            }
        }while(opcao != 0);
        
    }
}
