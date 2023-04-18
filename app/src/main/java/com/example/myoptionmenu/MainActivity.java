package com.example.myoptionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menulayoutfile,menu);


        return super.onCreateOptionsMenu(menu);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==R.id.settingid)
        {
            Toast.makeText(this, "setting", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (item.getItemId()==R.id.shareid)
        {
            Toast.makeText(this, "shareit", Toast.LENGTH_SHORT).show();
            return true;
        }

        if (item.getItemId()==R.id.contuctid)
        {
            Toast.makeText(this, "01717580025", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId()==R.id.aboutid)
        {
            Toast.makeText(this, "noyon mollick app devloper", Toast.LENGTH_SHORT).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}