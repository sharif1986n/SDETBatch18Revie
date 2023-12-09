package Class8;

import org.w3c.dom.ls.LSOutput;

import java.util.SortedMap;

public class T4 {
    public static void main(String[] args) {
        int[]numbers={10,15,20,18,9,60,22,30};
        boolean isSorted=true;
        for (int i =1;i<numbers.length;
        i++){
       {if (numbers[i]>numbers[i-1])
                isSorted=false;
                break;
        }


    }
        System.out.println(isSorted);
}
}