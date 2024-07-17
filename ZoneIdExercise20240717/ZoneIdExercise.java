package ZoneIdExercise20240717;

import java.time.ZoneId;
// ZoneId是时区
public class ZoneIdExercise {
    public static void main(String[] args) {
        System.out.println(ZoneId.getAvailableZoneIds());
        // 以Set集合的方式返回Java中支持的所有时区
        System.out.println(ZoneId.getAvailableZoneIds().size()); // 2024.7.17有603个
        System.out.println(ZoneId.systemDefault()); // 获取系统的时区
        System.out.println(ZoneId.of("Asia/Chongqing")); // 获得一个指定的时区
        /*ZoneId zoneId = new ZoneId();*/ // Zone 为抽象类，无法实例化
        ZoneId zoneId = ZoneId.of("Asia/Chongqing");
        System.out.println(zoneId);
        zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);


    }
}
