package Supermarket20240704;

public class Commodity {
    private String name;
    private double price;
    private int inventory;

    public Commodity(){};
    public Commodity(String name, double price, int inventory){
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setInventory(int inventory){
        this.inventory = inventory;
    }

    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
    public int getInventory(){
        return this.inventory;
    }

    public void sale(int saleNumbers){
        int remainInventory = this.inventory - saleNumbers;
        this.setInventory(remainInventory);
    }

    public void discount(int discount){
        if(discount < 10 && discount >0){
            double newPrice = this.price * (discount / 10.0);
            this.setPrice(newPrice);
        }
    }
}
