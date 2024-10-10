package StudentManage20240704;

public class Student {
    private int ID;
    private String name;
    private int age;

    public Student(){}

    public Student(int ID, String name, int age){
        this.ID = ID;
        this.name = name;
        this.age = age;
    }

    public void setID(int ID){
        this.ID = ID;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
}
