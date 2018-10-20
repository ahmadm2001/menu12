package com.example.mashal.menu1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
    Button btn;
    String oper;
    LinearLayout ln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn=findViewById(R.id.btn4);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,250,"Green");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        oper =item.getTitle().toString();
        if (oper.equals("RED")){
            ln.setBackgroundColor(Color.RED);
        }
        if (oper.equals("YELLOW")) {
            ln.setBackgroundColor(Color.YELLOW);
        }
        if (oper.equals("BLACK")) {
            ln.setBackgroundColor(Color.BLACK);
        }
        if (oper.equals("GREEN")){
            ln.setBackgroundColor(Color.GREEN);
        }
        return super.onContextItemSelected(item);
    }
    public void go(View view) {
        Intent go2 = new Intent(this,MainActivity.class);
        startActivity(go2);
    }
}
