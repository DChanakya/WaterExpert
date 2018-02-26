package com.example.apbc.waterexpert.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.example.apbc.waterexpert.DataTransfer;
import com.example.apbc.waterexpert.Models.CauseListModel;
import com.example.apbc.waterexpert.Models.ListModel;
import com.example.apbc.waterexpert.Problem3KnowMore;
import com.example.apbc.waterexpert.R;

import java.util.List;


/**
 * Created by chanakya on 26/5/17.
 */

public class CustomCauseListAdapter extends BaseAdapter {



 TextView name;
 Button knowMore;
 Context context;
 List<CauseListModel> list;

    public CustomCauseListAdapter(Context context, List<CauseListModel> list) {
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

        listItem = inflater.inflate(R.layout.causelistitem,null);

        name = (TextView) listItem.findViewById(R.id.problem3_causeName);
        knowMore = (Button) listItem.findViewById(R.id.problem3_causeButton);
        name.setText( list.get(position).getName());
        final String selectedOption = list.get(position).getSelectePosition();


        knowMore.setOnClickListener(new View.OnClickListener() {
            public void onClick(View viewsd) {
                DataTransfer.option=selectedOption;
                Intent i = new Intent(context, Problem3KnowMore.class);
                context.startActivity(i);
            }
        });




        return listItem;

    }

}
