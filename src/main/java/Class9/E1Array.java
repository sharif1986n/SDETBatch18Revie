package Class9;

public class E1Array {
    public static void main(String[] args) {
        int[]numbers={10,25,26,30,40,45,45};
        int previous=numbers[0];
        boolean isSorted=true;
        for (int current:numbers){
            if( previous>current){

                break;
            }
            previous=current;
        }
        System.out.println("is array sorted "+isSorted);
    }
}
