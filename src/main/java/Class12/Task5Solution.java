package Class12;

public class Task5Solution {
    public static void main(String[] args) {


        String str = "This is sentence i want to reverse";
        String[] words = str.split(" ");

        for (String w : words) {

            for (int i = w.length() - 1; i >= 0; i--) {
                System.out.print(w.charAt(i));
            }
            System.out.print(" ");


        }

    }
}
