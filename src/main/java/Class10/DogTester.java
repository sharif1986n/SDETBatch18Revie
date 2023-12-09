package Class10;

public class DogTester {
    public static void main(String[] args) {
// Creating an object of the class
        Dog dog1=new Dog();


        /*Dog= Data type
        dog => is a variable that holds the object
        new Dog();=>Creating the object of Dog Class

       */


        dog1.name="Jacky";
        dog1.bread="German";
        dog1.age=5;
        dog1.weight=15;
        dog1.color="Black";
        System.out.println(dog1.name);
        System.out.println(dog1.bread);
        System.out.println(dog1.weight);
        System.out.println(dog1.age);

        dog1.sleep();
        dog1.bark();

        Dog dog2=new Dog();
        dog2.name="Alex";
        dog2.bread="Persian";
        dog2.color="White";
        dog2.weight=8;
        System.out.println(dog2.name);
        System.out.println(dog2.bread);
        System.out.println(dog2.weight);
        System.out.println(dog2.color);

        dog2.eat();
        dog2.sleep();




    }
}
