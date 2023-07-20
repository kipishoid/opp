package lesson6;

import lesson6.view.*;

public class Main {
    public static void main(String[] args) {
        /*
         * Dependency inversion principle использовать абстракции в коде, не их
         * конкретные реализации
         */
        View view = new V1View();
    }
}