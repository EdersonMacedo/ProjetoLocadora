package br.com.edersonmacedo.locadorabanco.model.persistencia;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    //String de conexão do mySQL
    private static final String STR_CONEXAO = "jdbc:mysql://localhost:3306/";
    //Nome da base de dados criada no mySQL
    private static final String DATABASE = "locadoraDB";
    //Usuario do mySQL
    private static final String USER = "root";
    //Senha do MySQL
    private static final String PASSWORD = "";
    
    //metodo que retorna a conexão
    public static Connection getConnection() throws SQLException{
        try{
            return DriverManager.getConnection(STR_CONEXAO + DATABASE, USER, DATABASE);
    }catch(Exception e){
        throw new SQLException(e.getMessage());
    }
    }
    
    //Metodo que fecha a conexão
    public static void closeConnection(Connection con) throws SQLException{
        if(con !=null){
            con.close();
        }
    }
    public static void closeConnection(Connection con,Statement stmt) throws SQLException{
        if(stmt != null){
            stmt.close();
        }
        closeConnection(con);
    }
    //Metodo que fecha ResultSet
    public static void closeConnection(Connection con, Statement stmt, ResultSet rs)throws SQLException{
        if(rs!=null){
            rs.close();
        }
        closeConnection(con,stmt);
    }
}
