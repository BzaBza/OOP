package polymorphism;

/**
 * Created by ARTUR on 13.07.2017.
 */
public class Me implements MakeMeal {
    private String friedEggs;
    @Override
    public String cooking(String dish) {
        friedEggs = dish;
        if (friedEggs == "Burned down")
            System.out.println();;
        return null;
    }
}

