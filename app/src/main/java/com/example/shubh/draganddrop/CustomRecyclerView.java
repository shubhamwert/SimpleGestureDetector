package com.example.shubh.draganddrop;

import android.support.annotation.NonNull;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextClock;
import android.widget.TextView;

import java.util.List;
import java.util.zip.Inflater;

public class CustomRecyclerView extends RecyclerView.Adapter<CustomRecyclerView.ViewHolder>{
private List<String> mData;
    class ViewHolder extends RecyclerView.ViewHolder{
       public View layout;
       public TextView mtextView;
        public ViewHolder(View v){
            super(v);
            layout=v;
            v.setElevation(1f);
            v.setPadding(11,11,11,11);
            mtextView=v.findViewById(R.id.recycler_views);


        }



    }
    public CustomRecyclerView(List<String> s){
        mData=s;



    }


    @NonNull
    @Override
    public CustomRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View v = inflater.inflate(R.layout.recyler_view_layout, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void registerAdapterDataObserver(@NonNull RecyclerView.AdapterDataObserver observer) {
        super.registerAdapterDataObserver(observer);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomRecyclerView.ViewHolder viewHolder, int i) {

            String k=mData.get(i);
            viewHolder.mtextView.setText(" "+i+ " ");
            viewHolder.mtextView.append(k);

    }
public void notifyDataSetChanged(List<String> s){
        mData=s;


}
    @Override
    public int getItemCount() {
        return mData.size();
    }
}
