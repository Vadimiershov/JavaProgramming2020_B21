package day50_Polymorphizm.PhoneTask;

public final class Iphone extends Phone implements AppleApps{

    public Iphone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
        if(price > 1500){
            throw new RuntimeException("Invalid Price, Iphone price cannot be more than $1500");
        }
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading App from " + AppStoreName);
    }

    @Override
    public void text() {
        System.out.println("Iphone is texting");
    }

    @Override
    public void call() {
        System.out.println("Iphone is calling");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OS= " + OS + '\''+
                '}';
    }
}
