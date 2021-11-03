package model;

public class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //для отладки
    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                '}';
    }
}
