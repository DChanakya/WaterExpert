package com.example.apbc.waterexpert.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.apbc.waterexpert.Models.ListModel;
import com.example.apbc.waterexpert.R;

import java.util.List;


/**
 * Created by chanakya on 26/5/17.
 */

public class CustomListAdapter extends BaseAdapter {


 TextView value,range,remark;
 TextView name;
 Context context;
 List<ListModel> list;

    public CustomListAdapter(Context context, List<ListModel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItem;
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        listItem = inflater.inflate(R.layout.listitem,null);

        name = (TextView) listItem.findViewById(R.id.problem3_name);
        value = (TextView) listItem.findViewById(R.id.problem3_value);
        range = (TextView) listItem.findViewById(R.id.problem3_range);
        remark = (TextView) listItem.findViewById(R.id.problem3_remark);


        name.setText( list.get(position).getName());
        value.setText(list.get(position).getValue());
        range.setText(list.get(position).getRange());
        remark.setText(list.get(position).getRemark());

        return listItem;

    }
}
