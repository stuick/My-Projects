package com.stuick.ahmedsidikandroidprojects;

public class Project {

    String name;
    String description;

    // R.drawable.name_of_file (this will be some sort of number, an 'int')
    //e.g. 14121235
    int image;

    public Project(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }
}
