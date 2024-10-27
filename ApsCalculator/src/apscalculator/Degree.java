/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apscalculator;

/**
 *
 * @author admin
 */
public class Degree {
    private String university, faculty, degreeName, AlQlNbt, mathamaticsNbt, additional;
    private int apsR, englishR, mathsR, scienceR;

    public Degree(String university, String faculty, String degreeName,
            int apsR, int englishR, int mathsR, int scienceR, String AlQlNbt, 
            String mathamaticsNbt, String additional) {//constructor
        this.university = university;
        this.faculty = faculty;
        this.degreeName = degreeName;
        this.AlQlNbt = AlQlNbt;
        this.mathamaticsNbt = mathamaticsNbt;
        this.additional = additional;
        this.apsR = apsR;
        this.englishR = englishR;
        this.mathsR = mathsR;
        this.scienceR = scienceR;
    }

    public String getUniversity() {
        return university;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getAlQlNbt() {
        return AlQlNbt;
    }

    public String getMathamaticsNbt() {
        return mathamaticsNbt;
    }

    public String getAdditional() {
        return additional;
    }

    public int getApsR() {
        return apsR;
    }

    public int getEnglishR() {
        return englishR;
    }

    public int getMathsR() {
        return mathsR;
    }

    public int getScienceR() {
        return scienceR;
    }
    
    public String[] rowDetails(){
        String[] degreeDetails = new String[4];
        degreeDetails[0] = degreeName;
        degreeDetails[1] = faculty;
        degreeDetails[2] = university;
        degreeDetails[3] = apsR + "";
        return degreeDetails;
    }//creates an array object of key details of degree to be displayed in table 
    
    
    
}
