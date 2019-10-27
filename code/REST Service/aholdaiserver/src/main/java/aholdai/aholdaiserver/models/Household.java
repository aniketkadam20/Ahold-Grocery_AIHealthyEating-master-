package aholdai.aholdaiserver.models;

public class Household {

    private String household_name;

    private int household_id;

    private String food;

    private boolean food_staple;

    private short staple_min;

    private String staple_unit;

    private byte meals_per_day;


    public Household(String household_name, String food, byte meals_per_day) {
        this.household_name = household_name;
        this.food = food;
        this.meals_per_day = meals_per_day;
    }



    public Household(String household_name, int household_id, String food, byte meals_per_day) {
        this.household_name = household_name;
        this.household_id = household_id;
        this.food = food;
        this.meals_per_day = meals_per_day;
    }



    public Household() {
    }

    public String getHousehold_name() {
        return household_name;
    }

    public void setHousehold_name(String household_name) {
        this.household_name = household_name;
    }

    public int getHousehold_id() {
        return household_id;
    }

    public void setHousehold_id(int household_id) {
        this.household_id = household_id;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public byte getMeals_per_day() {
        return meals_per_day;
    }

    public void setMeals_per_day(byte meals_per_day) {
        this.meals_per_day = meals_per_day;
    }


    public boolean isFood_staple() {
        return food_staple;
    }

    public void setFood_staple(boolean food_staple) {
        this.food_staple = food_staple;
    }

    public String getStaple_unit() {
        return staple_unit;
    }

    public void setStaple_unit(String staple_unit) {
        this.staple_unit = staple_unit;
    }

    public short getStaple_min() {
        return staple_min;
    }

    public void setStaple_min(short staple_min) {
        this.staple_min = staple_min;
    }
}
