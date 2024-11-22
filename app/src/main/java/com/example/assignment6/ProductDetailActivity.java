package com.example.assignment6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ProductDetailActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String price = intent.getStringExtra("price");
        int imageResId = intent.getIntExtra("image", 0);

        // Find views
        TextView tvName = findViewById(R.id.tv_detail_name);
        TextView tvPrice = findViewById(R.id.tv_detail_price);
        ImageView imageView = findViewById(R.id.iv_detail_image);
        ImageButton btnBack = findViewById(R.id.back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Set data
        tvName.setText(name);
        tvPrice.setText(price);
        imageView.setImageResource(imageResId);
    }
}