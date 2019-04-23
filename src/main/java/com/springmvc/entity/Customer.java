package com.springmvc.entity;

public class Customer {
    private int cust_id;
    private String cust_name;
    private String nick_name;
    private String cust_phone;
    private String password;

    public int getCustId() { return cust_id; }

    public String getRealName() { return cust_name; }

    public String getNickName() { return nick_name; }

    public String getPhone() {return cust_phone; }

    public String getPassword() {return password;  }


    public void setCustId(int custId) {this.cust_id = custId;}

    public void setRealName(String realName) { this.cust_name = realName;  }

    public void setNickName(String nickName) {this.nick_name = nickName; }

    public void setPhone(String phone) {  this.cust_phone = phone; }

    public void setPassword(String password) { this.password = password; }
}
