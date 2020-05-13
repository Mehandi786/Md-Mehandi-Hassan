package com.hassan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button india, world;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        india = (Button)findViewById(R.id.CI);
        world = (Button)findViewById(R.id.CW);
        textView = findViewById(R.id.staytext);

    }
    public void India(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.covid19india.org/"));
        startActivity(intent);
    }
    public void World(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://covid19.who.int/"));
        startActivity(intent);
    }
}
