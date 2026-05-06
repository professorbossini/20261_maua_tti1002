package br.maua.maua_sub2_bd_pessoas;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
    private static String usuario = "avnadmin";
    private static String senha = "AVNS_s6tz4RCAM1SEVZ3gZ4K";
    private static String host = "mysql-25ee1db3-professorbossini.h.aivencloud.com";
    private static String porta = "12956";
    private static String db = "defaultdb";
    
    public static Connection obterConexao(){
        try{
            //string de conexão
            String s = String.format(
                "jdbc:mysql://%s:%s/%s",
                host, porta, db
            );
            Connection conexao = DriverManager.getConnection(
                s, usuario, senha
            );
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
