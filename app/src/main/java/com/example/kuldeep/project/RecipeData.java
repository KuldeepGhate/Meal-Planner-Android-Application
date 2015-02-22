package com.example.kuldeep.project;

/**
 * Created by prajakta on 2/22/15.
 */
public class RecipeData {


    private String title;
    private int imageUrl;

    public RecipeData(String title, int imageUrl) {

        this.title = title;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public int getImageUrl() {
        return imageUrl;
    }
    // getters & setters
}


