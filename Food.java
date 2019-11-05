import java.util.ArrayList;

public class Food {
    private String name;
    private ArrayList<Category> categories;
    private double calories;
    private double fat;
    private double protein;
    private double carbohydrates;

    public Food() {
        categories = new ArrayList<>();
    }

    public Food(String name, double calories, double fat, double protein, double carbs) {
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.protein = protein;
        this.carbohydrates = carbs;
        categories = new ArrayList<>();
    }

    public double getCalories() {
        return calories;
    }
    public double getFat() {
        return fat;
    }
    public double getCarbohydrates() {
        return carbohydrates;
    }
    public double getProtein() {
        return protein;
    }
    public double getName() {
        return name;
    }
    public ArrayList<Category> getCategories() {
        return categories;
    }
    public void addCategory(Category category) {
        categories.add(category);
    }
}