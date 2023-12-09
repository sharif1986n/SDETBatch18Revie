package PracticeClass;

public class TemperatureCheck {
    /*
Create a Java program and name it Temperature Check.
Create a variable to store temperature. Your program should check
if temperature is below 32 then it should print “Water will freeze
with temperature __”, otherwise “Water will NOT freeze with
temperature __”.
*/
    public static void main(String[] args) {

        double TemCheck=35;
        if (TemCheck<32){
            System.out.println("Water will freeze with temperature"+TemCheck);
        }else {
            System.out.println("Water will not freeze with temperature"+TemCheck);

        }


    }
}