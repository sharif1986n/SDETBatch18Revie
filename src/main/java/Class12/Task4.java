package Class12;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String ExChild = "Boy";
        String ExChild2 = "Girl";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mom's first name");
        String Fname = scanner.nextLine();
        System.out.println("Enter Dad's first name");
        String Lname = scanner.nextLine();
        System.out.println("Are you expecting a boy or a girl?");
        String ExpChild = scanner.nextLine();
        if (ExpChild.equalsIgnoreCase(ExChild)) {
            System.out.println("Suggested baby name: " + Lname.substring(0, Lname.length()/2).toUpperCase()	+ (Lname.substring(2).toUpperCase()));
        } else if (ExpChild.equalsIgnoreCase(ExChild2)) {
            System.out.println("Suggested baby name: " + Fname.substring(0, Fname.length()/2).toUpperCase()	+ (Lname.substring(3, 6).toUpperCase()));
        }
    }
    }

