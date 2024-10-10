package ObjectExercise20240716;

import java.util.Objects;

public class Phone {
    String brand;
    int price;

    public Phone() {}

    public Phone(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{brand:" + this.brand  + "  price:" + this.price
                 + "}" ;
    }

    @Override
    public boolean equals(Object o) // 相当于这里是用Object顶级父类来接受传递的对象，从而形成多态
    {
        if (this == o) return true; // 如果两个对象是同一个对象则直接返回ture（同一个对象必然相等）
        if (o == null || getClass() != o.getClass()) return false;
        // 当传递的对象是null，或者两个对象不是同类，则返回false，无需多言
        Phone phone = (Phone) o; // 强制类型转换，从父类到子类
        return price == phone.price && Objects.equals(brand, phone.brand);
        // 现在比较的就是属性值了
    }


}
