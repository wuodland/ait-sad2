/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycles;

import java.sql.*;

/**
 *
 * @author safi
 */
public class DBUtilities {
    private static DBUtilities instance;
    static int count=0;
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    public DBUtilities() throws SQLException {
        count++;
        try {
            connection = DriverManager.getConnection(Config.CONNECTION_URL, Config.DATABASE_USER_ID, Config.DATABASE_PASSWORD);
            System.out.println("Connection Successful");
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
    
    

    public static DBUtilities getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBUtilities();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBUtilities();
        }
        return instance;
    }
    
    
    
    public void ExecuteSQLStatementSelect(String sql_stmt) {
        try {
            statement = connection.createStatement();

            resultSet = statement.executeQuery(sql_stmt);
            
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }
    public void ExecuteSQLStatementUpdate(String sql_stmt) {
        try {
            statement = connection.createStatement();

            statement.executeUpdate(sql_stmt);
            
        } catch (SQLException ex) {
            System.out.println("The following error has occured: " + ex.getMessage());
        }
    }
    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
