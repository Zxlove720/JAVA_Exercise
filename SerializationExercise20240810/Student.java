package SerializationExercise20240810;
// 这个类是用来测试序列化的测试类

// 一个对象若想成功序列化，必须满足两个条件：
// 1.该类必须实现java.io.Serializable标记接口，不实现该接口，则无法序列化和反序列化，并且会抛出NotSerializableException异常
// 2.该类中的属性必须存在可以序列化的，如果一个属性不需要序列化，则可以用瞬态关键字transient修饰

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private String address;

    public Student() {
        this("张三", 20,"重庆");
    }

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age + ", address=" + address +
                '}';
    }
}
