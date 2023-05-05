package com.example.assignement1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.assignement1.model.Element;
import com.example.assignement1.model.ElementFactory;
import com.example.assignement1.model.IElement;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ElementFactory factory = new ElementFactory();
    IElement obj = factory.getModel();
    List<Element> elements = obj.getAllElements();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (Element element : elements) {
            String elementId = "txt_" + element.getSymbol().toLowerCase();
            int resId = getResources().getIdentifier(elementId, "id", getPackageName());
            Button button = findViewById(resId);
            if (button != null) {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String symbol = element.getSymbol();
                        String name = element.getName();
                        int atomicNumber = element.getAtomicNum();
                        double atomicMass = element.getAtomicMass();
                        String group = element.getChemicalGroup();
                        String message = "Name: " + name + "\n" +
                                "Symbol: " + symbol + "\n" +
                                "Atomic Number: " + atomicNumber + "\n" +
                                "Atomic Mass: " + atomicMass + "\n" +
                                "Chemical Group: " + group;
                        // Show the element information
                        Toast.makeText(MainActivity.this, message,Toast.LENGTH_LONG).show();

                    }
                });
            }
        }

    }
}
