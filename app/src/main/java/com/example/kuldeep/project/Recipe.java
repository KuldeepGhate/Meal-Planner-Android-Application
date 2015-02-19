package com.example.kuldeep.project;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Recipe extends ActionBarActivity {

    private List<ExpandListChild> recipes = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        populateRecipeList();
        populateListView();
    }

    private void populateRecipeList(){
        recipes.add(new ExpandListChild(R.drawable.sbdp,"SPDP","this is SPDP"));
        recipes.add(new ExpandListChild(R.drawable.chole,"Chole","these are Chole by Koley"));
        recipes.add(new ExpandListChild(R.drawable.dhokla,"Dhokla","this is Dhokla"));
        recipes.add(new ExpandListChild(R.drawable.idli,"IDLI","this is Idli"));
        recipes.add(new ExpandListChild(R.drawable.idli,"IDLI","this is Idli"));
        recipes.add(new ExpandListChild(R.drawable.idli,"IDLI","this is Idli"));
        recipes.add(new ExpandListChild(R.drawable.idli,"IDLI","this is Idli"));
        recipes.add(new ExpandListChild(R.drawable.idli,"IDLI","this is Idli"));
        recipes.add(new ExpandListChild(R.drawable.idli,"IDLI","this is Idli"));
        recipes.add(new ExpandListChild(R.drawable.idli,"IDLI","this is Idli"));

    }

    public void populateListView(){
        ArrayAdapter<ExpandListChild> adapter = new MyListAdapter();
        ListView list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
    }

    private class MyListAdapter extends ArrayAdapter<ExpandListChild> {
        public MyListAdapter(){
            super(Recipe.this,R.layout.activity_recipe,recipes);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View itemView = convertView;

            if(itemView == null){
                itemView = getLayoutInflater().inflate(R.layout.expandlist_child_item,parent,false);
            }

            /**
             * Find the view to work with*/

            ExpandListChild currItem = recipes.get(position);

            //fill the view
            ImageView imgView = (ImageView) itemView.findViewById(R.id.food_image);
            imgView.setImageResource(currItem.getIcon());

            TextView txtName = (TextView) itemView.findViewById(R.id.name);
            txtName.setText(currItem.getName());

            TextView txtDescription = (TextView) itemView.findViewById(R.id.description);
            txtName.setText(currItem.getDescription());

            return itemView;
         }
    }

}
