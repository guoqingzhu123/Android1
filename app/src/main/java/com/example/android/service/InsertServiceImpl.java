package com.example.android.service;

import android.content.Context;

import com.example.android.dao.InsertDAO;
import com.example.android.dao.InsertDAOImpl;
import com.example.android.entity.Insert;

import java.util.List;

public class InsertServiceImpl implements InsertService {
    private InsertDAO insertDAO;

    public InsertServiceImpl(Context context){
        insertDAO =new InsertDAOImpl(context);
    }
    @Override
    public List<Insert> getAllInsert() {
        return insertDAO.selectAllNames();
    }

    @Override
    public void insert(Insert insert) {
        insertDAO.insert(insert);
    }

    @Override
    public void modifyRealNumber(Insert insert) {
        insertDAO.update(insert);
    }

    @Override
    public void delete(String name) {
        insertDAO.delete(name);
    }
}
