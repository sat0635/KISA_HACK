package com.study.gst.kisa_hack;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class FormAdapter  extends RecyclerView.Adapter<FormAdapter.ViewHolder> {
    private ArrayList<Form> items = new ArrayList<>();

    @NonNull
    @Override
    public FormAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_form, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FormAdapter.ViewHolder viewHolder, int position) {

        Form item = items.get(position);

        Glide.with(viewHolder.itemView.getContext())
                .load(item.getUrl())
                .into(viewHolder.ivPicture);

        viewHolder.tvTitle.setText(item.getTitle());
        viewHolder.tvContent.setText(item.getContent());
        viewHolder.tvGenre.setText(item.getPlace());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void setItems(ArrayList<Form> items) {
        this.items = items;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView ivPicture;
        TextView tvTitle, tvContent, tvGenre;

        ViewHolder(View itemView) {
            super(itemView);

            ivPicture = itemView.findViewById(R.id.iv_item_picture);

            tvTitle = itemView.findViewById(R.id.tv_item_picture_title);
            tvContent = itemView.findViewById(R.id.tv_item_picture_content);
            tvGenre = itemView.findViewById(R.id.tv_item_picture_genre);
        }
    }
}
