package Clone20240716;

public class Clone20240716 {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 将A对象的内部属性完全拷贝给B对象，就叫对象克隆，或者对象拷贝、对象复制
        int[] data = {1, 2, 3, 4, 5, 6};
        User u1 = new User(1, "zhangSan", "123456", "girl1", data);
        // clone在Object中是protected的方法，只能在java.lang包中使用，所以说要重写

        User u2 = (User)u1.clone();
        u2.data[1] = 100;
        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }
}
