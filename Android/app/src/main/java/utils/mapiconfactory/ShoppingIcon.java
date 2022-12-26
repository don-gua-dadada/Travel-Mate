package utils.mapiconfactory;

public class ShoppingIcon extends Icon {

    private ShoppingIconFactory shopping = new ShoppingIconFactory();

    @Override
    public void setIcon() {
        mMode = shopping.createMode();
        mIcon = shopping.createIcon();
    }

}
