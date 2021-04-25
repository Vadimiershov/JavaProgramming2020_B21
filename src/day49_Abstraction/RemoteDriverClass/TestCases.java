package day49_Abstraction.RemoteDriverClass;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCases {

    public static void main(String[] args) {

        ChromeDriver driver= new ChromeDriver();
        driver.get("https://www.google.com");
        driver.TakeScreeshot("pic");
        driver.close();

        System.out.println("-------------------------------------------------");

        FirefoxDriver driver2 =new FirefoxDriver();
        driver2.get("https://www.google.com");
        driver2.TakeScreeshot("pic");
        driver.close();

        System.out.println("---------------------------------------------------");

        ArrayList<Integer>arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        arrayList.forEach(p->{if(p%2==0) System.out.print(p);});



    }


}
