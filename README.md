# AIT Software Architecture Design, Assignment 2
The system we have developed is for purchasing cycles based on various options available while ordering a bicycle. Like, does end user need gears on their bike or not? Or do they neede an adult bicycle or kids one and some other options. <br/>
We've developed the system using Java, on the Netbeans IDE.
### Team-members and Responsibilities:
* Abhinav Singha, 120278 <br/>
Implementation of Decorator design pattern for creation of objects.
* Abdulrahman Safi, 119799 <br/>
Implementation of Data-Access object and fixing various UI elements.
* Karan Raj Baruah, 119967 <br/>
Made the user-interface of the appication and to also make the Singleton pattern. Also responsible for UML diagrams and documentation.
<br/>
### Describe each design pattern you use <br/>

**Decorator** : This design pattern is one that allows behavior to be added for singular object. Adding this new behavior should not effect the behaviour of other objects of the same class in any way. <br/>

**Singleton** : This design pattern is one that restricts the instantiation of a class to one "single" instance. This is useful when exactly one object is needed to coordinate actions across the system. <br/>

**DAO** : This is a pattern that provides an abstract interface to some type of database or other persistence mechanism. By mapping application calls to the persistence layer, the DAO provides some specific data operations without exposing details of the database. <br />

### When to use such patterns?

**Decorator** : In situations where inheritence is needed and we don't want to disturb the functionality of previously created objects, we use decorator. <br/>

**Singleton** : Ideally, Singleton is used in scenarios where a particular resource is used to access by the whole application. Like any shared resource. <br/>

### Describe your implementation briefly
Decorator: <br/>
>
    abstract class bikedecorator implements bike {
    
    protected bike tempbike;
    
    public bikedecorator(bike newbike){
        tempbike =newbike;
    }
    public String getDescription(){
        return tempbike.getDescription();
    }
    
    
    public int getCost(){
        return tempbike.getCost();
     
 Through this we use decorator to call different classes and create bike
>
     basicbike = new type(new gears(new Basic())); 
  

<br/>
Singleton:
<br/>


 > 
        public static DBUtilities getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBUtilities();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBUtilities();
        }
        return instance;
        }

<br / >

DAO:

>

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


###  UML diagrams/graphs explaining the app architecture <br/>
 ![Link to Diagram](https://raw.githubusercontent.com/wuodland/ait-sad2/master/uml.jpg)


### Should I be obsessed with Design Patterns and always apply when possible? When should one apply or not apply Design Patterns? <br/>
Design patters are a very good practice when creating a system. Especially on larger projects such as when we have to reuse classes or encapsulate our concerns so that they are not visible for everyone we should use Design Patterns. However, especially in smaller projects and applications Design Patterns may end up doing harm than good. They will increase the complexity and the LOC of the project whereas we could've Kept Things Short and Simple(KISS principle). <br/>
So we should check whether they are really required and are actually helping the long term maintainability of the project.

### Are you satisfied with your code implementations?  Discuss in terms of future maintainability. (Imagine your app will grow to 10 million users) <br/>
It's a single user desktop application for use by users in shops or showrooms when buying a bicycle. Hence provided we are able to maintain the database correctly when number of users go up we will be able to use for 10 million users. <br/>



### What is an anti pattern?  <br/>

An anti-pattern, similar to a Design pattern, is a pattern that is commonly used to solve problems. However, they are not effective at solving the problems. In many cases, they are actually counter productive. They do more harm than good, to the program in the long run. <br/> 
### What are some examples of Anti pattern? 
- **Race Hazard** : There might be certain functions or classes that interfere with each other in a negative way in runtime that may lead to problems. When such a situation arises, it is called Race Hazard.

<br />

- **God object** : In OOP, God object refers to an object that has way too much functionality in itself and has the majority of the functions in a single part of the design.
------------------------------------------------------------------------------


## Link to presentation: https://goo.gl/8zyHP5
