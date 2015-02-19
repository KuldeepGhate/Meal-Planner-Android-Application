package com.example.kuldeep.project;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;

import java.util.ArrayList;


public class FrontPage extends ActionBarActivity implements AdapterView.OnItemClickListener{

    private DrawerLayout drawerLayout;
    private ListView listview;
    private ExpandListAdapter ExpAdapter;
    private ArrayList<ExpandListGroup> ExpListItems;
    private ExpandableListView ExpandList;
    private String[] side_menu;
    private android.support.v4.app.ActionBarDrawerToggle drawerListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front_page);

        ExpandList = (ExpandableListView) findViewById(R.id.ExpList);
        ExpListItems = SetStandardGroups();
        ExpAdapter = new ExpandListAdapter(FrontPage.this, ExpListItems);
        ExpandList.setAdapter(ExpAdapter);
        side_menu = getResources().getStringArray(R.array.side_menu);
        listview = (ListView) findViewById(R.id.drawerList);
        listview.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,side_menu));
        listview.setOnItemClickListener(this);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawerListener = new android.support.v4.app.ActionBarDrawerToggle(this, drawerLayout, R.drawable.navigation, R.string.drawer_open, R.string.drawer_close){
            @Override
            public void onDrawerOpened (View drawerView){
                super.onDrawerOpened(drawerView);
                // Toast.makeText(getApplicationContext(), "Drawer Opened", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onDrawerClosed (View drawerView){
                super.onDrawerClosed(drawerView);
                //Toast.makeText(getApplicationContext(),"Drawer Closed",Toast.LENGTH_SHORT).show();
            }
        };
        drawerLayout.setDrawerListener(drawerListener);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        drawerListener.syncState();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(drawerListener.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public ArrayList<ExpandListGroup> SetStandardGroups(){
        ArrayList<ExpandListGroup> list = new ArrayList<ExpandListGroup>();
        ArrayList<ExpandListChild> list2 = new ArrayList<ExpandListChild>();
        ArrayList<ExpandListChild> list3 = new ArrayList<ExpandListChild>();
        ArrayList<ExpandListChild> list4 = new ArrayList<ExpandListChild>();
        ArrayList<ExpandListChild> list5 = new ArrayList<ExpandListChild>();
        ArrayList<ExpandListChild> list6 = new ArrayList<ExpandListChild>();
        ArrayList<ExpandListChild> list7 = new ArrayList<ExpandListChild>();
        ArrayList<ExpandListChild> list8 = new ArrayList<ExpandListChild>();

        // Group1 ,contains food item "PAVBHAJi " & "DOsa"
        ExpandListGroup gru1 = new ExpandListGroup();
        gru1.setName("Monday");
        ExpandListChild ch1_1 = new ExpandListChild();
        ch1_1.setName("Pav Bhaji");
        ch1_1.setIcon(R.drawable.pb);
        ch1_1.setDescription("This is pav bhaji");
        ch1_1.setTag(null);
        list2.add(ch1_1);

        ExpandListChild ch1_2 = new ExpandListChild();
        ch1_2.setName("Dosa");
        ch1_2.setIcon(R.drawable.dsa);
        ch1_2.setDescription("This is Dosa");
        ch1_2.setTag(null);
        list2.add(ch1_2);
        gru1.setItems(list2);

        ExpandListGroup gru2 = new ExpandListGroup();
        gru2.setName("Tuesday");
        ExpandListChild ch2_1 = new ExpandListChild();
        ch2_1.setName("Idly");
        ch2_1.setIcon(R.drawable.idli);
        ch2_1.setDescription("This is Idly");
        ch2_1.setTag(null);
        list3.add(ch2_1);

        ExpandListChild ch2_2 = new ExpandListChild();
        ch2_2.setName("Kachhi Dabeli");
        ch2_2.setIcon(R.drawable.vipul);
        ch2_2.setDescription("This is Kachhi Dabeli");
        ch2_2.setTag(null);
        list3.add(ch2_2);
        gru2.setItems(list3);

        ExpandListGroup gru3 = new ExpandListGroup();
        gru3.setName("Wednesday");
        ExpandListChild ch3_2 = new ExpandListChild();
        ch3_2.setName("Pani Puru");
        ch3_2.setIcon(R.drawable.pp);
        ch3_2.setDescription("This is Pani Puri");
        ch3_2.setTag(null);
        list4.add(ch3_2);
        gru3.setItems(list4);

        ExpandListGroup gru4 = new ExpandListGroup();
        gru4.setName("Thursday");
        ExpandListChild ch4_1 = new ExpandListChild();
        ch4_1.setName("SEV BATATA DAHI PURI ");
        ch4_1.setIcon(R.drawable.pp);
        ch4_1.setDescription("This is SBDP");
        ch4_1.setTag(null);
        list5.add(ch4_1);
        gru4.setItems(list5);



        ExpandListGroup gru5 = new ExpandListGroup();
        gru5.setName("Friday");
        ExpandListChild ch5_1 = new ExpandListChild();
        ch5_1.setName("Chole ");
        ch5_1.setIcon(R.drawable.chole);
        ch5_1.setDescription("");
        ch5_1.setTag(null);
        list6.add(ch5_1);
        gru5.setItems(list6);


        ExpandListGroup gru6 = new ExpandListGroup();
        gru6.setName("Saturday ");
        ExpandListChild ch6_1 = new ExpandListChild();
        ch6_1.setName("Dhokla ");
        ch6_1.setIcon(R.drawable.dkla);
        ch6_1.setDescription("");
        ch6_1.setTag(null);
        list7.add(ch6_1);
        gru6.setItems(list7);

        /*ExpandListGroup gru7 = new ExpandListGroup();
        gru6.setName("Sunday ");
        ExpandListChild ch7_1 = new ExpandListChild();
        ch6_1.setName("Dhokla ");
        ch6_1.setIcon(R.drawable.dhokla);
        ch6_1.setDescription("");
        ch6_1.setTag(null);
        list8.add(ch6_1);
        gru7.setItems(list8);*/

        list.add(gru1);
        list.add(gru2);
        list.add(gru3);
        list.add(gru4);
        list.add(gru5);
        list.add(gru6);
        //list.add(gru7);

        return list;

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //   Toast.makeText(this,side_menu[position] + " was selected",Toast.LENGTH_SHORT).show();
        selectItem(position);
    }
    public void selectItem(int position) {
        listview.setItemChecked(position,true);
        getSupportActionBar().setTitle(side_menu[position]);

        Intent intent;
        switch (position){
            case 1:
                intent = new Intent(FrontPage.this,Recipe.class);
                startActivity(intent);
                break;
        }
    }
}
