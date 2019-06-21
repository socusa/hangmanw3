package com.example.lynn.hangman;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.lynn.hangman.MainActivity.*;

public class ButtonsView extends LinearLayout {

    public void setWord() {
        removeAllViews();

        buttons = new Button[word.length()];

        for (int counter=0;counter<buttons.length;counter++) {
            buttons[counter] = new Button(getContext());

            int width = Math.min(100,2*MainActivity.width/(3*buttons.length));

            LayoutParams layoutParams = new LayoutParams(width,100);

            buttons[counter].setLayoutParams(layoutParams);

            addView(buttons[counter]);
        }
    }

    public ButtonsView(Context context) {
        super(context);

        setBackgroundColor(0xFF8F0000);
    }

}
