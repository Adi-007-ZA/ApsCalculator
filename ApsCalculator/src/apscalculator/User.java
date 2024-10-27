/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apscalculator;

/**
 *
 * @author admin
 */
public class User {
    private String name, surname, username, password, tellNum, faculty;
    private double apsWits,apsUct, apsUp;
    public User(String n, String s, String u, String p, String t, double aw, double aup, double au, String f){//constructor
        this.name = n;
        this.surname = s;
        this.username = u;
        this.password = p;
        this.tellNum = t;
        this.apsWits = aw;
        this.apsUp = aup;
        this.apsUct = au;
        this.faculty = f;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getUsername() {
        return username;
    }


    public String getPassword() {
        return password;
    }


    public String getTellNum() {
        return tellNum;
    }


    public double getApsWits() {
        return apsWits;
    }


    public double getApsUct() {
        return apsUct;
    }


    public String getFaculty() {
        return faculty;
    }


    public double getApsUp() {
        return apsUp;
    }
    
    public double[] apsDetails(){
        double[] aps = new double[3];
        aps[0] = apsUct;
        aps[1] = apsUp;
        aps[2] = apsWits;
        return aps;//creates an array containing the APS of a user
    }
    
}
