package PracticeClass;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Please Enter the loan amount");
        Scanner sc=new Scanner(System.in);
        double loanAmount=sc.nextDouble();
        if (loanAmount<200000){
            System.out.println("You can get this amount");
        }else {
            System.out.println("This amount can't be provide");
        }
    }

}
