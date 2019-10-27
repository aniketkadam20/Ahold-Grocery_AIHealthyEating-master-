package aholdai.aholdaiserver.models;

import java.util.Date;
import java.util.List;

public class Food {

    private String foodName;

    private int FDC_ID;

    private String brand;

    //GTIN_UPC

    public Food(List<String> ingredients, Date availableDate) {
        this.ingredients = ingredients;
        this.availableDate = availableDate;
    }

    public Food(List<String> ingredients, Date availableDate,String foodName) {
        this.ingredients = ingredients;
        this.availableDate = availableDate;
        this.foodName=foodName;
    }

    private List<String> ingredients;

    private short servingSize;

    private Date modifiedDate;

    private Date availableDate;

    public Food(int FDC_ID, String brand, short servingSize, Date modifiedDate, Date availableDate) {
        this.FDC_ID = FDC_ID;
        this.brand = brand;
        this.servingSize = servingSize;
        this.modifiedDate = modifiedDate;
        this.availableDate = availableDate;
    }

    public Food(int FDC_ID, String brand) {
        this.FDC_ID = FDC_ID;
        this.brand = brand;
    }

    public Food(int FDC_ID) {
        this.FDC_ID = FDC_ID;
    }

    public int getFDC_ID() {
        return FDC_ID;
    }

    public void setFDC_ID(int FDC_ID) {
        this.FDC_ID = FDC_ID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public short getServingSize() {
        return servingSize;
    }

    public void setServingSize(short servingSize) {
        this.servingSize = servingSize;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Date getAvailableDate() {
        return availableDate;
    }

    public void setAvailableDate(Date availableDate) {
        this.availableDate = availableDate;
    }


    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
