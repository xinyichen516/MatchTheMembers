package com.example.xinyichen.matchthemembers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Button button = (Button)findViewById(R.id.startButton);

        //Question 3: find a way for the Button to LISTEN ON the CLICKs. Use Google for guidance.
        //Question 4: every time the button is clicked, create and execute an Intent to go to the
        // OtherClass.

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GameScreen.class);
                startActivity(intent);
            }
        });
    }

}
