package oop.lesson1;

import java.util.LinkedList;
import java.util.List;

public class Category extends Shop {

    public Category(String name) {
        super(name);
        super.setCatalog(new LinkedList<>());
    }

    @Override
    public String toString() {
        return "\n" + getName() + ": " + super.getCatalog();
    }
}
