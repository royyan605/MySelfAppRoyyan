package com.example.royyan;

// Author : Royyan Diaularsyi - 10120803 - AKBUL1
// Tanggal : 12 Juni 2024

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class ProfileFragment extends Fragment {

    CardView btnAboutme, btnAboutapp, btnContact, btnFindme;
    Dialog dialog;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void openAboutmeDialog() {
        dialog.setContentView(R.layout.aboutme_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.ivClose);


        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(getContext(), "Dialog Closed", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }

    private void openAboutappDialog() {
        dialog.setContentView(R.layout.aboutapps_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.ivClose);


        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(getContext(), "Dialog Closed", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();
    }

    private void openContactDialog() {
        dialog.setContentView(R.layout.contact_layout_dialog);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        ImageView imageViewClose = dialog.findViewById(R.id.ivClose);


        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
                Toast.makeText(getContext(), "Dialog Closed", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.show();

        Button wabtn = (Button) dialog.findViewById(R.id.btn_whatsapp);
        wabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wa.me/6282216386980"));
                startActivity(intent);
            }
        });

        Button telebtn = (Button) dialog.findViewById(R.id.btn_telegram);
        telebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://t.me/petergriffin23"));
                startActivity(intent);
            }
        });

        Button gitbtn = (Button) dialog.findViewById(R.id.btn_github);
        gitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/christysimarmata"));
                startActivity(intent);
            }
        });

        Button emailtbtn = (Button) dialog.findViewById(R.id.btn_gmail);
        emailtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("mailto:christysimarmata7@gmail.com")
                        .buildUpon()
                        .build();
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                startActivity(intent);
            }
        });
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.style.Theme_MYSELF);
        LayoutInflater localInflater = inflater.cloneInContext(contextThemeWrapper);
        View view = localInflater.inflate(R.layout.fragment_profile, null, false);



        btnAboutme = view.findViewById(R.id.cardAboutMe);
        btnAboutapp = view.findViewById(R.id.cardAboutApp);
        btnContact = view.findViewById(R.id.cardContact);
        btnFindme = view.findViewById(R.id.cardFindMe);

        dialog = new Dialog(getContext());

        btnAboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutmeDialog();
            }
        });

        btnAboutapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAboutappDialog();
            }
        });

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openContactDialog();
            }
        });

        btnFindme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.layout_navigator, new LocationFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });





        return view;
    }

}