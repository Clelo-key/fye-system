package cn.fye.lecteste.server.vo;

public class UserVO {
    private String username;
    private Integer id;

    public String getUsername() {
        return username;
    }

    public UserVO setUsername(String username) {
        this.username = username;
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
