package com.b.recyclerviewconcept2_main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    myadapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Recycler and Card View Demo Practice");

        rcv = (RecyclerView)findViewById(R.id.recview);
        //rcv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new myadapter(dataqueue());
        rcv.setAdapter(adapter);

        /* ................. This line only for to show horizontal layout ......this is for space free  ...................*/
         LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
         rcv.setLayoutManager(layoutManager);


    }
    /*.....Take Array list to take input.......*/
    public ArrayList<Model> dataqueue() {

        ArrayList<Model> holder = new ArrayList<>();


        Model ob1 = new Model();
        ob1.setHeader("C Programming");
        ob1.setDesc("This is C programming");
        ob1.setImgname(R.drawable.cc);
        holder.add(ob1);

        Model ob2 = new Model();
        ob2.setHeader("JAVa Programming");
        ob2.setDesc("This is JAVA programming");
        ob2.setImgname(R.drawable.java);
        holder.add(ob2);

        Model ob3 = new Model();
        ob3.setHeader("python Programming");
        ob3.setDesc("This is python programming");
        ob3.setImgname(R.drawable.pyhton);
        holder.add(ob3);

        Model ob4 = new Model();
        ob4.setHeader("html Programming");
        ob4.setDesc("This is html programming");
        ob4.setImgname(R.drawable.html);
        holder.add(ob4);

        Model ob5 = new Model();
        ob5.setHeader("css Programming");
        ob5.setDesc("This is css programming");
        ob5.setImgname(R.drawable.css);
        holder.add(ob5);

        Model ob6 = new Model();
        ob6.setHeader("JAVASCRIPT Programming");
        ob6.setDesc("This is JAVASCRIPT programming");
        ob6.setImgname(R.drawable.javascript);
        holder.add(ob6);

        Model ob7 = new Model();
        ob7.setHeader("sql Programming");
        ob7.setDesc("This is sql programming");
        ob7.setImgname(R.drawable.sql);
        holder.add(ob7);

return holder;
    }
}