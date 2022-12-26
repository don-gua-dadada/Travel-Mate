package utils.mapiconfactory;

public class IconCreate {

//    private IIconFactory iconFactory;
//
//    public IconCreate(IIconFactory iconFactory) {
//        this.iconFactory = iconFactory;
//    }
    private Icon icon = null;

    public Icon setIcon(String type) {

//        Icon icon = null;

        if (type.equals("restaurant")) {
            icon = new RestaurantIcon();
        } else if (type.equals("hangout")) {
            icon = new HangoutIcon();
        } else if (type.equals("monument")) {
            icon = new MonumentIcon();
        } else if (type.equals("shopping")) {
            icon = new ShoppingIcon();
        }

        return icon;
    }

    public String getmMode() {
        return icon.mMode;
    }

    public int getmIcon() {
        return icon.mIcon;
    }
}
