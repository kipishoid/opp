package lesson6.model.change;

import lesson6.control.*;
import lesson6.data.warehouse.Warehouse;
import lesson6.model.Model;
import lesson6.view.*;

import java.util.Scanner;

public class Change extends Model {
    protected final View view;

    public Change(String nameMenu, View view) {
        super(nameMenu);
        this.view = view;
    }

    @Override
    public void execute(Warehouse warehouse, Scanner scanner) {
        Control sub = new V1Control(warehouse,
                new Increase("Increase"),
                new Decrease("Decrease"),
                new Return("Return", view));
        new V1View(sub);
    }
}
