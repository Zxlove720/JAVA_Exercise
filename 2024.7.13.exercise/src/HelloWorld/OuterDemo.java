package HelloWorld;

public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }

    class Outer{
        public static Inter method() {
            return new Inter() {
                public void show() {
                    System.out.println("hello world");
                }
            };
        }


    }
}
