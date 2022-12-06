package Products;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();

    public void addProduct(Product product) throws ProductAlreadyExists {
        if (products.contains(product)) {
            throw new ProductAlreadyExists("Продукт уже есть в списке");
        } else {
            products.add(product);
        }
    }

    public void buyProduct(Product product) {
        for (Product product1 : this.products) {
            if (product.equals(product1)) {
                product.setBought();
//                this.products.remove(product); на случай если нужна функция удаления из списка, если товар уже куплен.
                break;
            }
        }
    }

    public void deleteProduct(Product product) {
        if (product.isBought()) {
            this.products.remove(product);
        } else {

        }
    }

    public double totalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice = totalPrice + product.getPrice();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Список продуктов: " + products;
    }
}
