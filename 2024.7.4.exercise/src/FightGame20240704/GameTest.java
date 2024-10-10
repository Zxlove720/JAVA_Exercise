package FightGame20240704;
import java.util.Scanner;
public class GameTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameRole gameRole1 = new GameRole("八神", 100, '男');
        gameRole1.setFace(gameRole1);
        GameRole gameRole2 = new GameRole("不知火舞", 100, '女');
        gameRole2.setFace(gameRole2);
        System.out.println(gameRole1.getName() + ":" + gameRole1.getFace());
        System.out.println(gameRole2.getName() + ":" + gameRole2.getFace());
        System.out.println();
        System.out.println();

        while (true){
            gameRole1.attack(gameRole2);
            if(gameRole2.getBlood() <= 0){
                System.out.printf("%s战胜了%s", gameRole1.getName(), gameRole2.getName());
                break;
            }
            gameRole2.attack(gameRole1);
            if(gameRole1.getBlood() <= 0){
                System.out.printf("%s战胜了%s", gameRole2.getName(), gameRole1.getName());
                break;
            }
        }
    }
}
