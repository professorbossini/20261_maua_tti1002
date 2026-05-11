
package br.maua.maua_sub2_bd_pessoas;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class Pessoa {
    private int codigo;
    private String nome;
    private String fone;
    private String email;
    
    Pessoa(String nome, String fone, String email){
        this.nome = nome;
        this.fone = fone;
        this.email = email;
    }
    
    Pessoa(int codigo, String nome, String fone, String email){
        this(nome, fone, email);
        this.codigo = codigo;
    }
    
    Pessoa(int codigo){
        this.codigo = codigo;
    }
    
    //sobrescrita override
    public String toString(){
        return String.format(
            "%d, %s, %s, %s",
            codigo, nome, fone, email
        );
    }
    
    //cláusula catch or declare do Java
    public void cadastrar() throws Exception {
        //Exercício de IA para ser feito em 3 minutos
        //1. Definir o comando SQL
        String sql = 
            "INSERT INTO tb_pessoa (nome, fone, email) VALUES (?, ?, ?);";
        //2. Estabelecer conexão com o banco
        Connection conexao = ConnectionFactory.obterConexao();
        //3. Pré compilar o comando
        PreparedStatement ps = conexao.prepareStatement(sql);
        //4. Substituir os eventuais placeholders
        ps.setString(1, nome);
        ps.setString(2, fone);
        ps.setString(3, email);        
        //5. Executar o comando
        ps.executeUpdate();
        //6. Fechar os recursos
        ps.close();
        conexao.close();
    }

    //claúsula catch or declare do Java
    //mapeamento objeto relacional: object relational mapping ORM
    public static List <Pessoa> listar() throws Exception{
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        //1. Definir o comando SQL
        String sql = "SELECT * FROM tb_pessoa";
        //2. Estabelecer uma conexão com o BD
        //3. Preparar o comando
        //4. Substituir os eventuais placeholders
        //5. Executar o comando
        //try-with-resources (Java 7+)
        try(
            Connection conexao = ConnectionFactory.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        ){
            //6. Tratar o resultado
            while(rs.next()){
                int codigo = rs.getInt("cod_pessoa");
                String nome = rs.getString("nome");
                String fone = rs.getString("fone");
                String email = rs.getString("email");
                Pessoa p = new Pessoa(codigo, nome, fone, email);
                pessoas.add(p);
            }
            //7. Fechar os recursos
            //já foi feito pelo try-with-resources
        }
        return pessoas;
    }
    
    public void atualizar() throws Exception{
        String sql = 
        "UPDATE tb_pessoa SET nome=?,fone=?,email=? WHERE cod_pessoa=?";
        //try-with-resources
        try(
            Connection conexao = ConnectionFactory.obterConexao();
            PreparedStatement ps = conexao.prepareStatement(sql);
        ){
            ps.setString(1, nome);
            ps.setString(2, fone);
            ps.setString(3, email);
            ps.setInt(4, codigo);
            ps.executeUpdate();
        }
    }
    
    public void remover() throws Exception{
        String sql = "DELETE FROM tb_pessoa WHERE cod_pessoa = ?";
        Connection conexao = ConnectionFactory.obterConexao();
        PreparedStatement ps = conexao.prepareStatement(sql);
        ps.setInt(1, codigo);
        ps.executeUpdate();
        ps.close();
        conexao.close();
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
