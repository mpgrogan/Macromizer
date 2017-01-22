package com.example.mpgro.macromizer;

import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class FoodViewAdapter extends RecyclerView.Adapter<FoodViewHolders> {

    private List<ItemObjects> itemList;
    private Context context;

    public FoodViewAdapter(Context context, List<ItemObjects> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public FoodViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_list, null);
        FoodViewHolders rcv = new FoodViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(FoodViewHolders holder, int position) {
        holder.foodName.setText(itemList.get(position).getName());
        holder.foodPhoto.setImageResource(itemList.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
}
