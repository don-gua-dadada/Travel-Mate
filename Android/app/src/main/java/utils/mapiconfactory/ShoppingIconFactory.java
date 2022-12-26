package utils.mapiconfactory;

import io.github.project_travel_mate.R;

public class ShoppingIconFactory implements IIconFactory {

    @Override
    public int createIcon() {
        return R.drawable.shopping_icon;
    }

    @Override
    public String createMode() {
        return "shopping";
    }
}
