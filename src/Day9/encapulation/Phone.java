package Day9.encapulation;

public class Phone {
    private static String model;
    private Double price;

    public Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public static String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

