package day43_exceptions.PhoneTask;

public class Device {

    public String brand, model;
    public final String country;
    public double price;



    public Device(String brand, String model, String country, double price) {
        this.country = country;
        this.brand = brand;
        this.model = model;
        this.price = price;

    }

        @Override
        public String toString() {
            return "{" +
                    "brand= '" + brand + '\'' +
                    ", model= '" + model + '\'' +
                    ", country= '" + country + '\'' +
                    ", price= $" + price +
                    '}';
        }



}

