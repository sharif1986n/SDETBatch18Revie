package Class12;

public class Task2Soluation {
    public static void main(String[] args) {
        String str="bkfdSAHBDSH2232398487#Y*&#$%";
        System.out.println(str.replaceAll("[^A-Za-z]","").length());
    }
}
