package com.hls.pojo;

public class User {

    //实体类
    private Integer id;
    private String name;
    private String ago;
    private String add;
    private String birthday;

    public User(){
    }

    public User(Integer id, String name, String ago, String add, String birthday) {
        this.id = id;
        this.name = name;
        this.ago = ago;
        this.add = add;
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

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
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
                ", add='" + add + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
