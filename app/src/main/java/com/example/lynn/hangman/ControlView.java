package com.example.lynn.hangman;

import android.content.Context;
import android.widget.Button;
import android.widget.LinearLayout;

import static com.example.lynn.hangman.MainActivity.*;

public class ControlView extends LinearLayout {

    public ControlView(Context context) {
        super(context);

        setBackgroundColor(0xFF008F8F);

        start = new Button(context);

        start.setText("Start");

        start.setOnClickListener(listener);

        addView(start);
    }

}
