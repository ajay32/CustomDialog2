package com.hackingbuzz.customdialog2.fragments;

import android.app.Dialog;

import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

import com.hackingbuzz.customdialog2.R;


/**
 * Created by Avi Hacker on 2/17/2017.
 */

public class DialogFragment extends Fragment  {

    Fragment fragment;
   FragmentManager fragmentManager;
    Dialog dialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.dialog_frag, container , false);
        init(v);
        return v;
    }

    private void init(View v) {

        fragmentManager = getFragmentManager();


        dialog = new Dialog(getActivity());

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        dialog.setContentView(R.layout.dialog);


        dialog.show();

        LinearLayout editprofile = (LinearLayout) dialog.findViewById(R.id.layout_editProfile);
        final LinearLayout dialogcancel = (LinearLayout) dialog.findViewById(R.id.layout_cancel);
        LinearLayout preferences = (LinearLayout) dialog.findViewById(R.id.layout_preference);
        LinearLayout settings = (LinearLayout) dialog.findViewById(R.id.layout_settings);


        editprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();

                fragment = fragmentManager.findFragmentByTag("dialogfrag");
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                if (fragment != null) {
                    fragmentTransaction.remove(fragment);
                }

                fragment = new EditProfile();
                fragmentTransaction.add(R.id.frame_layout, fragment, "editprofile");
                fragmentTransaction.addToBackStack("editprofile");
                fragmentTransaction.commit();



            }
        });



        preferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();

                fragment = fragmentManager.findFragmentByTag("dialogfrag");
                FragmentTransaction fragmentTransaction2 = fragmentManager.beginTransaction();
                if (fragment != null) {
                    fragmentTransaction2.remove(fragment);
                }

                fragment = new Preferences();
                fragmentTransaction2.add(R.id.frame_layout, fragment, "preferences");
                fragmentTransaction2.addToBackStack("preferences");
                fragmentTransaction2.commit();


            }
        });



        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();

                fragment = fragmentManager.findFragmentByTag("dialogfrag");
                FragmentTransaction fragmentTransaction3 = fragmentManager.beginTransaction();
                if (fragment != null) {
                    fragmentTransaction3.remove(fragment);
                }

                fragment = new Settings();
                fragmentTransaction3.add(R.id.frame_layout, fragment, "settings");
                fragmentTransaction3.addToBackStack("settings");
                fragmentTransaction3.commit();


            }
        });

        dialogcancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });


    }

        }

