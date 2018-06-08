package com.example.kimby.snspayer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SettingAdapter extends BaseAdapter {

    Context ctxt;
    int layout;
    ArrayList<SettingDTO> list;
    LayoutInflater inf;

    public SettingAdapter(Context ctxt, int layout, ArrayList<SettingDTO> list) {
        this.ctxt = ctxt;
        this.layout = layout;
        this.list = list;
        inf = (LayoutInflater)ctxt.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position){
        return list.get(position);
    }

    @Override
    public long getItemId(int position){
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            convertView = inf.inflate(layout, null);
        }
        TextView textTitle = (TextView)convertView.findViewById(R.id.textTitle);
        ImageView imgView = (ImageView)convertView.findViewById(R.id.imgIcon);

        SettingDTO dto = list.get(position);
        textTitle.setText(dto.getTitle());
        imgView.setImageResource(dto.getImgIcon());

        return convertView;
    }
}
