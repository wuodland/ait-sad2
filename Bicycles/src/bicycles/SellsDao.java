/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycles;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author safi
 */
public class SellsDao {
    DBUtilities dbUtilities;

    public SellsDao() throws SQLException {
        this.dbUtilities = new DBUtilities();
    }
    
        public Purchase getPurchase(int id){
            try
            {
                String sql_stmt = "SELECT buyer FROM Bicycle.purchases where id ="+id;
                Purchase p = new Purchase();
                p.id = id;
               // DBUtilities con = new DBUtilities();
               // Statement st = con.createStatement();
                
                dbUtilities.ExecuteSQLStatementSelect(sql_stmt);
                
                dbUtilities.resultSet.next();
                String name= dbUtilities.resultSet.getString(1);
                p.buyer = name;
                return p;
            } catch(SQLException ex)
              {
                    System.out.println(ex);
              }
            return null;
                
    }
        public void addPurchase(Purchase p){
            
            String sql_stmt = "INSERT INTO `Bicycle`.`purchases` (`buyer`, `Price`) VALUES ('"+p.buyer+"', "+p.price+")";
            dbUtilities.ExecuteSQLStatementUpdate(sql_stmt);
        }
        
           /* String userData = "";
            while(dbUtilities.resultSet.next()){
                userData = dbUtilities.resultSet.getInt(1)+dbUtilities.resultSet.getString(2)+dbUtilities.resultSet.getInt(3);
                System.out.println(userData); 
            }
            */
           // String id= dbUtilities.resultSet.getString(0);
           // String buyer= dbUtilities.resultSet.getString(1);
            //String price= dbUtilities.resultSet.getString(2);
            
            
        }



class Purchase{
    int id;
    String buyer;
    int price;

}