package com.example.user.gridview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    int[] letter={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d};
    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView=(GridView)findViewById(R.id.gridviewid);

        CustomAdapter adapter= new CustomAdapter(this,letter);
        gridView.setAdapter(adapter);
    }
}
