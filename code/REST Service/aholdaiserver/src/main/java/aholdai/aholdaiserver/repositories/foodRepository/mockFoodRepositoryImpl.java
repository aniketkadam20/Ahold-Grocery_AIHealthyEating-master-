package aholdai.aholdaiserver.repositories.foodRepository;

import aholdai.aholdaiserver.models.Food;
import aholdai.aholdaiserver.repositories.foodRepository.Base.foodRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Repository
public class mockFoodRepositoryImpl implements foodRepository {

    static Date date1 = new Date(1571827529);
    static Date date2 = new Date(1571827529);
    static Date date3 = new Date(1571827529);
    static List<String> ingr1 = Arrays.asList("cooked chickpeas", "tahini", "garlic", "salt", "citric acid");
    static List<String> ingr2 = Arrays.asList("eggs", "wheat", "milk", "soy");
    static List<String> ingr3 = Arrays.asList("dfgdsfg", "sdfgsdfg", "sdfgsed", "ggg");
    static Food hummus = new Food(ingr1, date1);
    static Food cookies = new Food(ingr2, date2);

    static Food briocheBuns = new Food(ingr3, date3);
    static List<Food> mockFoodRepo = Arrays.asList(hummus, cookies, briocheBuns);



    @Override
    public List<Food> getAllFoods() {
        return mockFoodRepositoryImpl.mockFoodRepo;
    }
}
