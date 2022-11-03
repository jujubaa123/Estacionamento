/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;
import connection.ConnectionFactory;
import model.bean.Motorista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author 03832903097
 */
public class MotoristaDAO {
    public void create(Motorista m){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement("INSERT INTO motorista (nome, genero, RG, CPF, celular, email, senha) VALUES (?,?,?,?,?,?,?)");
            stmt.setString(1, m.getNome());
            stmt.setString(2, m.getGenero());
            stmt.setInt(3, m.getRg());
            stmt.setInt(4, m.getCpf());
            stmt.setInt(5, m.getCelular());
            stmt.setString(6, m.getEmail());
            stmt.setString(7, m.getSenha());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Motorista salvo com sucesso!");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }


public List<Motorista> read(){
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Motorista> motoristas = new ArrayList<>();
        
       try{
           stmt = con.prepareStatement("SELECT * FROM motorista;");
           rs = stmt.executeQuery();
           while(rs.next()){
               Motorista m = new Motorista();
               m.setIdMotorista(rs.getInt("idMotorista"));
               m.setNome(rs.getString("nome"));
               m.setGenero(rs.getString("genero"));
               m.setRg(rs.getInt("rg"));
               m.setCpf(rs.getInt("cpf"));
               m.setEmail(rs.getString("email"));
               m.setSenha(rs.getString("senha"));
               motoristas.add(m);
           }
       } catch (SQLException e){
           throw new RuntimeException("Erro ao buscar os dados: ", e);
       } finally{
           ConnectionFactory.closeConnection(con, stmt, rs);
       }
        return motoristas;
       }

}
