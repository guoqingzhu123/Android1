package com.example.android.service;

import com.example.android.entity.Insert;

import java.util.List;

public interface InsertService {
    public List<Insert> getAllInsert();
    public void insert(Insert insert);
    public void modifyRealNumber(Insert insert);
    public void delete(String name);
}
