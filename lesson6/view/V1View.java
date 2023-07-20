package lesson6.view;

import lesson6.control.*;
import lesson6.data.warehouse.Warehouse1;
import lesson6.data.warehouse.Warehouse;
import lesson6.model.*;
import lesson6.model.change.Change;

import java.util.Scanner;

public class V1View implements View {
    protected Control control;

    public V1View(Control control) {
        this.control = control;
        start(control);
    }

    public V1View() {
        Warehouse warehouse = new Warehouse1();
        this.control = new V1Control(warehouse,
                new Show("Show"),
                new Add("Add"),
                new Delete("Delete"),
                new Change("Change", this),
                new Order("Order"),
                new Exit("Exit"));
        start(control);
    }

    @Override
    public void start(Control control) {
        Scanner in = new Scanner(System.in).useDelimiter("\r?\n");
        System.out.print(control.toString() + "\n");
        while (true) {
            System.out.print(" Menu->");
            int key = in.nextInt() - 1;
            if (key >= 0 && key < control.size())
                control.onExecute(key, in);
            else
                System.out.println("invalid value");
        }
    }

    @Override
    public Control getControl() {
        return control;
    }
}
