package lesson6.model;

import lesson6.data.warehouse.Warehouse;

import java.util.Scanner;

public class Exit extends Model {
    public Exit(String nameMenu) {
        super(nameMenu);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        warehouse.export();
        System.out.println("Exit");
        System.exit(0);
    }
}
