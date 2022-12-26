package utils.networkerrorcheck;

import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import io.github.project_travel_mate.R;

public class NetworkError implements INetworkError {

    private LottieAnimationView animationView;

    public NetworkError(LottieAnimationView animationView) {
        this.animationView = animationView;
    }
    public void networkError() {
        animationView.setVisibility(View.VISIBLE);
        animationView.setAnimation(R.raw.network_lost);
        animationView.playAnimation();
    }
}
