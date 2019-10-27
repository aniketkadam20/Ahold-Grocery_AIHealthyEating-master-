package aholdai.aholdaiserver.models;

import aholdai.aholdaiserver.models.enums.ProfileType;

import java.util.List;

public class AholdUser {

    private String firstName;

    private String middleName;

    private String lastName;

    private String userName;

    private int userID;

    private short mobileNumber;

    private String brand;

    private String store;

    private String storeID;

    private String emailID;

    private String password;

    private List<Food> foodPreference;

    private List<Recipe> recipePreference;

    private List<Food> healthRequirements;

    private List<Recipe> dietRequirements;

    private ProfileType profileType;

    public AholdUser(String middleName, String userName, short mobileNumber, String emailID, String password, String firstName, String lastName) {
        this.middleName = middleName;
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.emailID = emailID;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AholdUser(String middleName, String userName, String firstName, String lastName, short mobileNumber, String store, String emailID, String password) {
        this.middleName = middleName;
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.store = store;
        this.emailID = emailID;
        this.password = password;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public AholdUser (String email, String password) {
        this.emailID = email;
        this.password = password;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public short getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(short mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public List<Recipe> getRecipePreference() {
        return recipePreference;
    }

    public void setRecipePreference(List<Recipe> recipePreference) {
        this.recipePreference = recipePreference;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public ProfileType getProfileType() {
        return profileType;
    }

    public void setProfileType(ProfileType profileType) {
        this.profileType = profileType;
    }

    public String getEmail() {
        return emailID;
    }

    public String getPassword() {
        return password;
    }


    public List<Food> getfoodPreferences() {
        return foodPreference;
    }

    public void setfoodPreferences(List<Food> favouriteFoods) {
        this.foodPreference = favouriteFoods;
    }


    public List<Food> getHealthRequirements() {
        return healthRequirements;
    }

    public void setHealthRequirements(List<Food> healthRequirements) {
        this.healthRequirements = healthRequirements;
    }

    public List<Recipe> getDietRequirements() {
        return dietRequirements;
    }

    public void setDietRequirements(List<Recipe> dietRequirements) {
        this.dietRequirements = dietRequirements;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }
}
