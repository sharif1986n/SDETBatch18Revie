package Class12;

public class Task6 {
    public static void main(String[] args) {
        String str="Car";
        StringBuilder strB=new StringBuilder(str);
        strB.reverse();
        if(str.equals(strB.toString())) {
            System.out.println(str+" is palindrome");
        }else {
            System.out.println(str+" Not is palindrome");
        }
    }

}

