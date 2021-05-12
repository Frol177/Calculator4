package com.example.calculator4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ThemStorage storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        storage = new ThemStorage(this);
        setTheme(storage.getTheme().getResurse());
        setContentView(R.layout.activity_main);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(v.getId()==R.id.btnthem1) {
                storage.setTheme(Theme.OPTION1);
            } else if (v.getId()==R.id.btnthem2){
                storage.setTheme(Theme.OPTION2);
            }
                recreate();
            }

        };
        findViewById(R.id.btnthem1).setOnClickListener(clickListener);
        findViewById(R.id.btnthem2).setOnClickListener(clickListener);

    }
}