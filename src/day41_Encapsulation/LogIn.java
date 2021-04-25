package day41_Encapsulation;

public class LogIn {

    public static void main(String[] args) {

        Credentials obj = new Credentials();
        //System.out.println(obj.UserName);
        //obj.userName = "ABC";
       // System.out.println(obj.userName);

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());

        obj.setUserName("Hello");
        obj.setPassword(00000.5);

        System.out.println(obj.getUserName());
        System.out.println(obj.getPassword());


    }



}
