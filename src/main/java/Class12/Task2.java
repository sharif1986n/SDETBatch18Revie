package Class12;

public class Task2 {
    public static void main(String[] args) {
            // Create a String that should be combination of letters, numbers and special
            // characters. Find out how many alpha characters are there in the String.

            String str = "bkfdSAHBDSH2232398487#Y*&#$%";

            int alpha = 0;
            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(str.charAt(i))) {
                    alpha++;

                }
            }
            System.out.print("There are " + alpha + " alphabets in this string");

            System.out.println();
            String str2 = "aklsdfja345435FFF!@#$%^7*(";

            System.out.println(str2.replaceAll("[^A-Za-z0-9]", ""));
        }
    }

