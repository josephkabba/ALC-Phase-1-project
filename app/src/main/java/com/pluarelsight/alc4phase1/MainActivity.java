package com.pluarelsight.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aboutAlc;
    Button myProfile;
    Toolbar mainToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //reference initialization
        aboutAlc= findViewById(R.id.about_alc);
        myProfile=findViewById(R.id.my_profile);
        mainToolBar=findViewById(R.id.toolbar_main);
        setSupportActionBar(mainToolBar);

        //Button implementation
        aboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity(AboutALC.class);
                aboutAlc.setBackgroundResource(R.drawable.button_styler);
                onPause();
            }
        });
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextActivity(MyProfile.class);
                myProfile.setBackgroundResource(R.drawable.button_styler);
                onPause();
            }
        });
    }

    //proceeds to next activity
    private void nextActivity(Class next){
        startActivity(new Intent(getApplicationContext(),next));
    }
}
