package day11_MultiBranchIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 90;

        String result = " ";

        if (score < 60){
            result = "Failed";
        }else if (score >= 60 && score < 90){
            result = "Passed";
        }else{
            result ="Pass with destinction";
        }
        System.out.println(result);




    }


}

