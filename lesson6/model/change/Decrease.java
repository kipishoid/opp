package lesson6.model.change;

import lesson6.data.Product;
import lesson6.data.warehouse.Warehouse;
import lesson6.model.Model;

import java.util.Scanner;

public class Decrease extends Model {
    public Decrease(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        System.out.println("Enter the product ID: ");
        int key = scanner.nextInt();
        for (Product product : warehouse.getProducts()) {
            if (product.getId() == key) {
                System.out.println(product);
                System.out.print("quantity -");
                warehouse.decrease(product, scanner.nextInt());
                System.out.print("done");
            }
        }
    }
}
