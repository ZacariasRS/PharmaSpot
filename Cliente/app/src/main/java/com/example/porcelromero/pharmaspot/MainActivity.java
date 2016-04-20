package com.example.porcelromero.pharmaspot;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public static final String PREFS_NAME = "MyPrefsFile";
    SharedPreferences pref;
    SharedPreferences.Editor editor;


    private void check_not_login() {
        pref = getSharedPreferences(PREFS_NAME,0);
        if(pref.getString("username",null) == null) {
            Intent i = new Intent(this, LoginActivity.class);
            startActivity(i);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        check_not_login();


        setContentView(R.layout.activity_main);

    }
}
