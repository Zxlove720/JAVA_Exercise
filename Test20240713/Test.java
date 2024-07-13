package Test20240713;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new InterA() {
            public void showA() {
                System.out.println("匿名内部类的show");
            }
        });
    }
}

interface InterA{
    public abstract void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}
