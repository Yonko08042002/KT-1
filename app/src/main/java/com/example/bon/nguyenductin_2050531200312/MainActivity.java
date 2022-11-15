package com.example.bon.nguyenductin_2050531200312;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ArrayList<Casi> arrayList;
    private CasiAdapter adtCS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_item);
        arrayList = new ArrayList<>();
        arrayList.add(new Casi(R.drawable.ic_user, R.drawable.ic_sao,"Nguyên Thanh Tung", "MTP","Việt Nam" ));
        arrayList.add(new Casi(R.drawable.ic_user, R.drawable.ic_sao,"Nguyên Thanh Tung", "MTP","Việt Nam" ));
        arrayList.add(new Casi(R.drawable.ic_user, R.drawable.ic_sao,"Nguyên Thanh Tung", "MTP","Việt Nam" ));
        arrayList.add(new Casi(R.drawable.ic_user, R.drawable.ic_sao,"Nguyên Thanh Tung", "MTP","Việt Nam" ));
        arrayList.add(new Casi(R.drawable.ic_user, R.drawable.ic_sao,"Nguyên Thanh Tung", "MTP","Việt Nam" ));
        arrayList.add(new Casi(R.drawable.ic_user, R.drawable.ic_sao,"Nguyên Thanh Tung", "MTP","Việt Nam" ));
        arrayList.add(new Casi(R.drawable.ic_user, R.drawable.ic_sao,"Nguyên Thanh Tung", "MTP","Việt Nam" ));

        adtCS = new CasiAdapter(MainActivity.this, R.layout.item_main, arrayList);
        listView.setAdapter(adtCS);
    }


}