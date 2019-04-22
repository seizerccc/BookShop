package com.springmvc.entity;

public class Customer {
    private int custId;
    private String realName;
    private String nickName;
    private String phone;
    private String password;

    public int getCustId() { return custId; }

    public String getRealName() { return realName; }

    public String getNickName() { return nickName; }

    public String getPhone() {return phone; }

    public String getPassword() {return password;  }


    public void setCustId(int custId) {this.custId = custId;}

    public void setRealName(String realName) { this.realName = realName;  }

    public void setNickName(String nickName) {this.nickName = nickName; }

    public void setPhone(String phone) {  this.phone = phone; }

    public void setPassword(String password) { this.password = password; }
}
