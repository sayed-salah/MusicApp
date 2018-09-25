package com.example.sayedsalah.musicapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Sayed Salah on 9/23/2017.
 */
public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.MyViewHolder> {
    private Context mContext = null;
    private ArrayList<Item_class> myList = null;

    public MyCustomAdapter(Context mcontext, ArrayList<Item_class> arrayList) {
        this.mContext = mcontext;
        this.myList = arrayList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.item, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Item_class item = myList.get(position);
        holder.myImage1.setImageResource(item.getImage1());
        holder.myText.setText(item.getSong_name());
        holder.myimage2.setImageResource(item.getImage2());

        holder.myText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "Playing Music", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView myImage1, myimage2;
        TextView myText;

        public MyViewHolder(View itemView) {
            super(itemView);
            myImage1 = (ImageView) itemView.findViewById(R.id.songImage);
            myText = (TextView) itemView.findViewById(R.id.songtv);
            myimage2 = (ImageView) itemView.findViewById(R.id.detailimage);
        }
    }
}
