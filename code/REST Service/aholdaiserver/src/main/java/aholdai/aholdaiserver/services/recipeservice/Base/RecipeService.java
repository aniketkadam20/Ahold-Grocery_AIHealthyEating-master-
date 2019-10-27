package aholdai.aholdaiserver.services.recipeservice.Base;

import aholdai.aholdaiserver.models.Food;
import aholdai.aholdaiserver.models.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> getAllRecipes();
    List<Recipe> searchByIngredient(String ingredient);
    //List<Recipe> filterByIngredient();
    List<Recipe> getSortedByCalories();

    List<Recipe> getFilteredByIngredient(String ingredient);
}
