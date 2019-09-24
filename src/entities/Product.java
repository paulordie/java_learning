package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    public void removeProduct(int quantity){
        this.quantity -= quantity;
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
