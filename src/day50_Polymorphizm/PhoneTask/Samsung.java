package day50_Polymorphizm.PhoneTask;

public final class Samsung extends Phone implements AndroidApps{

    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
        if(price > 1500){
            throw new RuntimeException("Invalid Price, Samsung price can't be higher 1500");
        }
    }

    @Override
    public void downloadApp() {
        System.out.println("Downloading App from " + AppStoreName);
    }

    @Override
    public void text() {
        System.out.println("Samsung is texting");

    }

    @Override
    public void call() {
        System.out.println("Samsung is calling");

    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", OS=" + OS + '\'' +
                '}';
    }
}
