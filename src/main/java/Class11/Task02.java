package Class11;

public class Task02 {
    public static void main(String[] args) {

        String userName="user1234";
        String password="pass1234";
        String confirmPassword="pass1234";

        if(userName.isEmpty() || password.isEmpty()){
            System.out.println("Username or Password cannot be empty");
        }else if(password.length()<8){
            System.out.println("Password is too short");
        }else if(password.contains(userName)){
            System.out.println("Password cannot contain username");
        }else if(!password.equals(confirmPassword)){
            System.out.println("Passwords do not match");
        }else{
            System.out.println("Your username and password has been created");
        }

    }
}


