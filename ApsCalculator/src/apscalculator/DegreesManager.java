/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apscalculator;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DegreesManager {
    DB dataBase = new DB();
    private int size = 0;
    private Degree[] degrees = new Degree[NumDegrees()];
    
    public DegreesManager(){
        String sortBy;
        String uniWits = "", uniUct = "", uniUp = "";
        String facFilt = facultiesSelected();
        
        if (ListOfDegrees.filterUni) {//determining what universities should be 
            //included when filtering for university
            if (ListOfDegrees.filterWits) {
                uniWits = "University of Witwaterstrand";
            }
            if (ListOfDegrees.filterUct) {
                uniUct = "University of Cape Town";
            }
            if (ListOfDegrees.filterUp) {
                uniUp = "University of Pretoria";
            }
        }
        
        try {
            
            if (ListOfDegrees.sortBy.isEmpty()) {//if no sort method has been selected the data is sorted by university as a default
                sortBy = "University";
            }else if((ListOfDegrees.sortBy).equals("APS Requirement")){//below simply fills in sort method as per the column heading in the access table
                sortBy = "apsR";
            }else{
            sortBy = ListOfDegrees.sortBy;
            }
            String ascDesc;
            
            if (ListOfDegrees.sortAsc) {
                ascDesc = "ASC";
            }else{
                ascDesc = "DESC";
            }
            ResultSet rs;
            if (ListOfDegrees.filterUni && ListOfDegrees.filterFac) {//query for filtering by university and degree
                rs = dataBase.queryTbl("Select *\n" +
                "FROM DegreesWits\n" +
                "WHERE University IN ('" +uniUct+ "', '" +uniUp+ "', '" 
                        +uniWits+ "')\n" +
                "AND Faculty IN (" + facFilt + ")\n" +
                "UNION\n" +
                "Select*\n" +
                "FROM DegreesUct\n" +
                "WHERE University IN ('" +uniUct+ "', '" +uniUp+ "', '" 
                        +uniWits+ "')\n" +
                "AND Faculty IN (" + facFilt + ")\n" +
                "UNION\n" +
                "SELECT*\n" +
                "FROM DegreesUp\n" +
                "WHERE University IN ('" +uniUct+ "', '" +uniUp+ "', '" 
                        +uniWits+ "')\n" +
                "AND Faculty IN (" + facFilt + ")\n" +
                "ORDER BY " + sortBy + " " + ascDesc);
            }
            else if (ListOfDegrees.filterUni) {//query for filtering by university only
                rs = dataBase.queryTbl("Select *\n" +
                "FROM DegreesWits\n" +
                "WHERE University IN ('" +uniUct+ "', '" +uniUp+ "', '" 
                        +uniWits+ "')\n" +
                "UNION\n" +
                "Select*\n" +
                "FROM DegreesUct\n" +
                "WHERE University IN ('" +uniUct+ "', '" +uniUp+ "', '" 
                        +uniWits+ "')\n" +
                "UNION\n" +
                "SELECT*\n" +
                "FROM DegreesUp\n" +
                "WHERE University IN ('" +uniUct+ "', '" +uniUp+ "', '" 
                        +uniWits+ "')\n" +
                "ORDER BY " + sortBy + " " + ascDesc);
            }
            else if(ListOfDegrees.filterFac){//query for filtering by faculty only
                rs = dataBase.queryTbl("Select *\n" +
                "FROM DegreesWits\n" +
                "WHERE Faculty IN (" + facFilt + ")\n" +
                "UNION\n" +
                "Select*\n" +
                "FROM DegreesUct\n" +
                "WHERE Faculty IN (" + facFilt + ")\n" +
                "UNION\n" +
                "SELECT*\n" +
                "FROM DegreesUp\n" +
                "WHERE Faculty IN (" + facFilt + ")\n" +
                "ORDER BY " + sortBy + " " + ascDesc);
            }else {//query where there is nothing to filter for
                rs = dataBase.queryTbl("Select *\n" +
                "FROM DegreesWits\n" +
                "UNION\n" +
                "Select*\n" +
                "FROM DegreesUct\n" +
                "UNION\n" +
                "SELECT*\n" +
                "FROM DegreesUp\n" +
                "ORDER BY " + sortBy + " " + ascDesc);
            }
            
            while (rs.next()) {//populates the degreeArray with data from queries
                String university, faculty, degreeName, AlQlNbt, mathamaticsNbt,
                        additional;
                int apsR, englishR, mathsR, scienceR;
                university = rs.getString("University");
                faculty = rs.getString("Faculty");
                degreeName = rs.getString("Degrees");
                
                if (rs.getString("additional")==null) {
                    additional = "No additional requirements";
                }else{
                    additional = rs.getString("additional");
                }
                
                if (rs.getString("AlQlNbt")==null) {
                    AlQlNbt = "Academic and Quantitative NBT does not need "
                            + "to be written";
                }else{
                    AlQlNbt = rs.getString("AlQlNBT");
                }
                
                if (rs.getString("MathamaticsNBT")==null) {
                    mathamaticsNbt = "Mathamatics NBT does not need to be "
                            + "written";
                }else{
                    mathamaticsNbt = rs.getString("MathamaticsNBT");
                }
                
                apsR = rs.getInt("apsR");
                englishR = rs.getInt("englishR");
                mathsR = rs.getInt("mathsR");
                scienceR = rs.getInt("scienceR");
                
                degrees[size] = new Degree(university, faculty, degreeName, 
                        apsR, englishR, mathsR, scienceR, AlQlNbt, 
                        mathamaticsNbt, additional);//defines object Degree using data from specific table row
                size++;
            }
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    private String facultiesSelected(){//method that creates a variable containing all the faculties included in the filter
        String command = "";
        if (ListOfDegrees.filterCom) {
            command = command + "'Commerce', ";
        }
        if (ListOfDegrees.filterEng) {
            command = command + "'Engineering', ";
        }
        if (ListOfDegrees.filterHealth) {
            command = command + "'Health Sciences', ";
        }
        if (ListOfDegrees.filterHuman) {
            command = command + "'Humanities', ";
        }
        if (ListOfDegrees.filterLaw) {
            command = command + "'Law', ";
        }
        if (ListOfDegrees.filterScience) {
            command = command + "'Science', ";
        }
        int leng = command.length();
        if (leng>0) {
            String temp = command.substring(0, leng-2);
            return temp;
        }
        return "";
    }
    
    public int NumDegrees(){//creates a count query to determine the number of records in the collection of the different university degree tables
        int total = 0;
        try {
            ResultSet rs = dataBase.queryTbl("SELECT COUNT(*) AS Total\n" +
            "FROM (Select *\n" +
            "FROM DegreesWits\n" +
            "UNION\n" +
            "Select*\n" +
            "FROM DegreesUct\n" +
            "UNION\n" +
            "SELECT*\n" +
            "FROM DegreesUp)");
            if (rs.next()) {
                total = rs.getInt("Total");
            }
            
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        return total;
    }

    public int getSize() {
        return size;
    }
    
    public String[] getRowDetails(int i){//returns relavent details for a specific row
        String[] data = new String[4];
        data = degrees[i].rowDetails();//calls method in constructor class that returns an array containing the required details
        return data;
    }
    
    public Degree matchDegree(String d, String u){//mathes the details provided about a degree to a specific degree in the access tables
        for (int i = 0; i < size; i++) {
            if (degrees[i].getDegreeName().equals(d) && 
                    degrees[i].getUniversity().equals(u)) {
                return degrees[i];
                
            }
        }
        return null;
    }
}
