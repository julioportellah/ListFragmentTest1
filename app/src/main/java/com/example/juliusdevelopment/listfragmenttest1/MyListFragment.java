package com.example.juliusdevelopment.listfragmenttest1;

import android.app.ListFragment;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JuliusDevelopment on 13/06/2015.
 */
public class MyListFragment extends ListFragment implements OnItemClickListener {
    CustomAdapter adapter;
    private List<Projects>projectItems;
    String[] menuTitles;
    TypedArray menuIcons;
    private List<RowItem> rowItems;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //View contactLayout=inflater.inflate(R.layout.list_fragment,container,false);
        //ListView lv=(ListView)contactLayout.findViewById(android.R.id.list);


        //return lv;
        return inflater.inflate(R.layout.list_fragment,null,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        menuTitles=getResources().getStringArray(R.array.picture_titles);
        menuIcons=getResources().obtainTypedArray(R.array.icons);
        rowItems=new ArrayList<RowItem>();
        for (int i=0;i<menuTitles.length;i++){
            RowItem items=new RowItem(menuTitles[i],menuIcons.getResourceId(i,-1));
            rowItems.add(items);
        }
        adapter=new CustomAdapter(getActivity(),rowItems);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
        /*
        projectItems=new ArrayList<Projects>();
        projectItems.add(new Projects ("Hexacóptero",R.drawable.hexacoptero_icono));
        Projects projects[]=new Projects[]{
                new Projects("Hexacóptero",R.drawable.hexacoptero_icono),
                new Projects("Hexápodo",R.drawable.hexapodo_icono)
        };
        adapter=new CustomAdapter(getActivity(),projectItems);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);
        */
        /*
        Projects projects[]=new Projects[]{
                new Projects(R.drawable.hexacoptero_icono,"Hexacóptero"),
                new Projects(R.drawable.hexapodo_icono,"Hexápodo"),
                new Projects(R.drawable.electronica_icono,"Electrónica"),
                new Projects(R.drawable.redes_icono,"Redes")
        };
        * */

        /*
        adapter=new CustomAdapter(getActivity(),projects);
        setListAdapter(adapter);
        getListView().setOnClickListener((View.OnClickListener) this);
        //getListView().setOnClickListener(this);
        */

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        /*TextView text=(TextView)view.findViewById(R.id.txtId);
        String lsTxt=text.getText().toString().trim();
        Toast.makeText(getActivity(),lsTxt,Toast.LENGTH_LONG).show();*/
        Toast.makeText(getActivity(),menuTitles[position],Toast.LENGTH_LONG).show();
        /*
        TextView text=(TextView)view.findViewById(R.id.txtId);
        String lsTxt=text.getText().toString().trim();
        Toast.makeText(getActivity(),lsTxt,Toast.LENGTH_LONG).show();*/
    }

    //public void onItemClick()


}
