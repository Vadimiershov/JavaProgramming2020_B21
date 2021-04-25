package day43_exceptions;

public class ExceptionHandling {

    public static void main(String[] args) {

        //String out of Bound

        String str = "Cybertek";
    try {
        System.out.println(str.substring(200, 300));
        }catch (StringIndexOutOfBoundsException e){
        System.out.println("StringIndexOutOfBoundsException is occured"); // e.getMessage() able to get a note what exception occurred
    }                                                                     // e.printStackTrace() gives what exactly exemption occurred


        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }


        System.out.println("Test Completed");




    }



}
