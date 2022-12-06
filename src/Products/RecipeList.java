package Products;

import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private final Set<Recipe> recipes = new HashSet<>();
    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new RuntimeException("Рецепт уже есть в списке");
        } else {
            recipes.add(recipe);
        }
    }

    public void removeRecipe(Recipe recipe) {
        this.recipes.remove(recipe);
    }

    @Override
    public String toString() {
        int i = 1;
        for (Recipe recipe : recipes) {
            System.out.println("Рецепт №"+(i++)+". "+ recipe);
        }
        return recipes.toString();
    }
}
