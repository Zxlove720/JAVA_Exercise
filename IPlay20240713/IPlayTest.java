package IPlay20240713;

public class IPlayTest implements IPlay{

    public static void main(String[] args) {
        new IPlay() {
            public void playGame() {
                System.out.println("在玩游戏");
            }
        }.playGame();
    }

    @Override
    public void playGame() {
        System.out.println("在玩游戏");
    }
}
