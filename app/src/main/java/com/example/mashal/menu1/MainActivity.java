package com.example.mashal.menu1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnCreateContextMenuListener {
    LinearLayout ln;
    String oper;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ln=findViewById(R.id.ln2);
        btn=findViewById(R.id.btn1212);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
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
        return super.onContextItemSelected(item);
    }

    public void go(View view) {
        Intent go = new Intent(this,Main2Activity.class);
        startActivity(go);
    }
}
