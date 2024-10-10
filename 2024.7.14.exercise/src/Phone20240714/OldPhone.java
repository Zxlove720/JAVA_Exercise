package Phone20240714;

public class OldPhone extends Phone {
    public OldPhone() {}

    public OldPhone(String brand, String price) {
        super(brand, price);
    }

    @Override
    public void call() {
        System.out.println("旧手机" + this.getBrand() + "在打电话");
    }

    @Override
    public void sendMessages() {
        System.out.println("新手机" + this.getBrand() + "在打电话");
    }
}
