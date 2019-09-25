package entities;

public class Product {

    String name;
    private double price;
    private int quantity;

    public Product(){

    }

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public void removeProduct(int quantity){
        if(this.quantity < 0 && this.price < 0) {
            System.out.printf("A quantidade e o valor não podem ser negativos%n"); // resolver solução para não verificar quantidade negativa
        } else {
            this.quantity -= quantity;
        }
    }

    public String toString(){
        return name
               + ", $"
               + String.format("%.2f", price) //+ price
               + ", "
               + quantity
               + " units, total: $ "
               + String.format("%.2f", totalValueInStock()); //+ totalValueInStock();
    }
    public double valueAddSub(double quantity, double price){
        return quantity * price;
    }
}
