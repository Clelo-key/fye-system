package com.hmdp.boot.server.vo;

public class UserVO {
    private String Username;
    private Integer id;

    public String getUsername() {
        return Username;
    }

    public UserVO setUsername(String Username) {
        this.Username = Username;
        return this;
    }

    public Integer getId() {
        return id;
    }

    public UserVO setId(Integer id) {
        this.id = id;
        return this;
    }
}
