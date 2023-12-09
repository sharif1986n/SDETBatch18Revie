package Class4;

public class Task2 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;

        if (num1>num2){

            if (num1>num3){
                System.out.println("Num1 is largest"+num1);
            }
        }else {
            if (num2>num3){
                System.out.println("Num2 is the largest "+num2);
            }else {
                System.out.println("Num3 is largest "+num3);
            }
        }

    }
}

