package Reto02;


public class SmartPhone {
    private String name, model, processor;
    private float price;

    public SmartPhone(String name, String model, String processor, float price) {
        this.name = name;
        this.model = model;
        this.processor = processor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public float getPrice() {
        return price;
    }
}
