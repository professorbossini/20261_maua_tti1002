
package br.maua.maua_tti1002_sub1_pessoas;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_Yx8-gCKGPhV2tX6tL2z";
    private static String host = "mysql-7effebb-professorbossini.i.aivencloud.com";
    private static String port = "12956";
    private static String db = "defaultdb";
    
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

