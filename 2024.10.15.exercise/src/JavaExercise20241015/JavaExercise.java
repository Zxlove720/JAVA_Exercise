package JavaExercise20241015;

public class JavaExercise {
    public static void main(String[] args) {

//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (i + 1);
//        }
//        int[] array1 = array;
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(array1[i] + " ");
//        }
//        System.out.println();
//        for (int i : array) {
//            System.out.print(i + " ");
//        }
//        array1[0] = 999;
//        for (int i : array) {
//            System.out.print(i + " ");
//        }

        Animal dog = new Dog("旺财", 100, 100, "狗");
        Animal cat = new Cat("猫", 100, 100, "猫");

        System.out.println(dog);
        System.out.println(cat);
    }
}
