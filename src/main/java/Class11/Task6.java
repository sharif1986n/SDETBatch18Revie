package Class11;

public class Task6 {
    public static void main(String[] args) {
        // Create a String and if the String is not empty perform the following:
        // if the String has an odd number of characters and has 3 or more characters,
        // print the character in the middle of the String.

        String str = "Hello";


        if (!str.isEmpty()) {
            int len = str.length();
            if (len >= 3 && len % 2 != 0) {
                System.out.println(str.charAt(len / 2));
            }

        }

    }
}



