package com.hls.pojo;

import org.apache.ibatis.type.Alias;

@Alias("user")
public class User {

    //实体类
    private Integer id;
    private String name;
    private String ago;
    private String address;
    private String birthday;

    public User(){
    }

    public User(Integer id) {
        this.id = id;
    }

    public User(String name, String ago, String address, String birthday) {
        this.name = name;
        this.ago = ago;
        this.address = address;
        this.birthday = birthday;
    }

    public User(Integer id, String name, String ago, String address, String birthday) {
        this.id = id;
        this.name = name;
        this.ago = ago;
        this.address = address;
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAgo() {
        return ago;
    }

    public void setAgo(String ago) {
        this.ago = ago;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ago='" + ago + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
