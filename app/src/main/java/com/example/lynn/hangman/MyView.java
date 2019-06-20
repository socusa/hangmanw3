package com.example.lynn.hangman;

import android.content.Context;
import android.graphics.Point;
import android.widget.RelativeLayout;

import static com.example.lynn.hangman.MainActivity.*;

public class MyView extends RelativeLayout {

    public MyView(Context context) {
        super(context);

        Point sizeOfScreen = Util.sizeOfScreen(context);

        width = sizeOfScreen.x;
        height = sizeOfScreen.y;

        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(2*width/3,3*height/4);

        buttonsView = new ButtonsView(context);

        buttonsView.setId(generateViewId());

        buttonsView.setLayoutParams(params);

        addView(buttonsView);

        params = new RelativeLayout.LayoutParams(2*width/3,height/4);

        params.addRule(BELOW,buttonsView.getId());

        alphabetView = new AlphabetView(context);

        alphabetView.setId(generateViewId());

        alphabetView.setLayoutParams(params);

        addView(alphabetView);

        params = new RelativeLayout.LayoutParams(width/3,height);

        params.addRule(RIGHT_OF,buttonsView.getId());
        params.addRule(RIGHT_OF,alphabetView.getId());

        hangmanView = new HangmanView(context);

        hangmanView.setId(generateViewId());

        hangmanView.setLayoutParams(params);

        addView(hangmanView);


    }

}
