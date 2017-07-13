package polymorphism;

/**
 * Created by ARTUR on 13.07.2017.
 */
public class DefaultCook implements Cook {
    @Override
    public void cooking(String dish) {
        if (dish.contains("salad")) System.out.println(dish + " nice");
    }
}
