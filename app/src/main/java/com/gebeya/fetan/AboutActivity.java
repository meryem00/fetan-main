package com.gebeya.fetan;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.gebeya.fetan.framework.base.BaseActivity;

import java.util.Random;

import butterknife.OnClick;

public class AboutActivity extends BaseActivity {

   ImageView logo;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

    }
    @OnClick(R.id.aboutLogoIon)
    public void rotate(){
        Random rand = new Random();
        int factor = rand.nextInt(10);
        int direction = rand.nextInt(2);

        float degree = 360 * factor;
        degree = degree * (degree == 0 ? 1 : -1);
        ObjectAnimator animator =
                ObjectAnimator.ofFloat(
                        logo, "rotation", 0f, 360f
                );
        animator.setDuration(2000);
        animator.start();
    }
}
