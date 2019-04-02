/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexao;

import java.sql.*;

public class ConexaoDBMysql {

//  static ResourceBundle res = ResourceBundle.getBundle("siscep.Res");
  private static boolean DEBUG = false;
  private Connection connection;

  private final String driver = "org.gjt.mm.mysql.Driver";

 // Parametros de Produção - Tauceti.

  private static ConexaoDBMysql rep = new ConexaoDBMysql();


  private ConexaoDBMysql() { }

  static { try {
     // Connection connection = null;
      //Class.forName("org.postgresql.Driver");
      //Driver do Mysql.
      Class.forName("org.gjt.mm.mysql.Driver");

    }
    catch (ClassNotFoundException cex) {
      //System.out.println("nao_achei_o_drive_do Banco de Dados");
      //throw new Exception("_Nenhum_driver_dispon");
    }
  }

  public static  synchronized ConexaoDBMysql getInstance(){
      if (rep == null){
          rep = new ConexaoDBMysql();
      }
      return rep;
  }

  public static Connection getConnection() throws SQLException {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dbclassificados"+"?user=root&password=72255560");
    }
    catch (SQLException sex) {
       throw new SQLException(sex.getMessage());
     }
    return connection;
  }
  public static void devolveconexao(Connection connection) {
   try {
     connection.close();
   }
   catch (Exception ex) {

   }

  }
}//Fim de Classe
