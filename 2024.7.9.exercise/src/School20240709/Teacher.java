package School20240709;

public class Teacher extends Role{
    String agency;

    public Teacher() {}

    public Teacher(String name, String age, String agency) {
        super(name, age);
        this.agency = agency;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void question() {
        System.out.println("老师" + this.name + "正在提问");
    }
}
