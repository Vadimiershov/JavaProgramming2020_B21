package day23_NestedLoop;

import java.util.Scanner;

public class Credential {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String username  =scan.next();

        System.out.println("Enter your password");
        String password = scan.next();

        if(username.equals("cybertek")&&password.equals("cybertek12345")){
            System.out.println("Logged in");
        }else {//condition for invalid user name and password
            for (int i = 1; i <= 3; i++) {

                if(i==3){
                    System.out.println("Your account is locked");
                    System.exit(0);
                }

                System.out.println("Invalid username or password, please re enter");
                System.out.println("Enter your username");
                username= scan.next();
                System.out.println("Enter your password");
                password = scan.next();
                if(username.equals("cybertek")&&password.equals("cybertek12345")){
                    System.out.println("Logged In");
                    break;
                }

            }
        }



    }


}
