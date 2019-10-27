package aholdai.aholdaiserver.services.foodservice.Base;

import aholdai.aholdaiserver.models.Food;

import java.util.List;

public interface FoodService {

    List<Food> getAllFoods();

    List<Food> searchByIngredient(String ingredient);

    List<Food> getFilteredByIngredient(String ingredient);

    List<Food> getSortedByAvailableDate();
 }
