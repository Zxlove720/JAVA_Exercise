package School20240709;

public class Role {
    String name;
    String age;

    public Role() {}

    public Role(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void checkClasses() {
        System.out.println(this.name + "正在查看课表");
    }
}
