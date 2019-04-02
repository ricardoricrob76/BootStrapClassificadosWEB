/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;

import Conexao.ConexaoDBMysql;
//import Controlador.*;
import Bean.*;
import java.sql.*;
import javax.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author ricardoricrob
 */
public class DAOAnuncio {

    private ConexaoDBMysql co = ConexaoDBMysql.getInstance();
    private String sql = "",  sql1 = "";
    private PreparedStatement stmt = null;

    public DAOAnuncio(ConexaoDBMysql conn) {
        this.co = conn;
    }

    public ArrayList list() throws SQLException {
    ArrayList list = new ArrayList();
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      conn = co.getConnection();
      String sql = "SELECT idanuncio, textotitulo, preco, textoanuncio, nomecontato, telefone1, telefone2, datainsercao, ie_tipoanuncio, ie_cliente, ie_sessao FROM anuncio order by textotitulo";
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while(rs.next()) {
        Anuncio a = new Anuncio();
        
        a.setIdanuncio(rs.getInt(1));
        a.setTextotitulo(rs.getString(2));
        a.setPreco(rs.getFloat(3));
        a.setTextoanuncio(rs.getString(4));
        a.setNomecontato(rs.getString(5));
        a.setTelefone1(rs.getString(6));
        a.setTelefone2(rs.getString(7));
        a.setDatainsercao(rs.getString(8));
        a.setIe_tipoanuncio(rs.getInt(9));
        a.setIe_cliente(rs.getInt(10));
        a.setIe_sessao(rs.getInt(11));
                            
      //  c.setAssinante(rs.getString(4));
       list.add(a);
      }
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      rs.close();
      pstmt.close();
      conn.rollback();
      e.printStackTrace();
    } finally {
    	co.devolveconexao(conn);
    }
    return list;
  }

    public int insert(Anuncio anuncio) throws SQLException {
    String sql;
    int a = 0;
    sql = "INSERT INTO Anuncio (idanuncio, textotitulo, preco, textoanuncio, nomecontato, telefone1, telefone2, datainsercao, ie_tipoanuncio, ie_cliente, ie_sessao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      conn = co.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, anuncio.getIdanuncio());
      pstmt.setString(2, anuncio.getTextotitulo());
      pstmt.setFloat(3, anuncio.getPreco());
      pstmt.setString(4, anuncio.getTextoanuncio());
      pstmt.setString(5, anuncio.getNomecontato());
      pstmt.setString(6,anuncio.getTelefone1());
      pstmt.setString(7,anuncio.getTelefone2());
      pstmt.setString(8, anuncio.getDatainsercao());
      pstmt.setInt(9, anuncio.getIe_tipoanuncio());
      pstmt.setInt(10, anuncio.getIe_cliente());
      pstmt.setInt(11, anuncio.getIe_sessao());      
      
      a = pstmt.executeUpdate();
      pstmt.close();
//      conn.commit();
//      JOptionPane.showMessageDialog(null,"Registro Gravado com Sucesso");
      return a;
    } catch (SQLException sqle) {

      sqle.printStackTrace();
      throw sqle;
    } finally {
    	co.devolveconexao(conn);
    }
  }

    public int remover(Anuncio anuncio) throws SQLException{
        int a = 0;
        String sql;
         sql = "DELETE from Anuncio where idAnuncio = ?";
         Connection conn = null;
         PreparedStatement pstmt = null;
         ResultSet rs = null;
         try {
        conn = co.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, anuncio.getIdanuncio());
      a = pstmt.executeUpdate();
      pstmt.close();
//      conn.commit();
//      JOptionPane.showMessageDialog(null,"Registro Gravado com Sucesso");
      return a;
    } catch (SQLException sqle) {
      sqle.printStackTrace();
      throw sqle;
    } finally {
    	co.devolveconexao(conn);
    }
    }
}
