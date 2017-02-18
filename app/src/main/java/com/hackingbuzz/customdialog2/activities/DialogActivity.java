package com.hackingbuzz.customdialog2.activities;

import android.app.DialogFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import com.hackingbuzz.customdialog2.R;
import com.hackingbuzz.customdialog2.fragments.EditProfile;

/**
 * Created by Avi Hacker on 2/17/2017.
 */


// see even just adding our fragment to backstack (addBackStack("frag") ...it default pop then up when u press back button..
    // you no need to tell their parent layout (now DialogActivity) to pop then up one by one on BackPressed method..as i have seen..

public class DialogActivity extends AppCompatActivity {

    Fragment fragment;
    FragmentManager fragmentManger;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_activity);


        if(savedInstanceState == null) {

            // here is something you shoud learn...their is by defult class DialogFragment() in v4 library..so if your write that it will call that fragment..but
            // here i also created my DialogFrament class..so two classes n i want to call mine ...so i can tell program about mine by adding package name of my app before it..

            fragment = new com.hackingbuzz.customdialog2.fragments.DialogFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.frame_layout, fragment, "dialogfrag").addToBackStack("dialogfrag").commit();

        }


    }
}
