package Fun20240713;

public class FunTest extends Fun{
    @Override
    public void fun() {
        System.out.println("fun");
    }

    public static void main(String[] args) {
        new Fun() {
            public void fun() {
                System.out.println("内部类的fun");
            }
        }.fun();
    }
}
