package Office_Hours.Practice_10_28_2020;

public class UniqueChars {

    public static void main(String[] args) {

        String str = "aabccd";
        String unique = "";
        String duplicates = "";

        for (int j = 0; j <str.length() ; j++) {
            char ch = str.charAt(j);

            int frequency = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                unique += ch;
            }
            if(frequency>1){
                duplicates +=ch;
            }
        }
        System.out.println(unique);
        System.out.println(duplicates);



    }


}
