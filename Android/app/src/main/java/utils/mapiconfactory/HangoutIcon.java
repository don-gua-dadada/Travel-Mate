package utils.mapiconfactory;

public class HangoutIcon extends Icon {

    private HangoutIconFactory hangout = new HangoutIconFactory();

    @Override
    public void setIcon() {
        mMode = hangout.createMode();
        mIcon = hangout.createIcon();
    }
}
