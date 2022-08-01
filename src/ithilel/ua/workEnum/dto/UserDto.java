package ithilel.ua.workEnum.dto;

import ithilel.ua.workEnum.enums.Roles;

public class UserDto {

    private String login;
    private String password;
    private String name = "Вы не авторизированы";
    private String role = Roles.defaultRole() ;

    public UserDto(String login, String password) {
        this.login = login;
        this.password = password;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
