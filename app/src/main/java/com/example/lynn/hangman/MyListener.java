package com.example.lynn.hangman;

import android.view.View;
import android.widget.Button;

import static com.example.lynn.hangman.MainActivity.*;

public class MyListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Button source = (Button)view;

        if (source == start) {
            word = getWord().toUpperCase();

            buttonsView.setWord();


            start.setText("Restart");
        } else {

        }

    }

}
