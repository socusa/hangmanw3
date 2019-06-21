package com.example.lynn.hangman;

import android.content.Context;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;

import static com.example.lynn.hangman.MainActivity.*;

public class AlphabetView extends TableLayout {

    public void reset() {
        for (int counter=0;counter<alphabet.length;counter++)
            alphabet[counter].setVisibility(VISIBLE);
    }

    public AlphabetView(Context context) {
        super(context);

        setBackgroundColor(0xFF008F00);

        alphabet = new Button[26];

        for(int counter=0;counter<alphabet.length;counter++) {
            alphabet[counter] = new Button(context);

            alphabet[counter].setText("" + (char)(counter + 65));

            alphabet[counter].setOnClickListener(listener);
        }

        TableRow row = new TableRow(context);

        for (int counter=0;counter<13;counter++) {
            TableRow.LayoutParams params = new TableRow.LayoutParams(2*width/39,100);

            alphabet[counter].setLayoutParams(params);

            row.addView(alphabet[counter]);
        }

        addView(row);

        row = new TableRow(context);

        for (int counter=13;counter<26;counter++) {
            TableRow.LayoutParams params = new TableRow.LayoutParams(2*width/39,100);

            alphabet[counter].setLayoutParams(params);

            row.addView(alphabet[counter]);
        }

        addView(row);

    }

}
