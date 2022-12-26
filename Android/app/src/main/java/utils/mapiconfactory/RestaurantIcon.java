package utils.mapiconfactory;

public class RestaurantIcon extends Icon {

    private RestaurantIconFactory restaurant = new RestaurantIconFactory();

    @Override
    public void setIcon() {
        mMode = restaurant.createMode();
        mIcon = restaurant.createIcon();
    }
}
