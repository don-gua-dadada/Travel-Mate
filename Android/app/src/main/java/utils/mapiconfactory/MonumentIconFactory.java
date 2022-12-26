package utils.mapiconfactory;

import io.github.project_travel_mate.R;

public class MonumentIconFactory implements IIconFactory {

    @Override
    public int createIcon() {
        return R.drawable.monuments;
    }

    @Override
    public String createMode() {
        return "sights-museums";
    }
}
