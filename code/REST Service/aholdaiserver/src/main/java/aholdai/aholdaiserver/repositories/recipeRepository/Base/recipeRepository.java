package aholdai.aholdaiserver.repositories.recipeRepository.Base;

import aholdai.aholdaiserver.models.Recipe;

import java.util.List;

public interface recipeRepository {
    List<Recipe> getAllRecipes();
}
