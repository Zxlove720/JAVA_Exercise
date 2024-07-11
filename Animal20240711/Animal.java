package Animal20240711;

public abstract class Animal {
    private String category;
    private int age;

    public Animal() {}

    public Animal(String category, int age) {
        this.category = category;
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();

}
