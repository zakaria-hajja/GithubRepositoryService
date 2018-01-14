package com.zakaria.github.ui.activity;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zakaria.github.R;
import com.zakaria.github.ui.fragment.RepositoryFragment;

public class RepositoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repository);

        if(savedInstanceState == null){
            final FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment, RepositoryFragment.newInstance());
            ft.commit();

        }
    }
}
