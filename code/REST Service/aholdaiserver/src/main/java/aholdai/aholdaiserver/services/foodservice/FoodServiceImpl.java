package aholdai.aholdaiserver.services.foodservice;

import aholdai.aholdaiserver.models.Food;
import aholdai.aholdaiserver.repositories.foodRepository.Base.foodRepository;
import aholdai.aholdaiserver.services.foodservice.Base.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoodServiceImpl implements FoodService {

    private foodRepository foodRepository;

    @Autowired
    public FoodServiceImpl(foodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    @Override
    public List<Food> getAllFoods() {
       return foodRepository.getAllFoods();
    }

    @Override
    public List<Food> searchByIngredient(String ingredient) {

        return foodRepository.getAllFoods()
        .stream()
                .filter(food -> food.getIngredients()
                        .stream()
                        .anyMatch(str->str.equals(ingredient))
                )
                .collect(Collectors.toList());
    }

    @Override
    public List<Food> getFilteredByIngredient(String ingredient) {
        return foodRepository
                .getAllFoods()
                .stream()
                .filter(food ->
                    !food.getIngredients().contains(ingredient))
                .collect(Collectors.toList());
    }

    @Override
    public List<Food> getSortedByAvailableDate() {
        return foodRepository
                .getAllFoods()
                .stream()
                .sorted(Comparator.comparing(Food::getAvailableDate))
                .collect(Collectors.toList());
    }


}
