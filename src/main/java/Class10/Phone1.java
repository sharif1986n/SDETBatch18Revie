package Class10;

import java.util.function.IntPredicate;

public class Phone1 {
    String make;
    String model;
    double price;
    String color;
    void takePics(){
        System.out.println("Use camera to take pictrues ");
    }
    void call(){
        System.out.println("Calling....");
    }
    void playVideos(){
        System.out.println("Playing some videos ");
    }


    public static void main(String[] args) {

        Phone iphone=new Phone();
        iphone.colors="white";
        iphone.made="Apple";


    }

    }
