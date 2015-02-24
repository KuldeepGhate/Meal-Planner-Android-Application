package com.example.kuldeep.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prajakta on 2/23/15.
 */
public class drawerItemGenerator {

    private List<ObjectDrawerItem> myDrawer;

    protected List<ObjectDrawerItem> drawerItemGenerator() {
        myDrawer = new ArrayList<>();
        myDrawer.add(new ObjectDrawerItem(R.mipmap.ic_planner, "Planner"));
        myDrawer.add(new ObjectDrawerItem(R.mipmap.ic_recipe, "Recipes"));
        myDrawer.add(new ObjectDrawerItem(R.mipmap.ic_grocery, "Grocery"));
        myDrawer.add(new ObjectDrawerItem(R.mipmap.ic_group, "Groups"));
        myDrawer.add(new ObjectDrawerItem(R.mipmap.ic_logout, "Logout"));
        return myDrawer;
    }

}
