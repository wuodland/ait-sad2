/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bicycles;

/**
 *
 * @author safi
 */
public class Config {
    public static final String DATABASE_NAME = "Bicycle";
    public static final String DATABASE_SERVER = "localhost:3306";
    public static final String DATABASE_USER_ID = "safi";
    public static final String DATABASE_PASSWORD = "safe0";
    public static final String CONNECTION_URL = "jdbc:mysql://" + DATABASE_SERVER + "/" + DATABASE_NAME;
    
}
