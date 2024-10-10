package AnotherTest20240713;

public class Test {
    public static void main(String[] args) {
        B b = new B(new InterB() {
            @Override
            public void showB() {
                System.out.println("匿名内部类的showB");
            }
        });
        b.methodB();
        B a = new B(new InterB(){
            public void showB() {
                System.out.println("匿名内部类的showA");
            }
        });
        a.methodB();
    }
}

interface InterB{
    public abstract void showB();
}

class B{
    InterB b;
    public B(InterB b){
        this.b = b;
    }
    public void methodB() {
        b.showB();
    }
}


