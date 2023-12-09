package PracticeClass;

public class E1NestedIfConditions {
    public static void main(String[] args) {
        boolean isMainDoorOpen=true;
        boolean isRoom1Opened=true;
        boolean isRoom2Opened=true;
        if (isMainDoorOpen) {

            if(isRoom1Opened){

            System.out.println("We are in Room1");

        }else{
            System.out.println("Room 1 is close");
        }
            if (isRoom2Opened){
                System.out.println("We are in the room 2");

            }else {
                System.out.println("Room2 is close");
            }


        }else {
            System.out.println("Can not Enter the house main door is close");
        }

    }
}
