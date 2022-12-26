package utils.networkerrorcheck;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.LinearLayout;
import io.github.project_travel_mate.R;

public class NetworkErrorLinearLayout implements INetworkError {

    private LottieAnimationView animationView;
    private LinearLayout layout;

    public NetworkErrorLinearLayout(LottieAnimationView animationView, LinearLayout layout) {
        this.animationView = animationView;
        this.layout = layout;
    }

    public void networkError() {
        layout.setVisibility(View.INVISIBLE);
        animationView.setVisibility(View.VISIBLE);
        animationView.setAnimation(R.raw.network_lost);
        animationView.playAnimation();
    }

}
