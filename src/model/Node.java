package model;

import java.util.List;

public class Node {
    private String name;
    private List<Child> children;

    public String getName() {
        return name;
    }

    public List<Child> getChildren() {
        return children;
    }

    public Node() {
        this.name = name;
        this.children = children;
    }
    //для отладки
    @Override
    public String toString() {
        return "Node{" +
                "name='" + name + '\'' +
                ", children=" + children +
                '}';
    }
}
