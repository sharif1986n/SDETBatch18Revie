package Class11;

public class Task4 {
    public static void main(String[] args) {
        String str="Java is Fun";
        //count how many times letter a has appeard in the String

        int count=0;
        System.out.println();
        for (int i=0;i<str.length(); i++){
            if (str.charAt(i)=='a'){
                count++;

            }
        }
        System.out.println(count);
    }
}
