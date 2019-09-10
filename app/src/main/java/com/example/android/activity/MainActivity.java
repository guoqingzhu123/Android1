package com.example.android.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.android.R;

public class MainActivity extends AppCompatActivity {
    private ListView list_view;
    private Button tianjia;
    private Button xiugai;
    private Button shanchu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_view = findViewById(R.id.list_view);
        tianjia = findViewById(R.id.tianjia);
        xiugai = findViewById(R.id.xiugai);
        shanchu = findViewById(R.id.shanchu);

        tianjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,InsertActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"请添加",Toast.LENGTH_LONG).show();
            }
        });

        xiugai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,InsertActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"请修改",Toast.LENGTH_LONG).show();
            }
        });
        shanchu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,InsertActivity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"请删除",Toast.LENGTH_LONG).show();
            }
        });
    }
}
