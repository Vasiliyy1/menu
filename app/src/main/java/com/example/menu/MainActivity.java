package com.example.menu;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        String msg = "Настройки";
        TextView headerView = findViewById(R.id.selectedMenuItem);
        if (id == R.id.call_settings) {
            msg = "Call";
        } else if (id == R.id.camera_settings) {
            item.setChecked(true);
            msg = "Camera";
        } else if (id == R.id.video_settings) {
            item.setChecked(true);
            msg = "Video";
        } else if (id == R.id.email_settings) {
            msg = "Email";
        } else if (id == R.id.add_settings) {
            msg = "Add";
        } else if (id == R.id.copy_settings) {
            msg = "Copy";
        } else if (id == R.id.paste_settings) {
            headerView.setText("Paste");
            msg = "Paste";
        } else if (id == R.id.help_settings) {
            msg = "Help";
            headerView.setText("Help");
        };
        Toast.makeText(getApplicationContext(), msg, Toast.LENGTH_LONG).show();
        return true;
    }

}