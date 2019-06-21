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


    }

    public void check() {
        switch(numberMissed) {
            case 6 : drawRightLeg = true;
            case 5 : drawLeftLeg = true;
            case 4 : drawBody = true;
            case 3 : drawRightArm = true;
            case 2 : drawLeftArm = true;
            case 1 : drawHead = true;
        }

        invalidate();
    }

    public void reset() {
        drawHead = false;
        drawLeftArm = false;
        drawRightArm = false;
        drawBody = false;
        drawLeftLeg = false;
        drawRightLeg = false;

        numberMissed = 0;

        invalidate();
    }

    public void onDraw(Canvas canvas) {
        if (drawHead) {
            canvas.drawCircle(width/6,100,50,paint);

            canvas.drawLine(width/6,150,width/6,200,paint);
        }

        if (drawLeftArm) {
            canvas.drawLine(width/6,200,width/6 - width/12,300,paint);
        }

        if (drawRightArm) {
            canvas.drawLine(width/6,200,width/6 + width/12,300,paint);
        }

        if (drawBody) {
            canvas.drawLine(width/6,200,width/6,700,paint);
        }

        if (drawLeftLeg) {
            canvas.drawLine(width/6,700,width/6 - width/12,800,paint);
        }

        if (drawRightLeg) {
            canvas.drawLine(width/6,700,width/6 + width/12,800,paint);
        }
    }

}
