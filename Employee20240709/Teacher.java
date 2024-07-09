package Employee20240709;

public class Teacher extends Employee {
    String place;
    String work;

    public Teacher() {
        this("null", "null", "教学", "教学部", "null");
    }

    public Teacher(String name, String id, String workCategory, String place, String work) {
        super(name, id, workCategory);
        this.place = place;
        this.work = work;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void working() {
        System.out.println("员工:" + this.name + "    id:" + this.id);
        System.out.printf("在%s教%s\n", this.place, this.work);
    }
}
