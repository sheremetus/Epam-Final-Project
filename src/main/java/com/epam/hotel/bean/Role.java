package com.epam.hotel.bean;

import java.util.Objects;

public class Role {
    private int id;
    private String title;

    public Role(String title) {
        this.title = title;
    }

    public Role(int id) {
        this.id = id;
    }

    public Role(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(title, role.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return Role.class.getName()+" {" +
                "title='" + title + '\'' +
                '}';
    }
}
