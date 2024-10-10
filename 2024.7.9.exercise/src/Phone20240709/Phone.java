package Phone20240709;

public class Phone {
    private String brand;
    private String price;
    private static int size;

    public Phone() {}

    public Phone(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Phone.size = size;
    }

    public void call() {
        System.out.printf("价值%s的%d英寸%s手机正在打电话\n", this.price,
                Phone.size, this.brand);
    }

    public void sendMessages() {
        System.out.printf("价值%s的%d英寸%s手机正在发短信\n", this.price,
                Phone.size, this.brand);
    }
    public void playGames() {
        System.out.printf("价值%s的%d英寸%s手机正在玩游戏\n", this.price,
                Phone.size, this.brand);
    }
}
