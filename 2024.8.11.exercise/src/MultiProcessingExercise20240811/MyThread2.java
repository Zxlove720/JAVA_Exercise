package MultiProcessingExercise20240811;

public class MyThread2 implements Runnable{
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(this.getName() + ": " +i);
        }
    }
}
