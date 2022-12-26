package utils.networkerrorcheck;

import android.view.View;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.LinearLayout;
import io.github.project_travel_mate.R;

public class NetworkErrorCityDetail implements INetworkError {

    private LottieAnimationView animationView;
    private LinearLayout layout;
    private TextView showCityName;

    public NetworkErrorCityDetail(LottieAnimationView animationView,
                                  LinearLayout layout,
                                  TextView showCityName) {
        this.animationView = animationView;
        this.layout = layout;
        this.showCityName = showCityName;
    }

    public void networkError() {
        showCityName.setVisibility(View.GONE);
        animationView.setVisibility(View.VISIBLE);
        layout.setVisibility(View.GONE);
        animationView.setAnimation(R.raw.network_lost);
        animationView.playAnimation();
    }
}
