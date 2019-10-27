package aholdai.aholdaiserver.controllers;

import aholdai.aholdaiserver.models.Food;
import aholdai.aholdaiserver.models.Recipe;
import aholdai.aholdaiserver.services.recipeservice.Base.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("recipes")
public class RecipeController {

    private RecipeService recipeService;

    @Autowired
    RecipeController(RecipeService recipeService){this.recipeService=recipeService;}

    @GetMapping(value = "/search/ingredient")
    public List<Recipe> searchByIngredient(String ingredient) {
        List<Recipe> filtered = new ArrayList<>();
        filtered =  recipeService.searchByIngredient(ingredient);
        return filtered;
    }

    @GetMapping(value="/filter/ingredient")
    public List<Recipe> getFilteredByIngredient(String ingredient) {
        List<Recipe> filtered = new ArrayList<>();
        filtered =  recipeService.getFilteredByIngredient(ingredient);
        return filtered;
    }

    @GetMapping("/sort/calories")
    public List<Recipe> getSortedByCalories() {
        List<Recipe> sorted = new ArrayList<>();
        sorted = recipeService.getSortedByCalories();
        return sorted;
    }

    @GetMapping(value = "/all")
    public List<Recipe> getAllRecipes() {
        return recipeService.getAllRecipes();
    }
}
