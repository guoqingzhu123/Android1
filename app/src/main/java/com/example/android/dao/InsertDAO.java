package com.example.android.dao;

import com.example.android.entity.Insert;

import java.util.List;

public interface InsertDAO {
    List<Insert> selectAllNames();
    Insert select(String Name);

    List<Insert> selectByCost(int cost);
    void insert(Insert insert);
    void update(Insert insert);
    void delete(String name);
}
