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

            int widthOfButton = Math.min(100,(2*width)/(3*buttons.length));

            LayoutParams params = new LayoutParams(widthOfButton,100);

            buttons[counter].setLayoutParams(params);

            addView(buttons[counter]);
        }
    }

    public ButtonsView(Context context) {
        super(context);

        setBackgroundColor(0xFF8F0000);
    }

}
