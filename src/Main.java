import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your user name : ");
        userName = input.next();

        System.out.print("Enter your password : ");
        password = input.next();

        if (userName.equals("patika")&&password.equals("java123")){
            System.out.println("Validation successful");
        } else {
            System.out.println("User name or password wrong !");
        }


    }
}
