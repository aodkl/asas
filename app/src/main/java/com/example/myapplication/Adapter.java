package com.example.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class Adapter extends RecyclerView.Adapter<Adapter.Myholder> {
    private View inflater;
    private Context context;
    private List<String> list;
    public Adapter(Context context, List<String> list) {
        this.context = context;
        this.list=list;
    }
    @Override
    public Myholder onCreateViewHolder(ViewGroup viewGroup, int i) {
        inflater= LayoutInflater.from(context).inflate(R.layout.item,viewGroup,false);
        Myholder holder;
        holder=new Myholder(inflater);
        return holder;
    }
    @Override
    public void onBindViewHolder(Myholder holder, int j) {
        holder.textView.setText(list.get(j));
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
    public class Myholder extends RecyclerView.ViewHolder{
        private TextView textView;
        public Myholder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView2);
        }
    }
}