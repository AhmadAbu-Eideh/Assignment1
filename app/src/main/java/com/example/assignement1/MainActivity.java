package com.example.assignement1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Button;

import com.example.assignement1.model.Element;
import com.example.assignement1.model.ElementAdapter;
import com.example.assignement1.model.ElementFactory;
import com.example.assignement1.model.IElement;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences preferences;
    private ElementFactory factory;
    private IElement obj;
    private List<Element> elements;
    private ElementAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        factory = new ElementFactory();
        obj = factory.getModel();
        elements = obj.getAllElements(preferences);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 19));
        adapter = new ElementAdapter(elements, getButtonIds());
        recyclerView.setAdapter(adapter);

    }
    private int[] getButtonIds() {
        int[] buttonIds = new int[elements.size()];
        for (int i = 0; i < elements.size(); i++) {
            String elementId = "txt_" + elements.get(i).getSymbol().toLowerCase();
            int resId = getResources().getIdentifier(elementId, "id", getPackageName());
            buttonIds[i] = resId;
        }
        return buttonIds;
    }
}

