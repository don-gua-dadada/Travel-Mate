package utils;

import static android.view.View.VISIBLE;

import android.view.View;
import android.widget.LinearLayout;
import com.airbnb.lottie.LottieAnimationView;

import io.github.project_travel_mate.R;

public class NetworkErrorUtils {
    /**
     * Plays the network lost animation in the view
     */
    public void networkError(LottieAnimationView animationView) {
        animationView.setVisibility(View.VISIBLE);
        animationView.setAnimation(R.raw.network_lost);
        animationView.playAnimation();
    }

    public void networkError(LinearLayout layout, LottieAnimationView animationView) {
        layout.setVisibility(View.INVISIBLE);
        animationView.setVisibility(VISIBLE);
        animationView.setAnimation(R.raw.network_lost);
        animationView.playAnimation();
    }

}
