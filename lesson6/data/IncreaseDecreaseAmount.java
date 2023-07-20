package lesson6.data;

import lesson6.data.Product;

public interface IncreaseDecreaseAmount {

    /**
     * Interface segregation principle декомпозирован по функциональным интерфейсам
     */
    public Product increase(Product product, int amount);

    public Product decrease(Product product, int amount);
}
