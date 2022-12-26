package utils.mapiconfactory;

public class MonumentIcon extends Icon {

    private MonumentIconFactory monument = new MonumentIconFactory();

    @Override
    public void setIcon() {
        mMode = monument.createMode();
        mIcon = monument.createIcon();
    }

}
