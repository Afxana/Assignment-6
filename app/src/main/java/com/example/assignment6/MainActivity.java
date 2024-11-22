package com.example.assignment6;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);


        List<DataModel> dataList = new ArrayList<>();
        dataList.add(new DataModel("Cappuccino", "$10", R.drawable.cappuccino));
        dataList.add(new DataModel("Espresso", "$20", R.drawable.espresso));
        dataList.add(new DataModel("Americano", "$15", R.drawable.americano));
        dataList.add(new DataModel("Latte", "$25", R.drawable.latte));
        dataList.add(new DataModel("Mocha", "$12", R.drawable.mocha));

        // Adapter
        MyAdapter adapter = new MyAdapter(this, dataList);

        // RecyclerView setup
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}