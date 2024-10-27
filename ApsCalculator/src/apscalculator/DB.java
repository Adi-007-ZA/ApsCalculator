package apscalculator;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DB
{
  //To declare a connection  to the database.
  Connection conn = null;
  //To declare a statement to execute SQL.
  private Statement stmt = null;
  
 
  public DB()
  {
    //Creating connection to database.  
    try
    {
       String host ="jdbc:ucanaccess://"+System.getProperty("user.dir") 
            +"//apsDatabase.accdb";
       conn = DriverManager.getConnection(host);
  }
  catch(SQLException err)
  {
      System.out.println(err);
}
}
public ResultSet queryTbl (String sqlStmt) throws SQLException
{
  //To return ResultSet of data read from the database.
  Statement stmt = conn.createStatement();
  ResultSet rs = stmt.executeQuery(sqlStmt);
  return rs;
}
public void updateTbl (String update) throws SQLException
{
   //To change data in the database. 
   Statement stmt = conn.createStatement();
   stmt.executeUpdate(update);
   stmt.close();
}

public void insert(String sql)
{
    //To insert data into the database.
    try
    {
        updateTbl(sql);
    }
    catch (SQLException se)
    {
       System.out.println(se);
    }
}
}

