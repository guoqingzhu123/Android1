package com.example.android.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.android.R;
import com.example.android.entity.Insert;

import java.util.List;

public class Insertadapter extends BaseAdapter {

    private List<Insert> inserts;
    public Insertadapter(List<Insert> inserts){
        this.inserts = inserts;
    }
    @Override
    public int getCount() {
        return inserts.size();
    }

    @Override
    public Insert getItem(int position) {
        return inserts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
            holder = new ViewHolder();

            holder.tvName = convertView.findViewById(R.id.name);
            holder.tvClassroom = convertView.findViewById(R.id.classroom);
            holder.tvAge = convertView.findViewById(R.id.age);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Insert entering = inserts.get(position);
        holder.tvName.setText(entering.getName());
        holder.tvClassroom.setText(String.valueOf(entering.getClassroom()));
        holder.tvAge.setText(String.valueOf(entering.getAge()));

        return convertView;
    }
    static class ViewHolder {
        TextView tvName;
        TextView tvClassroom;
        TextView tvAge;

    }
}
