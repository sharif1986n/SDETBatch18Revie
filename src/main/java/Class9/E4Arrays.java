package Class9;

public class E4Arrays {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 20, 50,},
                {25, 35, 66,},
                {80, 90, 78, 45},
                {45, 55, 66}
        };

        int[] row0 = matrix[0];
        System.out.println(row0.length);
        for (int n:row0){
            System.out.println(n+" ");

        }
        System.out.println();
        System.out.println(matrix[2][2]);


        }


    }

