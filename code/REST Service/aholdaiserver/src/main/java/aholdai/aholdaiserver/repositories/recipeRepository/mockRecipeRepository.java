package aholdai.aholdaiserver.repositories.recipeRepository;

import aholdai.aholdaiserver.models.Food;
import aholdai.aholdaiserver.models.Recipe;
import aholdai.aholdaiserver.repositories.recipeRepository.Base.recipeRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static aholdai.aholdaiserver.models.enums.RecipeCategory.*;
@Repository
public class mockRecipeRepository implements recipeRepository {

    static Date date1 = new Date(1571827515);
    static Date date2 = new Date(1571857529);
    static Date date3 = new Date(1671827529);
    static List<String> ingr1 = Arrays.asList("cooked chickpeas", "tahini", "garlic", "salt", "citric acid");
    static List<String> ingr2 = Arrays.asList("eggs", "wheat", "milk", "soy");
    static List<String> ingr3 = Arrays.asList("dfgdsfg", "sdfgsdfg", "sdfgsed", "ggg");
    static Food hummus = new Food(ingr1, date1,"hummus");
    static Food cookies = new Food(ingr2, date2,"cookies");
    static Food briocheBuns = new Food(ingr3, date3,"briocheBuns");
    static List<Food> foods1=Arrays.asList(hummus,cookies);
    static List<Food> foods2=Arrays.asList(hummus,cookies,briocheBuns);
    static List<Food> foods3=Arrays.asList(briocheBuns,cookies);
    static Recipe r1 = new Recipe("Recipe1",foods1,DESSERTS,200);
    static Recipe r2 = new Recipe("Recipe2",foods2,MAIN_DISHES,1000);
    static Recipe r3 = new Recipe("Recipe3",foods3,SALADS,100);

    private List<Recipe> recipes=Arrays.asList(r1,r2,r3);


    @Override
    public List<Recipe> getAllRecipes() {
        return recipes;
    }
}
