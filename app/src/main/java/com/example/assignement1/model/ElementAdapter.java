package com.example.assignement1.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.assignement1.R;

import java.util.List;

public class ElementAdapter extends RecyclerView.Adapter<ElementAdapter.ElementViewHolder> {
    private static List<Element> elements;
    private int[] buttonsIds;

    public ElementAdapter(List<Element> elements, int[] buttonIds) {
        this.elements = elements;
        this.buttonsIds=buttonIds;
    }


    @NonNull
    @Override
    public ElementViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_element, viewGroup, false);
        return new ElementViewHolder(view, buttonsIds);
    }

    @Override
    public void onBindViewHolder(@NonNull ElementAdapter.ElementViewHolder elementViewHolder, int i) {
        Element element = elements.get(i);
        Button button=elementViewHolder.button;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(), "Button clicked for element: " + element.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return elements.size();
    }
    public static class ElementViewHolder extends RecyclerView.ViewHolder {
        Button button;
        public ElementViewHolder(View itemView,int [] buttonIds) {
            super(itemView);
            button=itemView.findViewById(generateButtonId(getAdapterPosition(),buttonIds,elements,itemView));

        }
        private static int generateButtonId(int position, int[] buttonIds,List<Element> elements,View itemView) {
            String elementName = elements.get(position).getName();
            String buttonIdName = "txt_" + elementName.replace(" ", "_");
            return itemView.getResources().getIdentifier(buttonIdName, "id", itemView.getContext().getPackageName());
        }
    }
}
