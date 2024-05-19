package com.app.echelon;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.AppBarConfiguration;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage);

    }
    public void switchToLogin() {
        setContentView(R.layout.login);
    }
    public void switchToSignin() {
        setContentView(R.layout.signin);
    }
    public void switchTo

}