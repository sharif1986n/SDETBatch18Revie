package Class12;

public class Task3 {
    public static void main(String[] args) {
        String str = "It is Saturday? Is it raining? Do we have a Java Class today? we will enjoy the class!";

        System.out.println("This String has " + str.split("[?.!]").length + " sentences");

    }

}

