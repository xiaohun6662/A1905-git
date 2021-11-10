package cn.bdqn.domain;

public class Account {
    private Integer id;
    private String name;
    private Integer balance;
//二狗修改的文件
public String void(){
return null;
}

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

//三狗修改了文件
public void xxx(){
int x=12/0;
Systemout.print("二狗再次更新代码")
Systemout.print("二狗再次更新代码22222")
return null;
}
}
