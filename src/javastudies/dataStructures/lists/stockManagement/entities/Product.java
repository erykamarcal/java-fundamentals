package javastudies.dataStructures.lists.stockManagement.entities;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {

        return quantity;
    }

    public void addStock(int quantity){

        this.quantity += quantity;
    }

    public void removeFromStock(int quantity){
        this.quantity -= quantity;
    }
    public double totalValue(){
        return price * quantity;
    }
    @Override
    public String toString() { return id
            + ", "
            + name
            + ", "
            + String.format("%.2f", price)
            + ", "
            + quantity +
            "Total value: " +
            String.format("%.2f", totalValue());

    }
}
