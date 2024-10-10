package SerializationExercise20240810;

public class SerializationExercise3 {
    public static void main(String[] args) {
        // 当进行反序列化时，还会出现一种错误——能够成功找到class文件，但是class文件在序列化对象之后发生了修改，
        // 那么反序列化失败，抛出InvalidClassException，原因如下：

        /* 该类的序列版本号与从流中读取的类描述符的版本号不匹配
         * 该类包含未知数据类型
         * 该类没有可访问的无参数构造方法 */

        // Serializable接口给需要序列化的类，提供了一个序列版本号————serialVersionUID
        // 该版本号的目的在于验证序列化的对象和对应类是否版本匹配。

//        public class Employee implements java.io.Serializable {
//            // 加入序列版本号
//            private static final long serialVersionUID = 1L;
//            // 此处自己确定版本号，则在序列化之后，无论对类如何修改，版本号不变
//            public String name;
//            public String address;
//            // 添加新的属性 ,重新编译, 可以反序列化,该属性赋为默认值.
//            public int eid;
//
//            public void addressCheck() {
//                System.out.println("Address  check : " + name + " -- " + address);
//            }
//        }
    }
}
