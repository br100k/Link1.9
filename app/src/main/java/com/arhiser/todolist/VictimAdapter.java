package com.arhiser.todolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class VictimAdapter extends RecyclerView.Adapter<VictimAdapter.ViewHolder> {
    
    private List<Victim> victims;

    public VictimAdapter(List<Victim> victims) {
        this.victims = victims;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Victim victim = victims.get(position);
        holder.text1.setText(victim.getName());
        holder.text2.setText(victim.getPhone() + " · SMS: " + victim.getSmsCount());
    }

    @Override
    public int getItemCount() {
        return victims.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView text1, text2;

        public ViewHolder(View view) {
            super(view);
            text1 = view.findViewById(android.R.id.text1);
            text2 = view.findViewById(android.R.id.text2);
        }
    }
}
