package Employee20240709;

public class Employee {
    String name;
    String id;
    String workCategory;

    public Employee() {}

    public Employee(String name, String id, String workCategory) {
        this.name = name;
        this.id = id;
        this.workCategory = workCategory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWorkCategory() {
        return workCategory;
    }

    public void setWorkCategory(String workCategory) {
        this.workCategory = workCategory;
    }
}
