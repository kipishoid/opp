package lesson6.model;

import lesson6.data.Product;
import lesson6.data.warehouse.Warehouse;

import java.util.Scanner;

public class Order extends Model {
    public Order(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        System.out.print("Enter the product ID: ");
        int key = scanner.nextInt();
        for (Product product : warehouse.getProducts()) {
            if (product.getId() == key) {
                System.out.println(product);
                System.out.print("in processing? Y/N ");
                String in = scanner.next().toUpperCase();
                if (in.equals("Y")) {
                    System.out.print("quantity: ");
                    warehouse.decrease(product, scanner.nextInt());
                    System.out.println("order processing");
                } else
                    System.out.println("the order is being processed");
            }
        }
    }
}
