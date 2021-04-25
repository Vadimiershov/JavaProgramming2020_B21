package day18_StringPractice;

public class SubStringMethod2 {

    public static void main(String[] args) {
        
        String str = "Today is Monday";
        
        String day = str.substring(9,str.length());
        System.out.println("day = " + day);
        
        String firstName = "cyBERtec";
        
        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("firstName = " + firstName);
        
        
        
    }
    
    
}
