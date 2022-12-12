package Products;

import java.util.Set;

public class Recipe {
    private final String name;
    private final ProductList productList;
    private double cost;

    public Recipe(String name, ProductList productList) {
        if (name == null ||name.isEmpty()||name.isBlank()|| productList == null) {
            throw new IllegalArgumentException("Недостаточно данных для рецепта");
        }
        this.name = name;
        this.productList = productList;
        this.cost = productList.listPrice();
    }

    public String getName() {
        return name;
    }
    public ProductList getProductList() {
        return productList;
    }
    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return name + ". " + productList +
                ". Стоимость " + cost +" руб.";
    }
}
