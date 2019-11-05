import java.util.ArrayList;
import java.util.Date;

public class Meal {
    private String name; 
    private Date mealTime;
    private ArrayList<Food> foods;

    public Meal() {
        foods = new ArrayList<>();
    }

    public Meal(String name, Date mealTime, ArrayList<Food> foods) {
        foods = new ArrayList<>();
        this.name = name;
        this.mealTime = mealTime;
        this.foods = foods;
    }

    public double getCalories() {
        double calories = 0;
        for (Food food : foods) {
            calories += food.getCalories();
        }

        return calories;
    }
    public double getFat() {
        double fat = 0;
        for (Food food : foods) {
            fat += food.getFat();
        }

        return fat;
    }
    public double getCarbohydrates() {
        double carbohydrates = 0;
        for (Food food : foods) {
            carbohydrates += food.getCarbohydrates();
        }

        return carbohydrates;
    }
    public double getProtein() {
        double protein = 0;
        for (Food food : foods) {
            protein += food.getProtein();
        }

        return protein;
    }
    public String getName() {
        return name;
    }
    public Date getMealTime() {
        return mealTime;
    }
    public void viewFoods() {
        for (Food food : foods) {
            System.out.println(food.getName());
        }
    }
}