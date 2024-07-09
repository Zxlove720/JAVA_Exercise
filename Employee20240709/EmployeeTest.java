package Employee20240709;
import java.util.Scanner;
public class EmployeeTest {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.setName("zxl");
        t.setId("520");
        t.setWork("语文");
        t.working();

        Tutor tor = new Tutor();
        tor.setName("zxl");
        tor.setId("720");
        tor.setWork("语文");
        tor.working();
    }
}
