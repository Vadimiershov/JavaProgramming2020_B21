package Day42_Inheritance.Animals;

public class Zoo {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("bengal Tiger","orange","Sher Khan", "large",'M',5);
        System.out.println(tiger);
        tiger.eat("Chicken");
        tiger.hunt();
        tiger.roar();

        Cat cat = new Cat("British gold","white","Kitty","small",'F',1);
        System.out.println(cat);
        cat.eat("Tuna");
        cat.drink("milk");
        cat.sleep();

        Dog rotty = new Dog("barsik","rotty",'M',5,"black","big");
        rotty.drink("water");


    }

}
