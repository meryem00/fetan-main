package com.gebeya.fetan.framework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.gebeya.fetan.R;
import com.gebeya.fetan.framework.base.BaseActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends BaseActivity {

    private FloatingActionButton fab;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        fab = findViewById(R.id.floatingActionButton);
        fab.setOnClickListener(view -> {
            final Intent intent = new Intent(getApplicationContext(), AddRunActivity.class);
            startActivity(intent);
        });
    }
}
