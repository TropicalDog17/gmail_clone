package com.example.gmailclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EmailModel[] emails = {
                new EmailModel("Hello world", "$19 only (First 10 spots)-Bestselling...\\nAre you looking to learn Web Development...\" />\n", "12:00PM"),
                new EmailModel("Hello world", "$19 only (First 10 spots)-Bestselling...\\nAre you looking to learn Web Development...\" />\n", "12:00PM"),
                new EmailModel("Hello world", "$19 only (First 10 spots)-Bestselling...\\nAre you looking to learn Web Development...\" />\n", "12:00PM"),
                new EmailModel("Hello world", "$19 only (First 10 spots)-Bestselling...\\nAre you looking to learn Web Development...\" />\n", "12:00PM"),
                new EmailModel("Hello world", "$19 only (First 10 spots)-Bestselling...\\nAre you looking to learn Web Development...\" />\n", "12:00PM"),
                new EmailModel("Hello world", "$19 only (First 10 spots)-Bestselling...\\nAre you looking to learn Web Development...\" />\n", "12:00PM"),
                new EmailModel("Hello world", "1 2 3 4 5... \n a b c d e", "12:00PM"),
                new EmailModel("Hello world", "1 2 3 4 5... \n a b c d e", "12:00PM"),
                new EmailModel("Hello world", "1 2 3 4 5... \n a b c d e", "12:00PM"),
                new EmailModel("Hello world", "1 2 3 4 5... \n a b c d e", "12:00PM"),
                new EmailModel("Hello world", "1 2 3 4 5... \n a b c d e", "12:00PM"),

        };
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyCustomAdapter emailAdapter = new MyCustomAdapter( emails);
        RecyclerView emailRecycleView = findViewById(R.id.rc);
        emailRecycleView.setLayoutManager(new LinearLayoutManager(this));
        emailRecycleView.setAdapter(emailAdapter);
    }
}