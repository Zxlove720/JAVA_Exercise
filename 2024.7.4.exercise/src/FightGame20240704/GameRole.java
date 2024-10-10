package FightGame20240704;
import java.util.Random;
public class GameRole {
    Random r = new Random();

    private String name;
    private int blood;
    private char gender;
    private String face;

    public GameRole(){}

    public GameRole(String name, int blood, char gender){
        this.name = name;
        this.blood = blood;
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setBlood(int blood){
        this.blood = blood;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public void setFace(String face){
        this.face = face;
    }

    public String getName(){
        return name;
    }
    public int getBlood(){
        return blood;
    }
    public char getGender(){
        return gender;
    }
    public String getFace(){
        return face;
    }

    public void setFace(GameRole gameRole){
        String[] boyFaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
        String[] girlFaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};
        if(gameRole.gender == '男'){
            int randomIndex = r.nextInt(boyFaces.length);
            gameRole.face = boyFaces[randomIndex];
        } else if(gameRole.gender == '女'){
            int randomIndex = r.nextInt(girlFaces.length);
            gameRole.face = girlFaces[randomIndex];
        } else {
            gameRole.face = "相貌平平";
        }
    }

    public void attack(GameRole gameRole){
        String[] attack={
                "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
                "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
                "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
                "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
                "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
                "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
        };
        String[] injure={
                "结果%s退了半步，毫发无损",
                "结果给%s造成一处瘀伤",
                "结果一击命中，%s痛得弯下腰",
                "结果%s痛苦地闷哼了一声，显然受了点内伤",
                "结果%s摇摇晃晃，一跤摔倒在地",
                "结果%s脸色一下变得惨白，连退了好几步",
                "结果『轰』的一声，%s口中鲜血狂喷而出",
                "结果%s一声惨叫，像滩软泥般塌了下去"
        };

        int randomAttack = r.nextInt(20) + 1;
        int remainBlood = gameRole.blood - randomAttack;
        gameRole.setBlood(remainBlood);
        int randomIndex1 = r.nextInt(attack.length);
        System.out.printf(attack[randomIndex1], this.getName(), gameRole.getName());
        System.out.println();
        int randomIndex2 = r.nextInt(attack.length);
        System.out.printf(injure[randomIndex2], gameRole.getName());
        System.out.println();
        System.out.printf("这一下造成了%d的伤害,%s还剩%d的血量\n", randomAttack, gameRole.getName(), gameRole.getBlood());
        if(remainBlood < 0){
            System.out.println(this.getName() + "完成了超杀!");
        }
    }
}
