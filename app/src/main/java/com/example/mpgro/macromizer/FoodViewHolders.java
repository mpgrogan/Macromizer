package com.example.mpgro.macromizer;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FoodViewHolders  extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView foodName;
    public ImageView foodPhoto;

    public FoodViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        foodName = (TextView) itemView.findViewById(R.id.food_name);
        foodPhoto = (ImageView) itemView.findViewById(R.id.food_photo);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Clicked Position = " + getPosition(), Toast.LENGTH_SHORT).show();
    }
}
