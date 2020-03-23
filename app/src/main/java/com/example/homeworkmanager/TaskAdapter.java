package com.example.homeworkmanager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TaskAdapter extends RecyclerView.Adapter <TaskAdapter.ViewHolder> {

    private ArrayList<Task> tasks;

    public TaskAdapter(ArrayList<Task> tasks){
        this.tasks = tasks;

    }


    @NonNull

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listitem, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Task task = tasks.get(position);

        holder.namaMatkul.setText(task.getNamaMatkul());
        holder.deskripsiTugas.setText(task.getDeskripsiTugas());

    }

    @Override
    public int getItemCount() {
        if (tasks != null) {
            return tasks.size();
        } else {
            return 0;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final View view;
        public final TextView namaMatkul;
        public final TextView deskripsiTugas;

        public ViewHolder(View view) {
            super(view);
            this.view = view;
            namaMatkul = view.findViewById(R.id.namaMatkul);
            deskripsiTugas = view.findViewById(R.id.deskripsiTugas);
        }
    }

}
