import java.util.ArrayList;
import java.util.HashMap;

public class MealTracker {
    private ArrayList<Meal> meals;

    public MealTracker() {
        meals = new ArrayList<>();
    }

    public void addMeal(Meal meal) {
        meals.add(meal);
    }
    public void viewMeals() {
        for (Meal meal : meals) {
            System.out.println(meal.getName());
        }
    }
    public int getMealCount() {
        return meals.size();
    }
    public double getAdherence() {
        return 10.0;
    }
    public boolean isOnTrack() {
        return true;
    }
}