package Pizza;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Pizza {

    public String size;
    public int cheeseToppings;
    public int pepperoniToppings;
    public double tips, priceOfPizza, totalPrice;

    public void customizeOrder(String size, int cheeseToppings, int pepperoniToppings, double tips){
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;

        priceOfPizza = calcCost();

        DecimalFormat df =new DecimalFormat("0.00");
        this.tips = tips/100 * priceOfPizza;



        totalPrice = priceOfPizza + this.tips + (priceOfPizza * 0.08);

    }

    public double calcCost(){
        double startingPrice = 0;
        if(size.equals("small"))
            startingPrice += 10;
        else if(size.equals("medium"))
            startingPrice +=12;
        else if(size.equals("large"))
            startingPrice += 14;

        return priceOfPizza = startingPrice+(cheeseToppings*1)+(pepperoniToppings*1.5)+tips;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheeseToppings=" + cheeseToppings +
                ", pepperoniToppings=" + pepperoniToppings +
                ", tips=" + tips +
                ", totalPrice: "+totalPrice+
                '}';
    }

    public static void main(String[] args) {

        Pizza order1 = new Pizza();
        order1.customizeOrder("medium",1,1,20);


        System.out.println(order1.toString());

        Pizza[]cybertekPizza = new Pizza[175];
        for(int i=0; i <= cybertekPizza.length-1;i++) {
            Pizza pizza = new Pizza();
            pizza.customizeOrder("Medium", 2, 3, 18);
            cybertekPizza[i] = pizza;

        }

        double total = 0;
        for (Pizza each:cybertekPizza){
            total += each.totalPrice;
        }
        System.out.println("Total price: " + total);

        System.out.println("=======================================================================================");

        ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
        for(int i=1;i<=60; i++) {
            Pizza medium = new Pizza();
            medium.customizeOrder("medium", 2,3,18);

            Pizza large = new Pizza();
            large.customizeOrder("large",3,4 ,18);

            Pizza small = new Pizza();
            small.customizeOrder("small",1,2,18);

            pizzas.addAll(Arrays.asList(small,medium,large));

        }
        System.out.println("Number of Pizzas: "+ pizzas.size());

        double sum = 0;
        for(Pizza eachPizza:pizzas){
            sum += eachPizza.totalPrice;
        }
        System.out.println(sum);
    }
}
