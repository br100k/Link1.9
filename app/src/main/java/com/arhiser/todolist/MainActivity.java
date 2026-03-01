package com.arhiser.todolist;

import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    
    private RecyclerView recyclerView;
    private VictimAdapter adapter;
    private List<Victim> victimList = new ArrayList<>();
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        
        // Тут будемо завантажувати дані з сервера
        loadVictims();
        
        adapter = new VictimAdapter(victimList);
        recyclerView.setAdapter(adapter);
        
        Button addButton = findViewById(R.id.addButton);
        addButton.setOnClickListener(v -> {
            // Тут будемо додавати жертву вручну
        });
    }
    
    private void loadVictims() {
        // TODO: Підключення до сервера
        // https://bermuda-triangle.onrender.com/api/victims
        
        victimList.add(new Victim("+380671234567", "Жертва 1", 3));
        victimList.add(new Victim("+380501234567", "Жертва 2", 5));
    }
}
