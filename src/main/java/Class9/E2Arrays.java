package Class9;

public class E2Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,50,},
                {25,35,66,},
                {80,90,70,45},
                {45,55,66}
        };

        System.out.println(matrix[1][1]);//35
        System.out.println(matrix[0][2]);//50
        System.out.println(matrix[3][2]);//66
       // System.out.println(matrix[0][3]);//Error
        System.out.println(matrix.length);//gives number of rows
        System.out.println(matrix[0].length);//3
        System.out.println(matrix[2].length);//4
    }
}
