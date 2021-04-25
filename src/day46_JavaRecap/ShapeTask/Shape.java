package day46_JavaRecap.ShapeTask;

public class Shape {

    public String name;

    public Shape(String name){
        if(name.isEmpty()){
            throw new RuntimeException("Shape Name cannot be empty");
        }

        for (int i = 0; i < name.length(); i++) {
            char eachChar = name.charAt(i);
            if(!Character.isLetter(eachChar)){
                throw new RuntimeException("No such a shape");
            }
        }
        this.name = name;
    }

    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area= "+area()+
                ", perimeter= "+perimeter()+
                '}';
    }
}
