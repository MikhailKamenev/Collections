package Products;

import java.util.*;

public class ProductList {
//    private final Set<Product> products = new HashSet<>();
    private HashMap<Product,Integer>productWithAmount = new HashMap<>();

    public void putProduct(Product product, Integer integer) {
        if (integer > 0) {
            productWithAmount.put(product, integer);
        } else {
            integer =1;
            productWithAmount.put(product, integer);
        }
    }

//    public void addProduct(Product product) throws ProductAlreadyExists {
//        if (products.contains(product)) {
//            throw new ProductAlreadyExists("Продукт уже есть в списке");
//        } else {
//            products.add(product);
//        }
//    }

//    public void buyProduct(Product product) {
//        for (Product product1 : this.products) {
//            if (product.equals(product1)) {
//                product.setBought();
////                this.products.remove(product); на случай если нужна функция удаления из списка, если товар уже куплен.
//                break;
//            }
//        }
//    }

//    public void deleteProduct(Product product) {
//        if (product.isBought()) {
//            this.products.remove(product);
//        } else {
//
//        }
//    }

    public double listPrice() {
        double totalCost =0;
        for (Map.Entry<Product, Integer> pair : productWithAmount.entrySet()) {
            totalCost=pair.getKey().getPrice()*pair.getValue()+totalCost;
        }
        return totalCost;
    }
//    public double totalPrice() {
//        double totalPrice = 0;
//        for (Product product : products) {
//            totalPrice = totalPrice + product.getPrice();
//        }
//        return totalPrice;
//    }

    @Override
    public String toString() {
        return "Список продуктов: " + productWithAmount.toString();
    }
}
