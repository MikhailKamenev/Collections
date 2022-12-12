package Products;

import java.util.Objects;

public class Product {
    private final String name;
    private final double price;
//    private int amount;
    private boolean bought;

    public Product(String name, double price, int amount) {
        if (name == null || name.isEmpty() || name.isBlank() || price <= 0 || amount <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью");
        } else if (!name.matches("^[а-яА-Я]+$")) {
            throw new IllegalArgumentException("Назване продукта должно быть указано на русском языке");
        }else {
        this.name = name;
        this.price = price;
//        this.amount = amount;
        this.bought = false;
        }
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
//    public int getAmount() {
//        return amount;
//    }
    public boolean isBought() {
        return bought;
    }

    public void setBought() {
        this.bought = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return name+". Статус: "+(this.isBought()?"куплен":"не куплен. Количество ");
    }
}
