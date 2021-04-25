package Office_Hours.Practice_10_28_2020;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "abbacab";
        String result = "";
        for (int j = 0; j < str.length(); j++) {


            char ch = str.charAt(j);
            int count = 0;


            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    count++;
                }

            }
if(result.contains(""+ch)){
    continue;
}
            result += "" + ch + count;
        }
        System.out.println(result);



    }


}
