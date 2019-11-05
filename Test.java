import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        HashMap<String, MealTracker> mealTracker = new HashMap<>();
        
        User user1 = new User("Raju", "Chamarasinghe", "raju@gmail.com", 50, 90.0);
        users.add(user1);

        MealTracker newMealTracker = new MealTracker();

        ArrayList<Food> breakfastFoods = new ArrayList<>();
        ArrayList<Food> lunchFoods = new ArrayList<>();
        ArrayList<Food> dinnerFoods = new ArrayList<>();

        Food egg = new Food("Egg", 50, 12, 20, 1.2);
        egg.addCategory(Category.Protein);
        Food toast = new Food("Toast", 80, 10, 2, 40);
        toast.addCategory(Category.Fat);

        breakfastFoods.add(egg);
        breakfastFoods.add(toast);

        Food rice = new Food("Rice", 50, 12, 20, 1.2);
        egg.addCategory(Category.Protein);
        Food veggiesMix = new Food("VeggiesMix", 80, 10, 2, 40);
        toast.addCategory(Category.Fat);

        lunchFoods.add(rice);
        lunchFoods.add(veggiesMix);

        Food salad = new Food("Salad", 50, 12, 20, 1.2);
        egg.addCategory(Category.Protein);
        Food chicken = new Food("Chicken", 80, 10, 2, 40);
        toast.addCategory(Category.Fat);

        dinnerFoods.add(salad);
        dinnerFoods.add(chicken);

        Meal morning = new Meal("breakfast", new Date(), breakfastFoods);
        Meal lunch = new Meal("lunch", new Date(), lunchFoods);
        Meal dinner = new Meal("dinner", new Date(), dinnerFoods);

        newMealTracker.addMeal(morning);
        newMealTracker.addMeal(lunch);
        newMealTracker.addMeal(dinner);

        mealTracker.put(user1.getFirstName() + user1.getLastName(), newMealTracker);

        MealTracker user = mealTracker.get("RajuChamarasinghe");
        user.viewMeals();
        System.out.println(user.getMealCount());
    }
}