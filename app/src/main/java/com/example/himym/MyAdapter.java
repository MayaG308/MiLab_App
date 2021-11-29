package com.example.himym;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<ModelClass> phraseslist;

    public MyAdapter (List<ModelClass> phraseslist){
        this.phraseslist= phraseslist;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {
        int imageRes= phraseslist.get(position).getImageView1();
        String name= phraseslist.get(position).getTextView1();
        String end= phraseslist.get(position).getDivider();
        holder.setData(imageRes, name, end);

    }

    @Override
    public int getItemCount() {
        return phraseslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;
        private TextView textView;
        private TextView divider;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView= itemView.findViewById(R.id.imageview1);
            textView= itemView.findViewById(R.id.textview);
            divider= itemView.findViewById(R.id.textview2);

        }

        public void setData(int imageRes, String name, String end) {
            imageView.setImageResource(imageRes);
            textView.setText(name);
            divider.setText(end);
        }
    }
}
