package aholdai.aholdaiserver.services.recipeservice;

import aholdai.aholdaiserver.models.Recipe;
import aholdai.aholdaiserver.repositories.recipeRepository.Base.recipeRepository;
import aholdai.aholdaiserver.services.recipeservice.Base.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeServiceImpl implements RecipeService {

    private recipeRepository recipeRepository;

    @Autowired
    public RecipeServiceImpl (recipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }


    @Override
    public List<Recipe> getAllRecipes() {
        return recipeRepository.getAllRecipes();
    }

    @Override
    public List<Recipe> searchByIngredient(String ingredient) {
        return recipeRepository
                .getAllRecipes()
                .stream()
                .filter(recipe -> recipe.getIngredients()
                        .stream()
                        .anyMatch(food -> food.getFoodName().equals(ingredient)))
                        .collect(Collectors.toList());
    }

    @Override
    public List<Recipe> getSortedByCalories() {
        return recipeRepository
                .getAllRecipes()
                .stream()
                .sorted(Comparator.comparing(Recipe::getCalories))
                .collect(Collectors.toList());
    }

    @Override
    public List<Recipe> getFilteredByIngredient(String ingredient) {
        return recipeRepository
                .getAllRecipes()
                .stream()
                .filter(recipe -> {
                    return !recipe.getIngredients().contains(ingredient);
                })
                .collect(Collectors.toList());
    }


}
