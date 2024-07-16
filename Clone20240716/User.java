package Clone20240716;

public class User implements Cloneable{
    // Cloneable是一个接口，但是它里面没有任何内容，称为标记接口，给类打上了可以克隆的标记
    private int id;
    private String username;
    private String password;
    private String path;
    public int[] data;

    public User() {}

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "角色编号为：" + id + "，用户名为：" + username + "密码为：" + password
                + ", 游戏图片为:" + path + ", 进度:" + arrToString();
    }

    public String arrToString() {
        String str = "";
        str = str + "[";
        for (int i = 0; i < data.length; i++) {
            str = str + data[i] + ",";
        }
        str = str + "]";
        return str;
    }


    protected Object clone() throws CloneNotSupportedException {
        // 先把被克隆对象中的数组获取出来
        int[] data = this.data;
        // 创建新的数组
        int[] newData =new int[data.length];
        // 拷贝数组中的数据
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        // 调用父类中的方法克隆对象
        User u=(User)super.clone();
        // 因为父类中的克隆方法是浅克隆，替换克隆出来对象中的数组地址值
        u.data =newData;
        return u;
    }
}
