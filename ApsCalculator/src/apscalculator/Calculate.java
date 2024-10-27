/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apscalculator;

/**
 *
 * @author admin
 */
public class Calculate {
    private double S1, S2, S3, S4, S5, S6, Ap, Lo;/*For:
    Uct - S1,S2, and S3 can be required subjects
    Up - S4, S5, and S6 are maths, english and Fal respectively
    Wits - S4, S5, and S6 are maths, english and Fal respectively. Note Wits 
        also has additional fields Lo and Ap, lables and txf 6 is Ap, 7 is Lo*/
    private String error;
    private boolean facScience = false, test, blankField, outsideRange, 
            notNumber, isUct, isUp, isWits, isPsDone;
    
    public double parseDoubleField(String text, boolean isAP) {//converts textfield value to a numerical value and customizes error message
        try {
            if (!text.isEmpty()) {
                if (Double.parseDouble(text) > 100 || Double.parseDouble(text) < 0) {
                    outsideRange = true;
                    test = true;
                }
                return Double.parseDouble(text);//returns parsed value of text field
            } else if (!isAP) {
                blankField = true;
                test = true;
            }
        } catch (NumberFormatException e) {
            System.out.println(e);
            notNumber = true;
            test = true;
        }
        return 0;//entered value was not a number so it returns 0 as a default
    }
    
    private int calculateUct(double value){//Calculates APS score for UP format
        if((int) Math.round(value)>= 40){
            return (int) Math.round(value);//returns APS for that subject
        }else {
            return 0;
        }
    }
    
    public int calculateUp(double value) {//Calculates APS score for UP format
        if (value > 19 && value < 90) {
            return (int) (value / 10) - 1;
        } else if (value > 89) {
            return 7;
        } else if (value < 19) {
            return 1;
        }
        return 0;
    }
    
    public int calculateWits(double value, boolean psDone, boolean isBonus) {//Calculates APS score for WITS format
        if (value > 39 && value < 100 && isBonus) {
            if (value > 59) {
                return (int) (value / 10) + 1;
            } else {
                return (int) (value / 10) - 1;
            }
        } else if (value == 100 && isBonus) {
            return 10;
        }
        if (value > 39 && value < 100 && !isBonus) {
            return (int) (value / 10) - 1;
        } else if (value == 100 && !isBonus) {
            return 8;
        }
        return 0;
    }

    public void replaceAp(double Ap, boolean psDone) {//replaces one of the additional subjects, S1, S2, or S3, with the AP score if the AP score is greater than the weakest one
        double lowestValue;
        if (!psDone) {
            lowestValue = Math.min(S1, Math.min(S2, S3));
            if (Ap > lowestValue) {
                if (S1 < Ap && S1 <= S2 && S1 <= S3) {
                    S1 = Ap;
                } else if (S2 < Ap && S2 <= S1 && S2 <= S3) {
                    S2 = Ap;
                } else {
                    S3 = Ap;
                }
            }
        } else {
            lowestValue = Math.min(S2, S3);
            if (Ap > lowestValue) {
                if (S2 < Ap && S2 <= S3) {
                    S2 = Ap;
                } else {
                    S3 = Ap;
                }
            }
        }
    }
    
    public int calculateLo(double value) {//calculates aps score for LO field
        if (value > 59 && value < 100) {
            return (int) (value / 10) - 5;
        } else if (value == 100) {
            return 4;
        }
        return 0;
    }
    
    public void handleFieldErrors(String label) {
        if (blankField) {
            error += label + " is empty/blank.\n";
        } else if (outsideRange) {
            error += label + " is out of range (0-100).\n";
        } else if (notNumber) {
            error += label + "'s value is not a number.\n";
        }
    }/*customises error message based on what is wrong with data in that field*/
    
    public int calculateAPS(String[] textFields, String[] labels) {
        test = false;
        error = "";

        if (isWits) {//since WITS is the only University to count AP as a sub in subject, only it has an AP field. Therefor only extract value for AP when Univerdity is WITS
            blankField = outsideRange = notNumber = false;
            Ap = parseDoubleField(textFields[6], true);
            handleFieldErrors(labels[6]);
        }
        //Below is the code to extract the score from the text fields and customize the error message if there is an issue with the value entered
        blankField = outsideRange = notNumber = false;
        S1 = parseDoubleField(textFields[0], false);
        handleFieldErrors(labels[0]);

        blankField = false; outsideRange = false; notNumber = false;
        S2 = parseDoubleField(textFields[1], false);
        handleFieldErrors(labels[1]);

        blankField = false; outsideRange = false; notNumber = false;
        S3 = parseDoubleField(textFields[2], false);
        handleFieldErrors(labels[2]);

        blankField = false; outsideRange = false; notNumber = false;
        S4 = parseDoubleField(textFields[3], false);
        handleFieldErrors(labels[3]);

        blankField = false; outsideRange = false; notNumber = false;
        S5 = parseDoubleField(textFields[4], false);
        handleFieldErrors(labels[4]);

        blankField = false; outsideRange = false; notNumber = false;
        S6 = parseDoubleField(textFields[5], false);
        handleFieldErrors(labels[5]);

        if (isWits) {//since WITS is the only University to count LO, only it has a LO field. Therefor only pull value for LO when Univerdity is WITS
            blankField = false; outsideRange = false; notNumber = false;
            Lo = parseDoubleField(textFields[7], false);
            handleFieldErrors(labels[7]);
        }
        
        int aps = 0;
        //below is the calling of different calculation mathods based on the 
        //university the calculation is required for
        if(isUct){//runs the calculation if the university the calculation is for is UCT
            aps += calculateUct(S1);
            aps += calculateUct(S2);
            aps += calculateUct(S3);
            aps += calculateUct(S4);
            aps += calculateUct(S5);
            aps += calculateUct(S6);
            if (facScience) {
                aps += calculateUct(S1);
                aps += calculateUct(S2);
            }
        }
        
        if (isUp) {//runs the calculation if the university the calculation is for is UP
            aps += calculateUp(S1);
            aps += calculateUp(S2);
            aps += calculateUp(S3);
            aps += calculateUp(S4);
            aps += calculateUp(S5);
            aps += calculateUp(S6);
        }
        
        if (isWits) {//runs the calculation if the university the calculation is for is WITS
            replaceAp(Ap, isPsDone);
            aps += calculateWits(S1, isPsDone, false);
            aps += calculateWits(S2, isPsDone, false);
            aps += calculateWits(S3, isPsDone, false);
            aps += calculateWits(S4, isPsDone, true);
            aps += calculateWits(S5, isPsDone, true);
            aps += calculateWits(S6, isPsDone, false);
            aps += calculateLo(Lo);
        }
        return aps;
    }
    
    public void setFacScience(boolean facScience) {
        this.facScience = facScience;
    }

    public String getError() {
        return error;
    }

    public boolean hasErrors() {
        return test;
    }

    public void setIsUct(boolean isUct) {
        this.isUct = isUct;
    }

    public void setIsUp(boolean isUp) {
        this.isUp = isUp;
    }

    public void setIsWits(boolean isWits) {
        this.isWits = isWits;
    }

    public void setIsPsDone(boolean isPsDone) {
        this.isPsDone = isPsDone;
    }
    
}
