package Employee20240709;

public class AdminStaff extends Employee {
    String place;
    String work;

    public AdminStaff() {
        this("null", "null", "行政", "行政部", "null");
    }

    public AdminStaff(String name, String id,
                      String workCategory, String place, String work) {
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
        System.out.println("员工:" + this.name + "id:" + this.id);
        System.out.printf("在%s%s", this.place, this.work);
    }
}
