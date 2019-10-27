package aholdai.aholdaiserver.controllers;

import aholdai.aholdaiserver.models.Food;
import aholdai.aholdaiserver.services.foodservice.Base.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("foods")
public class FoodController {

    private FoodService foodService;

    @Autowired
    public FoodController(FoodService foodService) {
        this.foodService = foodService;
    }

    @GetMapping(value = "/search/ingredient")
    public List<Food> searchByIngredient(String ingredient) {
        List<Food> filtered = new ArrayList<>();
            filtered =  foodService.searchByIngredient(ingredient);
        return filtered;
    }
    @GetMapping(value="/filter/ingredient")
    public List<Food> getFilteredByIngredient(String ingredient) {
        List<Food> filtered = new ArrayList<>();
        filtered =  foodService.getFilteredByIngredient(ingredient);
        return filtered;
    }

    @GetMapping("/sort/date")
    public List<Food> getSortedByAvailableDate() {
        List<Food> filtered = new ArrayList<>();
        filtered =  foodService.getSortedByAvailableDate();
        return filtered;
    }

    @GetMapping(value = "/all")
    public List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }


}
