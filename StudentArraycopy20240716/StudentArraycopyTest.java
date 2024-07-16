package StudentArraycopy20240716;

public class StudentArraycopyTest {
    public static void main(String[] args) {
        Student s1 = new Student("zhangSan", 23);
        Student s2 = new Student("liSi", 24);
        Student s3 = new Student("wangWu", 25);
        Student[] arr1 = {s1, s2, s3};
        Person[] arr2 = new Person[3];
        /* arraycopy时，基本数据类型必须严格一致，引用数据类型则不然，
        子类可以拷贝给父类，形成多态*/

        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        for (int i = 0; i < arr2.length; i++) {
            Student stu = (Student) arr2[i];
            System.out.println(stu.getName() + "," + stu.getAge());
            System.out.println(stu.toString());
        }
    }
}
