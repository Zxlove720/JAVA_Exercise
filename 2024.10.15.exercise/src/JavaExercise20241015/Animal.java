package JavaExercise20241015;

public class Animal {
    String name;
    int health;
    int love;
    String category;

    public Animal() {}

    public Animal(String name, int health, int love, String category) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love +
                ", category='" + category + '\'' +
                '}';
    }
}
