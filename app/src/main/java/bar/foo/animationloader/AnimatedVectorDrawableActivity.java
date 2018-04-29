package bar.foo.animationloader;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by bastien on 29/04/2018.
 */

public class AnimatedVectorDrawableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animated_vector_drawable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Animatable drawable = (Animatable) ((ImageView) findViewById(R.id.animation)).getDrawable();
        drawable.start();
    }
}
