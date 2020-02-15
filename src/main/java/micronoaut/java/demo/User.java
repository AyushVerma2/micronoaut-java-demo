package micronoaut.java.demo;

import javax.inject.Singleton;

@Singleton
public class User {
    private String name;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    private int id;
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



}