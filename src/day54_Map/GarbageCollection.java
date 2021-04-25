package day54_Map;

public class GarbageCollection {

    public static void main(String[] args) {

        String str1 = "Muhtar";
        str1 = "Kuzzat"; //does not have a reference
        str1 = "Gurhan"; //isn't unreferenced
        str1 = "Saim";   //isn't unreferenced

        System.out.println(str1);


    }
}
