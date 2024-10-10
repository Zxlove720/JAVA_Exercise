package ExceptionExercise20240805;

import java.io.FileNotFoundException;

public class ExceptionExercise1 {
    public static void main(String[] args) {
        // finally必须和try-catch一起使用，无法单独使用
        // finally 无论异常是否发生，finally中的代码一定会执行；异常会导致程序的跳转，导致一些语句无法执行成功，但finally中的代码一定执行
        try {
            read("b.txt");
        } catch(FileNotFoundException e) {
            Runtime.getRuntime().exit(1); // 这里调用虚拟机关闭的方法，这样finally中的代码就不会执行了
            throw new RuntimeException("文件找不到");
        } finally {
            System.out.println("finally必须执行");
        }
    }

    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {
            throw new FileNotFoundException("文件不存在");
        }
    }
}

// 无论是否有异常，finally中的代码一定是会执行的
// 所以说finally中应该写无论异常发生与否都应该执行的代码（如文件关闭、资源回收等）
// 除非在前面的try或者catch中调用了关闭虚拟机的方法，此时finally中的代码就无法执行了
