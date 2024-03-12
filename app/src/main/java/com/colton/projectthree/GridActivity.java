package com.colton.projectthree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.colton.projectthree.inventory.Item;
import com.colton.projectthree.inventory.ItemAdapter;

public class GridActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        Item[] itemsInStock = new Item[4];
        itemsInStock[0] = new Item("Generic Item");
        itemsInStock[1] = new Item("Food Item");
        itemsInStock[2] = new Item("Computer Item");
        itemsInStock[3] = new Item("Office Item");

        GridView gridView = (GridView)findViewById(R.id.gridView);
        ItemAdapter itemAdapter = new ItemAdapter(this, itemsInStock);
        gridView.setAdapter(itemAdapter);
    }
}