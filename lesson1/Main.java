package oop.lesson1;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop ComputerIndustry = new Shop("ComputerIndustry");
        Product smartphone1 = new Product("iphone", 70999, 8.5);
        Product smartphone2 = new Product("xiaomi", 19999, 7.5);
        Product smartphone3 = new Product("nokia", 9999, 5.5);
        Product notebook1 = new Product("macbook", 150999, 9.1);
        Product notebook2 = new Product("hp", 47699, 8.3);
        Product notebook3 = new Product("lenovo", 58499, 7.5);
        Product monoblock1 = new Product("lg", 75900, 7.7);
        Product monoblock2 = new Product("asus", 52499, 7.2);
        Product monoblock3 = new Product("hp", 65999, 7.0);
        ComputerIndustry.addProduct(smartphone1);
        ComputerIndustry.addProduct(smartphone2);
        ComputerIndustry.addProduct(smartphone3);
        ComputerIndustry.addProduct(notebook1);
        ComputerIndustry.addProduct(notebook2);
        ComputerIndustry.addProduct(notebook3);
        ComputerIndustry.addProduct(monoblock1);
        ComputerIndustry.addProduct(monoblock2);
        ComputerIndustry.addProduct(monoblock3);
        CategoryProduct smartphone = new CategoryProduct("Smartphone");
        smartphone.addProduct(smartphone1);
        smartphone.addProduct(smartphone2);
        smartphone.addProduct(smartphone3);
        CategoryProduct notebook = new CategoryProduct("Notebook");
        notebook.addProduct(notebook1);
        notebook.addProduct(notebook2);
        notebook.addProduct(notebook3);
        CategoryProduct monoblock = new CategoryProduct("Monoblock");
        monoblock.addProduct(monoblock1);
        monoblock.addProduct(monoblock2);
        monoblock.addProduct(monoblock3);
        User user1 = new User("Max", "1234lkj");
        User user2 = new User("Gleb", "lkj1234");
        User user3 = new User("Artur", "asd1020");
        List<Product> products = ComputerIndustry.getCatalog();
        System.out.println(products);
        user1.buy(smartphone1, ComputerIndustry);
        List<Product> user1Buy = user1.getBasket();
        System.out.println("user1Buy = " + user1Buy);
        user2.buy(monoblock2, ComputerIndustry);
        List<Product> user2Buy = user2.getBasket();
        System.out.println("user2Buy = " + user2Buy);
        user3.buy(notebook3, ComputerIndustry);
        List<Product> user3Buy = user3.getBasket();
        System.out.println("user3Buy = " + user3Buy);
        products = ComputerIndustry.getCatalog();
        System.out.println(products);
    }
}
