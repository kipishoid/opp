package lesson6.model;

import lesson6.data.Product;
import lesson6.data.warehouse.Warehouse;

import java.util.Scanner;

public class Delete extends Model {
    public Delete(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        System.out.println("Enter the product ID: ");
        int key = scanner.nextInt();
        for (Product product : warehouse.getProducts()) {
            if (product.getId() == key) {
                System.out.println(product);
                System.out.print("delete? Y/N ");
                String in = scanner.next().toUpperCase();
                if (in.equals("Y"))
                    warehouse.delete(product);
            }
        }
    }
}
