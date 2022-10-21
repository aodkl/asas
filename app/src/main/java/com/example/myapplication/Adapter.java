package com.example.myapplication;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.utils.widget.MotionTelltales;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private View inflater;
    private Context context;
    private List<String> list;

    public Adapter(Context context, List<String> list) {
        this.context = context;
        this.list=list;
    }
    @Override
    public Holder onCreateViewHolder(ViewGroup viewGroup, int i) {
        inflater= LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        Holder holder;
        holder=new Holder(inflater);
        return holder;
    }
    @Override
    public void onBindViewHolder(Holder myholder, int j) {
        //reviewer.textView1.setText(list.get(position));
        //Fragment_config = list.get(position);
        //Myholder.textView.setText(news.title);
        Holder.textView.setText(list.get(j));

        Holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Activity2.class);
                //intent.putExtra("name", "xiao");
                context.startActivity(intent);
                //Toast.makeText(context,"你正在和"+news.title+"聊天",Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class Holder extends RecyclerView.ViewHolder{
       private static LinearLayout linearLayout;
       private static TextView textView;
       public Holder(@NonNull View itemView) {
            super(itemView);
            linearLayout=itemView.findViewById(R.id.linearLayout_itme);
           textView=itemView.findViewById(R.id.textView_item);

       }

    }
}