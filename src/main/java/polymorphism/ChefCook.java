package polymorphism;

/**
 * Created by ARTUR on 13.07.2017.
 */
public class ChefCook implements Cook {
    @Override
    public void cooking(String dish) {
        if (dish.contains("fish")) System.out.println(dish + " nice");
    }
}