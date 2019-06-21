package com.example.lynn.hangman;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

import static com.example.lynn.hangman.MainActivity.*;

public class HangmanView extends View {
    private Paint paint;

    public HangmanView(Context context) {
        super(context);

        setBackgroundColor(0xFF00008F);

        paint = new Paint();

        paint.setColor(0xFFFFFFFF);

        paint.setStyle(Paint.Style.STROKE);

        drawHead = true;
        drawLeftArm = true;
        drawRightArm = true;
        drawBody = true;
        drawLeftLeg = true;
        drawRightLeg = true;
    }

    public void onDraw(Canvas canvas) {
        if (drawHead) {
            canvas.drawCircle(width/6,100,50,paint);
        }
    }

}
