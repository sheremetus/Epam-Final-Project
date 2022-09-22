package com.epam.hotel.bean;

import java.io.Serializable;
import java.util.Objects;

public class Guest implements Serializable {

    private int id;
    private String name;
    private String surname;
    private int admin_id;
    private int user_id;

    public Guest() {
    }

    public Guest(int id, String name, String surname, int admin_id, int user_id) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.admin_id = admin_id;
        this.user_id = user_id;
    }

    public Guest(int id) {
        this.id = id;
    }

    public Guest(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guest guest = (Guest) o;
        return id == guest.id && admin_id == guest.admin_id && user_id == guest.user_id && Objects.equals(name, guest.name) && Objects.equals(surname, guest.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, admin_id, user_id);
    }

    @Override
    public String toString() {
        return Guest.class.toString() + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", admin_id=" + admin_id +
                ", user_id=" + user_id +
                '}';
    }
}
