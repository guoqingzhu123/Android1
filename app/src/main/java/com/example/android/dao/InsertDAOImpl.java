package com.example.android.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.android.entity.Insert;
import com.example.android.utils.MyDBHelper;

import java.util.ArrayList;
import java.util.List;

public class InsertDAOImpl implements InsertDAO {
    private MyDBHelper helper;
    private SQLiteDatabase db;

    public InsertDAOImpl(Context context){
        helper=new MyDBHelper(context);
    }

    @Override
    public List<Insert> selectAllNames() {
        String sql = "select * from entering";
        List<Insert> inserts = null;

        // 1. 获取SQLiteDatabase对象
        db = helper.getReadableDatabase();

        // 2. 执行SQL查询
        Cursor cursor = db.rawQuery(sql, null);

        // 3. 处理结果
        if (cursor != null && cursor.getCount() > 0) {
            inserts = new ArrayList<>();
            while (cursor.moveToNext()) {
                Insert insert = new Insert();
                insert.setId(cursor.getInt(cursor.getColumnIndex("id")));
                insert.setName(cursor.getString(cursor.getColumnIndex("name")));
                insert.setClassroom(cursor.getString(cursor.getColumnIndex("classroom")));
                insert.setAge(cursor.getInt(cursor.getColumnIndex("age")));

                inserts.add(insert);
            }
            // 4. 关闭cursor
            cursor.close();
        }
        db.close();
        // 5. 返回结果
        return inserts;
    }

    @Override
    public Insert select(String Name) {
        String sql = "select * from entering where name=?";
        Insert insert = null;

        // 1. 获取SQLiteDatabase对象
        db = helper.getReadableDatabase();

        // 2. 执行SQL查询
        Cursor cursor = db.rawQuery(sql, new String[]{Name});

        // 3. 处理结果
        if (cursor != null && cursor.getCount() > 0) {
            if (cursor.moveToNext()) {
                insert = new Insert();
                insert.setId(cursor.getInt(cursor.getColumnIndex("id")));
                insert.setName(cursor.getString(cursor.getColumnIndex("name")));
                insert.setClassroom(cursor.getString(cursor.getColumnIndex("classroom")));
                insert.setAge(cursor.getInt(cursor.getColumnIndex("age")));
            }
            // 4. 关闭cursor
            cursor.close();
        }
        db.close();
        // 5. 返回结果
        return insert;
    }

    @Override
    public List<Insert> selectByCost(int cost) {
        String sql = "select * from entering where number > occupied";
        List<Insert> inserts = null;

        // 1. 获取SQLiteDatabase对象
        db = helper.getReadableDatabase();

        // 2. 执行SQL查询
        Cursor cursor = db.rawQuery(sql, null);

        // 3. 处理结果
        if (cursor != null && cursor.getCount() > 0) {
            inserts = new ArrayList<>();
            while (cursor.moveToNext()) {
                Insert insert = new Insert();
                insert.setId(cursor.getInt(cursor.getColumnIndex("id")));
                insert.setName(cursor.getString(cursor.getColumnIndex("name")));
                insert.setClassroom(cursor.getString(cursor.getColumnIndex("classroom")));
                insert.setAge(cursor.getInt(cursor.getColumnIndex("age")));

                inserts.add(insert);
            }
            // 4. 关闭cursor
            cursor.close();
        }
        db.close();
        // 5. 返回结果
        return inserts;
    }


    @Override
    public void insert(Insert insert) {
        db = helper.getWritableDatabase();
        String sql = "insert into entering values(null,?,?,?)";
        db.execSQL(sql, new Object[]{
                insert.getName(),
                insert.getClassroom(),
               insert.getAge()});
        db.close();
    }

    @Override
    public void update(Insert insert) {
        // 1. 获取db对象
        db = helper.getWritableDatabase();
        // 2. 执行sql
        String sql = "update entering set number=? where name=?";
        db.execSQL(sql, new Object[]{
                insert.getName(),
                insert.getClassroom()
        });
    }

    @Override
    public void delete(String name) {
        // 1. 获取db对象
        db = helper.getWritableDatabase();
        // 2. 执行sql
        String sql = "delete from entering where name=?";
        db.execSQL(sql, new Object[]{ name });
    }
}
