package Office_Hours.Practice_10_28_2020;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "abab";

        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {

            if (!nonDup.contains("" + str.charAt(i)))

                nonDup += str.charAt(i);

            }
            System.out.println(nonDup);


        }


    }
