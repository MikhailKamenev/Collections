import Passport.Passport;
import Products.*;
import School.MultiplicationTable;

import java.util.*;

public class Main {
    public static void main(String[] args) throws ProductAlreadyExists {
        //course 2. Collections
        Product banana = new Product("Банан", 60, 3);
        Product apple = new Product("Яблоко", 85, 2);
        Product orange = new Product("Апельсин", 90, 1);
        Product grape = new Product("Виноград", 115, 1);
        Product pork = new Product("Свинина", 270, 2);
        Product chicken = new Product("Курица", 180, 2);
        ProductList fruits = new ProductList();
        ProductList meat = new ProductList();
        meat.addProduct(pork);
        meat.addProduct(chicken);
        fruits.addProduct(banana);
        fruits.addProduct(apple);
        fruits.addProduct(orange);
        fruits.addProduct(grape);
        System.out.println(fruits);
        System.out.println(meat);
        Recipe fruitSalad = new Recipe("Фруктовый салат", fruits);
        Recipe barbeque = new Recipe("Барбекю", meat);
        System.out.println(fruitSalad);
        System.out.println(barbeque);
        RecipeList recipeList = new RecipeList();
        recipeList.addRecipe(fruitSalad);
        recipeList.addRecipe(barbeque);
//        recipeList.addRecipe(barbeque); Проверка на добавление рецепта, который уже есть в списке
        System.out.println(recipeList);


        // задача на множество целых чисел
        //Создайте множество целых чисел. Заполните множество 20 случайными числами в диапазоне от 0 до 1000.
        //Пройдитесь по всем элементам множества и удалите из него все нечетные значения.
        number();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);

    }

    public static void number() {
        Set<Integer> num = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            num.add(random.nextInt(1000));
        }
        System.out.println(num);
        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(num);
    }
    // задача на таблицу умножения
}