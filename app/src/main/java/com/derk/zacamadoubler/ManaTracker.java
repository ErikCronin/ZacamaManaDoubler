package com.derk.zacamadoubler;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class ManaTracker extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mana_tracker);
        Intent intent = getIntent();

        //Read in strings from main activity
        int wDoubler = 0;
        int uDoubler = 0;
        int bDoubler = 0;
        int rDoubler = 0;
        int gDoubler = 0;

        int hos_bool = Integer.parseInt(intent.getStringExtra("HOS_MESSAGE"));
        int vb_bool = Integer.parseInt(intent.getStringExtra("VB_MESSAGE"));
        int kop_bool = Integer.parseInt(intent.getStringExtra("KOP_MESSAGE"));
        int cs_bool = Integer.parseInt(intent.getStringExtra("CS_MESSAGE"));
        int mr_bool = Integer.parseInt(intent.getStringExtra("MR_MESSAGE"));
        int dok_bool = Integer.parseInt(intent.getStringExtra("DOK_MESSAGE"));
        int mf_bool = Integer.parseInt(intent.getStringExtra("MF_MESSAGE"));
        int mw_bool = Integer.parseInt(intent.getStringExtra("MW_MESSAGE"));
        int oa_bool = Integer.parseInt(intent.getStringExtra("OA_MESSAGE"));
        int rb_bool = Integer.parseInt(intent.getStringExtra("RB_MESSAGE"));
        int vh_bool = Integer.parseInt(intent.getStringExtra("VH_MESSAGE"));
        int zr_bool = Integer.parseInt(intent.getStringExtra("ZR_MESSAGE"));
        int zta_bool = Integer.parseInt(intent.getStringExtra("ZTA_MESSAGE"));

        int plains_input = Integer.parseInt(intent.getStringExtra("PLAINS_MESSAGE"));
        EditText plains_view = (EditText) findViewById(R.id.white_edittext_mana_tracker);

        int island_input = Integer.parseInt(intent.getStringExtra("ISLAND_MESSAGE"));
        EditText island_view = (EditText) findViewById(R.id.blue_edittext_mana_tracker);

        int swamp_input = Integer.parseInt(intent.getStringExtra("SWAMP_MESSAGE"));
        EditText swamp_view = (EditText) findViewById(R.id.black_edittext_mana_tracker);

        int mountain_input = Integer.parseInt(intent.getStringExtra("MOUNTAIN_MESSAGE"));
        EditText mountain_view = (EditText) findViewById(R.id.red_edittext_mana_tracker);

        int forest_input = Integer.parseInt(intent.getStringExtra("FOREST_MESSAGE"));
        EditText forest_view = (EditText) findViewById(R.id.green_edittext_mana_tracker);

        //Adding doublers
        if(hos_bool == 1) {
            wDoubler ++;
            uDoubler ++;
            bDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        if(vb_bool == 1) {
            gDoubler ++;        }

        if(kop_bool == 1) {
            wDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        if(cs_bool == 1) {
            wDoubler ++;
        } else if(cs_bool == 2){
            uDoubler ++;
        } else if(cs_bool == 3){
            bDoubler ++;
        } else if(cs_bool == 4){
            rDoubler ++;
        } else if(cs_bool == 5){
            gDoubler ++;
        }

        if(mr_bool == 1) {
            wDoubler ++;
            uDoubler ++;
            bDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        if(dok_bool == 1) {
            wDoubler ++;
            uDoubler ++;
            bDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        if(mf_bool == 1) {
            wDoubler ++;
            uDoubler ++;
            bDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        if(mw_bool == 1) {
            wDoubler ++;
            uDoubler ++;
            bDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        if(oa_bool == 1) {
            wDoubler ++;
            uDoubler ++;
            bDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        if(rb_bool == 1) {
            wDoubler ++;
            uDoubler ++;
            bDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        if(vh_bool == 1) {
            wDoubler ++;
            uDoubler ++;
            bDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        if(zr_bool == 1) {
            wDoubler ++;
            uDoubler ++;
            bDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        if(zta_bool == 1) {
            wDoubler ++;
            uDoubler ++;
            bDoubler ++;
            rDoubler ++;
            gDoubler ++;
        }

        plains_input = plains_input * (wDoubler + 1);
        island_input = island_input * (uDoubler + 1);
        swamp_input = swamp_input * (bDoubler + 1);
        mountain_input = mountain_input * (rDoubler + 1);
        forest_input = forest_input * (gDoubler + 1);

        //Converting from Int to String so android can read it.
        String plains_output = Integer.toString(plains_input);
        String island_output = Integer.toString(island_input);
        String swamp_output = Integer.toString(swamp_input);
        String mountain_output = Integer.toString(mountain_input);
        String forest_output = Integer.toString(forest_input);

        //printing it to the EditText boxes in activity
        plains_view.setText(plains_output);
        island_view.setText(island_output);
        swamp_view.setText(swamp_output);
        mountain_view.setText(mountain_output);
        forest_view.setText(forest_output);
    }

    public void onPlainsClick(View view){
        EditText plains_view = (EditText) findViewById(R.id.white_edittext_mana_tracker);

        int total_plains = Integer.parseInt(plains_view.getText().toString());
        total_plains -= 1;
        plains_view.setText(Integer.toString(total_plains));
    }

    public void onIslandClick(View view){
        EditText island_view = (EditText) findViewById(R.id.blue_edittext_mana_tracker);

        int total_islands = Integer.parseInt(island_view.getText().toString());
        total_islands -= 1;
        island_view.setText(Integer.toString(total_islands));
    }

    public void onSwampClick(View view){
        EditText swamp_view = (EditText) findViewById(R.id.black_edittext_mana_tracker);

        int total_swamp = Integer.parseInt(swamp_view.getText().toString());
        total_swamp -= 1;
        swamp_view.setText(Integer.toString(total_swamp));
    }

    public void onMountainClick(View view){
        EditText mountain_view = (EditText) findViewById(R.id.red_edittext_mana_tracker);

        int total_mountains = Integer.parseInt(mountain_view.getText().toString());
        total_mountains -= 1;
        mountain_view.setText(Integer.toString(total_mountains));
    }

    public void onForestClick(View view){
        EditText forest_view = (EditText) findViewById(R.id.green_edittext_mana_tracker);

        int total_forests = Integer.parseInt(forest_view.getText().toString());
        total_forests -= 1;
        forest_view.setText(Integer.toString(total_forests));
    }
}

