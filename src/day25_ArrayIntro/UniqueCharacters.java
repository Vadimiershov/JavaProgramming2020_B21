package day25_ArrayIntro;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "ababjhgd";
        String result = "";
        int index = 0;

        for(int j = 0; j<str.length(); j++) { //j represent the index num of str


            char ch = str.charAt(j); //'a'
            int count = 0; //1+1
            for (int i = 0; i < str.length(); i++) { // irepresents the index num of str
                char eachChar = str.charAt(i); // each character of the string
                if (eachChar == ch) {
                    count++;
                }

            }//count the frequency of the char
            if (count == 1) {
                result += ch;
            }
        }
        System.out.println(result);
    }


}
