package lesson6.control;

import lesson6.data.warehouse.Warehouse;
import lesson6.model.Model;

import java.util.Scanner;

public class V1Control implements Control {
    private final Model[] models;
    private Warehouse warehouse;

    public V1Control(Warehouse warehouse, Model... models) {
        this.warehouse = warehouse;
        this.models = models;
    }

    @Override
    public void onExecute(int item, Scanner in) {
        models[item].execute(warehouse, in);
    }

    @Override
    public int size() {
        return models.length;
    }

    @Override
    public String toString() {
        StringBuilder main = new StringBuilder();
        main.append("\nMENU\n")
                .append("Select a menu item for\n")
                .append("interactions with\n")
                .append("warehouse management:\n");
        for (int i = 0; i < models.length; i++) {
            main.append("[")
                    .append(i + 1)
                    .append("] ")
                    .append(models[i].getNameMenu())
                    .append("\n");
        }
        return main.toString();
    }
}
