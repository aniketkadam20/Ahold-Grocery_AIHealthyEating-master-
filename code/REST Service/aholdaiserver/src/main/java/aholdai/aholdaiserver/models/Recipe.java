package aholdai.aholdaiserver.models;

import aholdai.aholdaiserver.models.enums.RecipeCategory;

import java.util.List;

public class Recipe {
    private String recipeTitle;

    private List<Food> ingredients;

    private RecipeCategory category;

    public String getRecipeTitle() {
        return recipeTitle;
    }

    public void setRecipeTitle(String recipeTitle) {
        this.recipeTitle = recipeTitle;
    }

    public List<Food> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Food> ingredients) {
        this.ingredients = ingredients;
    }

    public RecipeCategory getCategory() {
        return category;
    }

    public void setCategory(RecipeCategory category) {
        this.category = category;
    }

    public short getFat() {
        return fat;
    }

    public void setFat(short fat) {
        this.fat = fat;
    }

    public short getSodium() {
        return sodium;
    }

    public void setSodium(short sodium) {
        this.sodium = sodium;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public short getProtein() {
        return protein;
    }

    public void setProtein(short protein) {
        this.protein = protein;
    }

    private short fat;

    private short sodium;

    private int calories;

    private short protein;

    //Directions_001??

    public Recipe(String recipeTitle, List<Food> ingredients, RecipeCategory category,int calories) {
        this.recipeTitle = recipeTitle;
        this.ingredients = ingredients;
        this.category = category;
        this.calories=calories;
    }
}
