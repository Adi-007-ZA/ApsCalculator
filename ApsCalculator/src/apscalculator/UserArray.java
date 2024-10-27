/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apscalculator;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class UserArray {
    private User[] uArray = new User[arraySize()];
    private int size = 0;
    public UserArray(){
        try {
            DB database = new DB();
            ResultSet rs = database.queryTbl("SELECT FirstName, Surname, "
                    + "Users.Username, Password, Telnum, APSwits, APSup, "
                    + "APSuct, UctFaculty\n"
                    + "FROM UserResults INNER JOIN Users ON "
                    + "UserResults.Username = Users.Username;");
            while (rs.next()) {                
                String n = rs.getString("FirstName");
                String s = rs.getString("Surname");
                String u = rs.getString("Username");
                String p = rs.getString("Password");
                String t = rs.getString("TelNum");
                double aw = rs.getDouble("APSwits");
                double aup = rs.getDouble("APSup");
                double au = rs.getDouble("APSuct");
                String f = rs.getString("UctFaculty");
                uArray[size] = new User(n,s,u,p,t,aw,aup,au,f);
                size++;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public User[] getuArray() {
        return uArray;
    }

    public int getSize() {
        return size;
    }
    
    public boolean checkPassword(String u, String p){//method to check password, called in login page
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (u.equals(uArray[i].getUsername()) && p.equals(uArray[i].getPassword())) {
                check = true;
            }
        }
        return check;
    }
    public boolean checkAvailable(String u){//method to check if username is available, called in sign up page
        boolean check = true;
        for (int i = 0; i < size; i++) {
            if (u.equals(uArray[i].getUsername())) {
                check = false;
            }
        }
        return check;
    }
    
    public String[] UserDetails(){//returns user details, method is called in home page 
        String user = LoginPage.getUserLoggedIn();
        for (int i = 0; i < size; i++) {
            
            if (user.equals(uArray[i].getUsername())) {
                String[] details = {uArray[i].getName()+"", uArray[i].getApsWits()+"", uArray[i].getApsUct()+"",
                uArray[i].getFaculty(), uArray[i].getApsUp()+""};        //0 - name, 1 - Wits APS, 2 - Uct APS, 3 - Uct Faculty, 4 - Up Aps
                return details;
            }
        }
        String[] details = new String[5];
        return details;
    }
    
    public double[] getApsDetails(){//method that fethches the users APS scores
        String user = LoginPage.getUserLoggedIn();
        for (int i = 0; i < 10; i++) {
            if (uArray[i].getUsername().equals(user)) {
                return uArray[i].apsDetails();
            }
        }
        return null;
    }
    
    private int arraySize(){//perferms count query to determine how big user array needs to be
        DB database = new DB();
        try {
            ResultSet rs = database.queryTbl("SELECT COUNT(*) AS [Total]\n" +
                    "FROM Users");
            if (rs.next()) {
                return rs.getInt("Total");
            }
        } catch (SQLException ex) {
            System.out.println(ex);;
        }
        return 0;
    }
}
