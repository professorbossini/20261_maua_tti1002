
package br.maua.maua_tti1002_sub1_pessoas;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
    private static String usuario = "root";
    private static String senha = "123456";
    private static String host = "localhost";
    private static String port = "3306";
    private static String db = "20261_maua_tti1002_sub1_pessoas";
    
    public static Connection obterConexao(){
        try{
            String s = String.format(
                "jdbc:mysql://%s:%s/%s",
                host, port, db
            );
            Connection conexao = 
                DriverManager.getConnection(s, usuario, senha);
            return conexao;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(obterConexao());
    }
}

