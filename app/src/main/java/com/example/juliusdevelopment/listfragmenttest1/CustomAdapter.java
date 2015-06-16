package com.example.juliusdevelopment.listfragmenttest1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by JuliusDevelopment on 13/06/2015.
 */
/*
public class CustomAdapter extends ArrayAdapter<Projects> {
    boolean inverse=false;
    CustomAdapter(Context context, Projects[] projects) {

        super(context, R.layout.custom_row,projects);
        //this.projects=projects;
    }
    CustomAdapter(Context context, Projects[] projects,boolean inverse) {

        super(context, R.layout.custom_row,projects);
        //this.projects=projects;
        this.inverse=inverse;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //CODIGO NUEVO
        float orientation=0;
        if (inverse==true){
            orientation=180;
        }
        //*******
        LayoutInflater leInflater=LayoutInflater.from(getContext());
        View customView=leInflater.inflate(R.layout.custom_row,parent,false);

        Projects singleProjectItem=getItem(position);
        TextView leTextView=(TextView)customView.findViewById(R.id.txtId);
        //leTextView.setRotation(180);
        //leTextView.setTextSize(50);
        ImageView leImageView=(ImageView)customView.findViewById(R.id.imgId);
        //leImageView.setRotation(180);
        //leTextView.setText(singleProjectItem.title);
        //leImageView.setRotation(180);
        leTextView.setText(singleProjectItem.title.toString());
        leImageView.setImageResource(singleProjectItem.icon);//leImageView.setImageResource(R.drawable.);
        //CODIGO NUEVO
        leImageView.setRotation(orientation);
        leTextView.setRotation(orientation);
        return customView;
    }

}*/
/*
public class CustomAdapter extends BaseAdapter {
    Context context;
    //Projects rowItem;

    List<Projects> rowItem;

    //Projects[] projects
    CustomAdapter(Context context,List<Projects> rowItem){
        this.context=context;
        this.rowItem=rowItem;
    }

    @Override
    public int getCount() {
        return rowItem.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItem.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
        //return rowItem.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            LayoutInflater mInflater=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView=mInflater.inflate(R.layout.custom_row,null);
        }
        ImageView imgIcon=(ImageView)convertView.findViewById(R.id.imgId);
        TextView txtTitle=(TextView)convertView.findViewById(R.id.txtId);

        Projects row_pos=rowItem.get(position);
        imgIcon.setImageResource(row_pos.icon);
        txtTitle.setText(row_pos.title);

        return convertView;
    }
}*/
public class CustomAdapter extends BaseAdapter {
    Context context;
    //Projects rowItem;

    List<RowItem> rowItem;

    //Projects[] projects
    CustomAdapter(Context context,List<RowItem> rowItem){
        this.context=context;
        this.rowItem=rowItem;
    }

    @Override
    public int getCount() {
        return rowItem.size();
    }

    @Override
    public Object getItem(int position) {
        return rowItem.get(position);
    }

    @Override
    public long getItemId(int position) {

        return rowItem.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView==null){
            LayoutInflater mInflater=(LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView=mInflater.inflate(R.layout.custom_row,null);
        }
        ImageView imgIcon=(ImageView)convertView.findViewById(R.id.imgId);
        TextView txtTitle=(TextView)convertView.findViewById(R.id.txtId);

        RowItem row_pos=rowItem.get(position);
        //Projects row_pos=rowItem.get(position);
        imgIcon.setImageResource(row_pos.getIcon());
        txtTitle.setText(row_pos.getTitle());

        return convertView;
    }
}
