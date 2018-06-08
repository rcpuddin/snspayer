package com.example.kimby.snspayer;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SetListAdapter extends RecyclerView.Adapter<SetListAdapter.SetViewHolder> {

    private ArrayList<SettingDTO> list;

    public SetListAdapter(ArrayList<SettingDTO> list) {
        this.list = list;
    }


    @NonNull
    @Override
    public SetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_setting, parent, false);
        return new SetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SetViewHolder holder, int position) {
        SettingDTO item = list.get(position);
        holder.bindData(item);
        return;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class SetViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;

        public SetViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgIcon);
            textView = itemView.findViewById(R.id.textTitle);
        }

        public void bindData(SettingDTO item) {
            imageView.setImageResource(item.getImgIcon());
            textView.setText(item.getTitle());
        }
    }
}
