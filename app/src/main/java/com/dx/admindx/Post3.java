package com.dx.admindx;

public class Post3 {

    private String user ;

    private String password ;

    private int idRemolque ;

    public Post3(String user, String password, int idRemolque) {
        this.user = user;
        this.password = password;
        this.idRemolque = idRemolque;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public int getIdRemolque() {
        return idRemolque;
    }
}
