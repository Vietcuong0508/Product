package com.example.productapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> listContact = new ArrayList<>();
    List<Product> listProduct = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //B1: Data source
//        initData();
//        //B2: Adapter
//        ContactAdapter adapter = new ContactAdapter(this, listContact);
//        //B3: Layout Manager
////        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
//        //B4: RecyclerView
//        RecyclerView rvContact1 = findViewById(R.id.rvContact);
//        rvContact1.setLayoutManager(layoutManager);
//        rvContact1.setAdapter(adapter);

        //B1: Data source
        initDataProduct();
        //B2: Adapter
        ProductAdapter adapter = new ProductAdapter(this, listProduct);
        //B3: Layout Manager
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        //B4: RecyclerView
        RecyclerView rvContact1 = findViewById(R.id.rvContact);
        rvContact1.setLayoutManager(layoutManager);
        rvContact1.setAdapter(adapter);
    }

    private void initDataProduct() {
        listProduct.add(new Product("Nguyen Van A", "0987654321", 33F, R.drawable.user1));
        listProduct.add(new Product("Nguyen Van B", "0987654321", 33F, R.drawable.user2));
        listProduct.add(new Product("Nguyen Van C", "0987654321", 33F, R.drawable.user3));
    }

    private void initData() {
        listContact.add(new Contact("Nguyen Van A", "0987654321", R.drawable.user1));
        listContact.add(new Contact("Nguyen Van B", "0987654321", R.drawable.user2));
        listContact.add(new Contact("Nguyen Van C", "0987654321", R.drawable.user3));
        listContact.add(new Contact("Nguyen Van D", "0987654321", R.drawable.user1));
        listContact.add(new Contact("Nguyen Van E", "0987654321", R.drawable.user4));
        listContact.add(new Contact("Nguyen Van F", "0987654321", R.drawable.user1));
        listContact.add(new Contact("Nguyen Van G", "0987654321", R.drawable.user2));
        listContact.add(new Contact("Nguyen Van H", "0987654321", R.drawable.user1));
        listContact.add(new Contact("Nguyen Van I", "0987654321", R.drawable.user3));
        listContact.add(new Contact("Nguyen Van K", "0987654321", R.drawable.user1));
        listContact.add(new Contact("Nguyen Van A", "0987654321", R.drawable.user4));
        listContact.add(new Contact("Nguyen Van A", "0987654321", R.drawable.user1));
    }
}