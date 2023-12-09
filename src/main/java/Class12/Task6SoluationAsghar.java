package Class12;

public class Task6SoluationAsghar {
    public static void main(String[] args) {


        String str = "Mom";
        String reversedWord = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + str.charAt(i);
        }
        if (str.equalsIgnoreCase(reversedWord)) {
            System.out.println("Its a Palindrome");
        } else {
            System.out.println("It's not a Palindrome");
        }
    }
}