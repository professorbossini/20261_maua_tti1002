
package br.maua.maua_tti1002_sub1_pessoas;
//mapeamento objeto relacional
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;
    
    public Pessoa(String nome, String fone, String email){
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
    
    public Pessoa(int codigo, String nome, String fone, String email){
        this(nome, fone, email);
        this.codigo = codigo;
    }
    
    //cláusula catch or declare
    public void cadastrar() throws Exception{
        //1. Definir o comando SQL
        String sql = 
            "INSERT INTO tb_pessoa(nome, fone, email) VALUES(?, ?, ?)";
        //2. Estabelecer uma conexão com o BD
        Connection conexao = ConnectionFactory.obterConexao();
        //3. Preparar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, fone);
        ps.setString(3, email);
        ps.executeUpdate();
        ps.close();
        conexao.close();        
    }

    public static List <Pessoa> listar() throws Exception{
        List <Pessoa> pessoas = new ArrayList<>();
        //1. Definir o comando SQL
        String sql = "SELECT * FROM tb_pessoa";
        //try-with-resources
        try(
            Connection conexao = ConnectionFactory.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        ){
            while(rs.next()){
                int codigo = rs.getInt("cod_pessoa");
                String nome = rs.getString("nome");
                String fone = rs.getString("fone");
                String email = rs.getString("email");
                Pessoa p = new Pessoa(codigo, nome, fone, email);
                pessoas.add(p);
            }
            return pessoas;
        }
    }
    
    public String toString(){
        return String.format(
            "%d, %s, %s, %s",
            codigo, nome, fone, email
        );
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
