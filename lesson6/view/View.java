package lesson6.view;

import lesson6.control.Control;

public interface View {
    /**
     * Open-closed principle открыт для расширения другими версиями view, закрыт для
     * модификаций
     */
    public Control getControl();

    public void start(Control control);
}
