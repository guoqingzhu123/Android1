package com.example.android.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.R;
import com.example.android.adapter.Insertadapter;
import com.example.android.entity.Insert;
import com.example.android.service.InsertService;

import java.util.List;

public class InsertActivity extends AppCompatActivity implements View.OnClickListener {
    private static final int ADD_REQUEST = 100;
    private static final int MODIFY_REQUEST = 101;
    private Button fix, cancel;

    private TextView name;
    private TextView classroom;
    private TextView age;
    private Insertadapter insertadapter;

    private List<Insert> inserts;
    private InsertService insertService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);
        initView();
    }

    private void initView() {
        name = findViewById(R.id.name);
        classroom = findViewById(R.id.classroom);
        age = findViewById(R.id.age);
        fix = findViewById(R.id.fix);
        cancel = findViewById(R.id.cancel);

        fix.setOnClickListener(this);
        cancel.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.fix:
                updateInsert();
                break;
            case R.id.cancel:
                finish();

        }
    }

    private void updateInsert() {
    }
}