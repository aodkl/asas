package com.example.myapplication;import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class Fragment_friend extends Fragment {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private List<String> list;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view;
        view=inflater.inflate(R.layout.fragment_friend,container,false);
        recyclerView=view.findViewById(R.id.recyclerView);
        List<String> list=new ArrayList<>();
        for (int i=0;i<9;i++){
            list.add("this is No."+i+" demo...");
        }
        Context context=getContext();
        Adapter adapter=new Adapter(context,list);
        LinearLayoutManager layoutManager=new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return view;
    }
}