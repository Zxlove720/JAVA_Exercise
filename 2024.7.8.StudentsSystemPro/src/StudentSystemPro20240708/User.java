package StudentSystemPro20240708;

public class User {
    private String userName;
    private String password;
    private String phoneNumber;

    public User() {}
    public User(String userName, String password, String phoneNUmber) {
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNUmber;
    }

    public void setUserName(String name) {
        this.userName = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserName() {
        return this.userName;
    }
    public String getPassword() {
        return this.password;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}
