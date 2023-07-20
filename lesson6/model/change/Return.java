package lesson6.model.change;

import lesson6.data.warehouse.Warehouse;
import lesson6.view.View;

import java.util.Scanner;

public class Return extends Change {

    public Return(String nameMenu, View view) {
        super(nameMenu, view);
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        view.start(view.getControl());
    }
}
