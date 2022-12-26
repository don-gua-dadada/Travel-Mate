package utils.networkerrorcheck;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import android.support.v4.widget.SwipeRefreshLayout;
import android.widget.RelativeLayout;
import io.github.project_travel_mate.R;

public class NetworkErrorSwipeRefresh implements INetworkError {

    private LottieAnimationView animationView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private RelativeLayout my_trips_main_layout;

    public NetworkErrorSwipeRefresh(LottieAnimationView animationView,
                                    SwipeRefreshLayout swipeRefreshLayout,
                                    RelativeLayout my_trips_main_layout) {
        this.animationView = animationView;
        this.swipeRefreshLayout = swipeRefreshLayout;
        this.my_trips_main_layout = my_trips_main_layout;
    }

    public void networkError() {
        animationView.setAnimation(R.raw.network_lost);
        animationView.setVisibility(View.VISIBLE);
        swipeRefreshLayout.setRefreshing(false);
        my_trips_main_layout.setVisibility(View.GONE);
        animationView.playAnimation();
    }
}
