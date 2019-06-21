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

            hangmanView.reset();

            alphabetView.reset();

            start.setText("Restart");
        } else if (numberMissed < 6) {
            char letter = source.getText().charAt(0);

            boolean found = false;

            for (int counter=0;counter<buttons.length;counter++) {
                if (letter == word.charAt(counter)) {
                    buttons[counter].setText("" + letter);

                    found = true;
                }
            }

            source.setVisibility(View.INVISIBLE);

            if (!found) {
                numberMissed++;

                hangmanView.check();
            }

            if (numberMissed == 6)
                buttonsView.showCharacters();

        }

    }

}
