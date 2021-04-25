package day40_Constructor;

public class ConstructorCall2 {

    public ConstructorCall2(){
        // this(); // cannot call itself
    }

    public ConstructorCall2(int a){
        this();
    }


}
