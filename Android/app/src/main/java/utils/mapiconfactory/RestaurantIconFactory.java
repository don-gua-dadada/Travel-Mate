package utils.mapiconfactory;

import io.github.project_travel_mate.R;

public class RestaurantIconFactory implements IIconFactory {

    @Override
    public int createIcon() {
        return R.drawable.restaurant;
    }

    @Override
    public String createMode() {
        return "eat-drink";
    }
}
