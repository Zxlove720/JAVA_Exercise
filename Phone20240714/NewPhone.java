package Phone20240714;

public class NewPhone extends Phone implements PlayGame{
    public NewPhone() {}

    public NewPhone(String brand, String price) {
        super(brand, price);
    }

    @Override
    public void call() {
        System.out.println("新手机" + this.getBrand() + "在打电话");
    }

    @Override
    public void sendMessages() {
        System.out.println("新手机" + this.getBrand() + "在发短信");
    }

    @Override
    public void playGame() {
        System.out.println("新手机" + this.getBrand() + "在玩游戏");
    }
}
