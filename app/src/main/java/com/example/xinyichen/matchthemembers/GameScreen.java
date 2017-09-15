package com.example.xinyichen.matchthemembers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.CollapsibleActionView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GameScreen extends AppCompatActivity {

    Button buttonAnswer1, buttonAnswer2, buttonAnswer3, buttonAnswer4;
    ImageView memberPic;

    List<ImgNamePairs> pairs;

    Random random;

    int turn = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);

        random = new Random();

        memberPic = (ImageView) findViewById(R.id.memberPic);

        buttonAnswer1 = (Button) findViewById(R.id.choice1);
        buttonAnswer2 = (Button) findViewById(R.id.choice2);
        buttonAnswer3 = (Button) findViewById(R.id.choice3);
        buttonAnswer4 = (Button) findViewById(R.id.choice4);

        pairs = new ArrayList<>();
        ImgNameDatabase imgNameDatabase = new ImgNameDatabase();

        //adding image and name pairs to list
        for (int i = 0; i < imgNameDatabase.cNames.length; i++) {
            pairs.add(new ImgNamePairs(imgNameDatabase.cNames[i], imgNameDatabase.memberImages[i]));
        }

        //randomize the pairing order

        Collections.shuffle(pairs);

        createQuestion(turn);

        //

        buttonAnswer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check correctness of answer, first check wrong then right
                if (!(buttonAnswer1.getText().toString().equalsIgnoreCase(pairs.get(turn - 1).getMemberName()))) {
                    Toast.makeText(GameScreen.this, "Wrong Answer :(", Toast.LENGTH_SHORT).show();

                    if (turn < pairs.size()) {
                        turn ++;
                        createQuestion(turn);
                    } else {
                        Toast.makeText(GameScreen.this, "Congrats! You've Finished!", Toast.LENGTH_SHORT).show();
                    }

                } else {

                    if (turn < pairs.size()) {
                        turn ++;
                        createQuestion(turn);
                    } else {
                        Toast.makeText(GameScreen.this, "Congrats! You've Finished!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        buttonAnswer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check correctness of answer, first check wrong then right
                if (!(buttonAnswer2.getText().toString().equalsIgnoreCase(pairs.get(turn - 1).getMemberName()))) {
                    Toast.makeText(GameScreen.this, "Wrong Answer :(", Toast.LENGTH_SHORT).show();

                    if (turn < pairs.size()) {
                        turn ++;
                        createQuestion(turn);
                    } else {
                        Toast.makeText(GameScreen.this, "Congrats! You've Finished!", Toast.LENGTH_SHORT).show();
                    }

                } else {

                    if (turn < pairs.size()) {
                        turn ++;
                        createQuestion(turn);
                    } else {
                        Toast.makeText(GameScreen.this, "Congrats! You've Finished!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        buttonAnswer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check correctness of answer, first check wrong then right
                if (!(buttonAnswer3.getText().toString().equalsIgnoreCase(pairs.get(turn - 1).getMemberName()))) {
                    Toast.makeText(GameScreen.this, "Wrong Answer :(", Toast.LENGTH_SHORT).show();

                    if (turn < pairs.size()) {
                        turn ++;
                        createQuestion(turn);
                    } else {
                        Toast.makeText(GameScreen.this, "Congrats! You've Finished!", Toast.LENGTH_SHORT).show();
                    }

                } else {

                    if (turn < pairs.size()) {
                        turn ++;
                        createQuestion(turn);
                    } else {
                        Toast.makeText(GameScreen.this, "Congrats! You've Finished!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

        buttonAnswer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //check correctness of answer, first check wrong then right
                if (!(buttonAnswer4.getText().toString().equalsIgnoreCase(pairs.get(turn - 1).getMemberName()))) {
                    Toast.makeText(GameScreen.this, "Wrong Answer :(", Toast.LENGTH_SHORT).show();

                    if (turn < pairs.size()) {
                        turn ++;
                        createQuestion(turn);
                    } else {
                        Toast.makeText(GameScreen.this, "Congrats! You've Finished!", Toast.LENGTH_SHORT).show();
                    }

                } else {

                    if (turn < pairs.size()) {
                        turn ++;
                        createQuestion(turn);
                    } else {
                        Toast.makeText(GameScreen.this, "Congrats! You've Finished!", Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });

    }

    private  void createQuestion(int num) {
        // chooses pic for the question
        memberPic.setImageResource(pairs.get(num - 1).getImg());

        //decides which button contains the correct answer
        int correctAnswer = random.nextInt(4) + 1;

        int firstButton = num - 1;
        int secondButton;
        int thirdButton;
        int fourthButton;

        switch (correctAnswer) {
            case 1:
                buttonAnswer1.setText(pairs.get(firstButton).getMemberName());

                do {
                    secondButton = random.nextInt(pairs.size());
                } while (secondButton == firstButton);

                do {
                    thirdButton = random.nextInt(pairs.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);

                do {
                    fourthButton = random.nextInt(pairs.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                buttonAnswer2.setText(pairs.get(secondButton).getMemberName());
                buttonAnswer3.setText(pairs.get(thirdButton).getMemberName());
                buttonAnswer4.setText(pairs.get(fourthButton).getMemberName());

                break;

            case 2:
                buttonAnswer2.setText(pairs.get(firstButton).getMemberName());

                do {
                    secondButton = random.nextInt(pairs.size());
                } while (secondButton == firstButton);

                do {
                    thirdButton = random.nextInt(pairs.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);

                do {
                    fourthButton = random.nextInt(pairs.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                buttonAnswer1.setText(pairs.get(secondButton).getMemberName());
                buttonAnswer3.setText(pairs.get(thirdButton).getMemberName());
                buttonAnswer4.setText(pairs.get(fourthButton).getMemberName());
                break;

            case 3:
                buttonAnswer3.setText(pairs.get(firstButton).getMemberName());

                do {
                    secondButton = random.nextInt(pairs.size());
                } while (secondButton == firstButton);

                do {
                    thirdButton = random.nextInt(pairs.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);

                do {
                    fourthButton = random.nextInt(pairs.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                buttonAnswer2.setText(pairs.get(secondButton).getMemberName());
                buttonAnswer1.setText(pairs.get(thirdButton).getMemberName());
                buttonAnswer4.setText(pairs.get(fourthButton).getMemberName());

                break;

            case 4:
                buttonAnswer4.setText(pairs.get(firstButton).getMemberName());

                do {
                    secondButton = random.nextInt(pairs.size());
                } while (secondButton == firstButton);

                do {
                    thirdButton = random.nextInt(pairs.size());
                } while (thirdButton == firstButton || thirdButton == secondButton);

                do {
                    fourthButton = random.nextInt(pairs.size());
                } while (fourthButton == firstButton || fourthButton == secondButton || fourthButton == thirdButton);

                buttonAnswer2.setText(pairs.get(secondButton).getMemberName());
                buttonAnswer3.setText(pairs.get(thirdButton).getMemberName());
                buttonAnswer1.setText(pairs.get(fourthButton).getMemberName());

                break;
        }

    }
}
