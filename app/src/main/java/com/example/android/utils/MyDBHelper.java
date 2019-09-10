package com.example.android.utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.entity.Insert;

public class MyDBHelper extends SQLiteOpenHelper {
    public MyDBHelper( Context context) {
        super(context, "dorm.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Insert.TBL_Insert);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists insert");
        onCreate(db);
    }
}
