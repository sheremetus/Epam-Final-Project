package com.epam.hotel.bean;


import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
    private String login;
    private String password;
    private Role role;
    private int id;

    public User() {
    }

    public User(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public User(String login, String password, int role) {
        this.login = login;
        this.password = password;

        if (role == 2) {
            this.role = new Role(2,"administrator");
        }
        else{
            this.role = new Role(1,"guest");
        }
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, Role role, int id) {
        this.login = login;
        this.role = role;
        this.id = id;
    }

    public User(int id) {
        this.id = id;
    }

    public User(String login) {
        this.login = login;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(password, user.password) && Objects.equals(role, user.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, password, role);
    }

    @Override
    public String toString() {
        return User.class.getName() + " {" + "login='" + login + '\'' + ", password='" + password + '\'' + ", role=" + role + '}';
    }
}
