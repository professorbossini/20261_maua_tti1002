
package br.maua.maua_tti1002_sub1_pessoas;

import java.util.Scanner;
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
                
                    break;
                }
            }
        }while(opcao != 0);
    } 
}
