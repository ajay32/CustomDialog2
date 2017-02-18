package com.hackingbuzz.customdialog2.activities;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;

import com.hackingbuzz.customdialog2.R;


public class MainActivity extends Activity {


    private Button buttonClick;

    FragmentManager fragmentManager;
    Fragment fragment;
    Dialog dialog;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonClick = (Button) findViewById(R.id.buttonClick);


       buttonClick.setOnClickListener(new MyClickListener());

    }

    class MyClickListener implements OnClickListener {


        @Override
        public void onClick(View v) {

            startActivity(new Intent(v.getContext(), DialogActivity.class));

        }
    }
}
