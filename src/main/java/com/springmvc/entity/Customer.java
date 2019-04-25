package com.springmvc.entity;

public class Customer {
    private int custid;
    private String custname;
    private String nickname;
    private String custphone;
    private String password;

    /*
    重点！！！
    对于属性名，要和sql里面的属性名一致
    然后get和set方法只能改变属性名的第一个字母为大写
    如nickname--->getNickname  而不是getNickName
     */

    public int getCustid() { return this.custid; }

    public String getCustname() { return this.custname; }

    public String getNickname() { return this.nickname; }

    public String getPhone() {return this.custphone; }

    public String getPassword() {return this.password;  }


    public void setCustid(int custId) {this.custid = custId;}

    public void setCustname(String realName) { this.custname = realName;  }

    public void setNickname(String nickName) {this.nickname = nickName; }

    public void setPhone(String phone) {  this.custphone = phone; }

    public void setPassword(String password) { this.password = password; }
}
