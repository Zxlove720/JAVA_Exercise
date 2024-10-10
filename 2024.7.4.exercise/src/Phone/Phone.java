package Phone;

public class Phone {
    private String brand;
    private int price;
    private String color;

    public Phone(){}
    public Phone(String brand, int price, String color){
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getBrand(){
        return brand;
    }
    public int getPrice(){
        return price;
    }
    public String getColor(){
        return color;
    }

    public void call(Phone phone){
        System.out.printf("正在使用价值%d的%s%s手机打电话\n", phone.getPrice(),
                phone.getColor(), phone.getBrand());
    }

    public void sendMessage(Phone phone){
        System.out.printf("正在使用价值%d的%s%s手机发短信\n", phone.getPrice(),
                phone.getColor(), phone.getBrand());
    }
}
