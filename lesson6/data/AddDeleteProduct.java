package lesson6.data;

import lesson6.data.Product;

import java.util.List;

public interface AddDeleteProduct {

    /**
     * Interface segregation principle декомпозирован по функциональным интерфейсам
     */
    public List<Product> addProduct(Product product);

    public List<Product> delete(Product product);
}
