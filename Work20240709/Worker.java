package Work20240709;

public class Worker extends Person{
    String unit;
    int workAge;

    public Worker() {}

    public Worker(String name, String gender, int age, String nationality, String unit, int workAge) {
        super(name, gender, age, nationality);
        this.unit = unit;
        this.workAge = workAge;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getWorkAge() {
        return workAge;
    }

    public void setWorkAge(int workAge) {
        this.workAge = workAge;
    }

    @Override
    public void work() {
        System.out.printf("来自%s单位的%d%s工人%s，工龄是%d，正在盖房子\n", this.unit,
                this.age, this.gender, this.name, this.workAge);
    }
}
