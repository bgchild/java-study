package oop.extendskey.demo;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class User {
    private String userName;
    private Double money;

    public User() {
    }

    public User(String userName, Double money) {
        this.userName = userName;
        this.money = money;
    }

    public void show() {
        System.out.println("用户名:" + userName + " , 余额为:" + money + "元");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
