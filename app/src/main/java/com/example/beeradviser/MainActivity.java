package com.example.beeradviser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickBeer(View view) {
        TextView tv = findViewById(R.id.tV2);
        Spinner color = findViewById(R.id.color);
        String tek_color = color.getSelectedItem().toString();
        BeerExpert expert = new BeerExpert();
        List<String> beer = expert.getBrands(tek_color);
        StringBuilder str_beer = new StringBuilder();
        for (String str : beer) {
            str_beer.append(str).append("\n");
        }

        tv.setText(str_beer);

    }
}