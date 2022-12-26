package utils.mapiconfactory;

import io.github.project_travel_mate.R;

public class HangoutIconFactory implements IIconFactory {

    @Override
    public int createIcon() {
        return R.drawable.hangout;
    }

    @Override
    public String createMode() {
        return "going-out,leisure-outdoor";
    }
}
