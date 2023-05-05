package com.example.assignement1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Matrix;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    private ImageView periodicTable;
    private Matrix matrix = new Matrix();
    private float[] matrixValues = new float[9];
    private float downX, downY;
    private float lastTranslateX, lastTranslateY;
    private float scaleFactor = 1.0f;
    private static final float MIN_SCALE_FACTOR = 1.0f;
    private static final float MAX_SCALE_FACTOR = 4.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        periodicTable = findViewById(R.id.periodicTable);
        periodicTable.setOnTouchListener(this);
        periodicTable.setScaleType(ImageView.ScaleType.MATRIX);



    }
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        float x = event.getX();
        float y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                downX = x;
                downY = y;
                lastTranslateX = 0f;
                lastTranslateY = 0f;
                break;
            case MotionEvent.ACTION_MOVE:
                float dx = x - downX;
                float dy = y - downY;
                matrix.getValues(matrixValues);
                float translatedX = matrixValues[Matrix.MTRANS_X] + dx - lastTranslateX;
                float translatedY = matrixValues[Matrix.MTRANS_Y] + dy - lastTranslateY;
                matrix.setTranslate(translatedX, translatedY);
                periodicTable.setImageMatrix(matrix);
                lastTranslateX = dx;
                lastTranslateY = dy;
                break;
            case MotionEvent.ACTION_UP:
                break;
        }
        return true;
    }
}
