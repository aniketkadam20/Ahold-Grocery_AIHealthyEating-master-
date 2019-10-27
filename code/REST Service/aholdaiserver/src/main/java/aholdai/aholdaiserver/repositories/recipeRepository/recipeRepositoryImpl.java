package aholdai.aholdaiserver.repositories.recipeRepository;

import aholdai.aholdaiserver.models.Food;
import aholdai.aholdaiserver.models.Recipe;
import aholdai.aholdaiserver.repositories.recipeRepository.Base.recipeRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.util.List;


//@Repository
public class recipeRepositoryImpl implements recipeRepository {


    @Override
    public List<Recipe> getAllRecipes() {
        List<Recipe> recipes = null;

        return recipes;
    }
}
