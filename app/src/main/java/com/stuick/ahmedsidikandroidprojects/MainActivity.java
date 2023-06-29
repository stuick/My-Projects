package com.stuick.ahmedsidikandroidprojects;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);

        Project[] projects = {
                new Project("Getting Started App", "First project, 'Hello World'", R.drawable.getting_started),
                new Project("Quotes Generator", "Basic project to print a Quote", R.drawable.quote),
                new Project("BMI Calculator", "A real life BMI calculator, used this project to learn about buttons and other controls", R.drawable.calculator),
                new Project("Inches Converter", "A basic converter from inches to meters", R.drawable.tape),
                new Project("Foody Life", "An app that display a menu, used this project to learn about intent and ListView", R.drawable.foody_life)
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);

    }
}