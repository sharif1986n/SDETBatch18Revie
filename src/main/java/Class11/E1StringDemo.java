package Class11;

public class E1StringDemo {
    public static void main(String[] args) {

        //Create the object of the that class
        /*String=> Data Type
        str    => variable name
        new String()  => creating the object of String

         */

        String str=new String("Hello World");
        // calling the lenght method using the str object
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        //We can store the results of a method as well.
        String upper=str.toUpperCase();
        System.out.println(upper);
        System.out.println(str.toLowerCase());
        System.out.println(str+"Hello Batch 18");
        System.out.println(str.concat("Hello Batch 18"));


    }
}
