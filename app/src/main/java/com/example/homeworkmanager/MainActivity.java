package com.example.homeworkmanager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView taskslist;
    private RecyclerView.Adapter adapter;
    int request_Code = 1;
    ArrayList<Task> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list= initTasks();

        this.taskslist = (RecyclerView) findViewById(R.id.tasks);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this);
        this.taskslist.setLayoutManager(mLayoutManager);

        adapter = new TaskAdapter(list);
        this.taskslist.setAdapter(adapter);
    }
    private ArrayList<Task> initTasks() {

        list.add(new Task("PBB", "Membuat intent dari persona yang dipilih", "januari"));
        list.add(new Task("Proyek 4", "Membuat desain web", "februari"));
        list.add(new Task("PPL", "Membuat desain model GOFOOD", "maret"));

        return list;
    }

    public void onClick(View view){
        startActivityForResult(new Intent("com.example.taskmanager.SecondActivity"), request_Code);
    }

    public void onActivityResult (int requestCode, int resultCode, Intent data){
        if (requestCode == request_Code){
            if(resultCode == RESULT_OK){
                list.add(new Task(data.getStringExtra("nama"), data.getStringExtra("deskripsi"), data.getStringExtra("deadline")));
                adapter = new TaskAdapter(list);
                this.taskslist.setAdapter(adapter);
            }
        }
    }
}

