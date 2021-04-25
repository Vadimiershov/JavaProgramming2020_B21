package day39_StaticBlock;

public class CybertekStudent {

    public String name, gender;
    public int age;

    public static String schoolName, dreamJob;
    public static boolean hasReplit, hasFlipgrid;

    static {
        schoolName = "CybertekSchool";
        dreamJob = "SDET";
        hasReplit = true;
        hasFlipgrid = true;
    }

    public void setInfo(String name, String gender,int age) {
        this.name = name;
        this.gender= gender;
        this.age = age;
    }


    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ",schoolName=" + schoolName+
                '}';
    }
}
