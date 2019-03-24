package com.derk.zacamadoubler;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ToggleButton;
import android.widget.CompoundButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static int hos_bool = 0;
    public static int vb_bool = 0;
    public static int kop_bool = 0;
    public static int cs_bool = 0;
    public static int mr_bool = 0;
    public static int dok_bool = 0;
    public static int mf_bool = 0;
    public static int mw_bool = 0;
    public static int oa_bool = 0;
    public static int rb_bool = 0;
    public static int vh_bool = 0;
    public static int zr_bool = 0;
    public static int zta_bool = 0;

    public void buttonClicked_hos_active(View view){
        Button hos_button_view = findViewById(R.id.hos_button_id);
        String hos_button_text = hos_button_view.getText().toString();
        if(hos_button_text.equals("No")){
            hos_button_view.setText(R.string.yes);
            hos_bool = 1;
        } else if(hos_button_text.equals("Yes")){
            hos_button_view.setText(R.string.no);
            hos_bool = 0;
        }
    }

    public void buttonClicked_vb_active(View view){
        Button vb_button_view = findViewById(R.id.vb_button_id);
        String vb_button_text = vb_button_view.getText().toString();
        if(vb_button_text.equals("No")){
            vb_button_view.setText(R.string.yes);
            vb_bool = 1;
        } else if(vb_button_text.equals("Yes")){
            vb_button_view.setText(R.string.no);
            vb_bool = 0;
        }
    }

    public void buttonClicked_dok_active(View view){
        Button dok_button_view = findViewById(R.id.dok_button_id);
        String dok_button_text = dok_button_view.getText().toString();
        if(dok_button_text.equals("No")){
            dok_button_view.setText(R.string.yes);
            dok_bool = 1;
        } else if(dok_button_text.equals("Yes")){
            dok_button_view.setText(R.string.no);
            dok_bool = 0;
        }
    }

    public void buttonClicked_kop_active(View view){
        Button kop_button_view = findViewById(R.id.kop_button_id);
        String kop_button_text = kop_button_view.getText().toString();
        if(kop_button_text.equals("No")){
            kop_button_view.setText(R.string.yes);
            kop_bool = 1;
        } else if(kop_button_text.equals("Yes")){
            kop_button_view.setText(R.string.no);
            kop_bool = 0;
        }
    }

    public void buttonClicked_cs_active(View view){
        String plains_colour = "#F7F3CE";
        Button cs_button_view = findViewById(R.id.cs_button_id);
        String cs_button_text = cs_button_view.getText().toString();
        //go to plains
        if(cs_button_text.equals("No")){
            cs_button_view.setText(R.string.plains);
            cs_bool = 1;
            //go to island
        } else if(cs_button_text.equals("Plains")){
            cs_button_view.setText(R.string.island);
            cs_bool = 2;
            //go to swamp
        } else if(cs_button_text.equals("Island")){
            cs_button_view.setText(R.string.swamp);
            cs_bool = 3;
            //go to mountain
        } else if(cs_button_text.equals("Swamp")){
            cs_button_view.setText(R.string.mountain);
            cs_bool = 4;
            //go to forest
        } else if(cs_button_text.equals("Mountain")){
            cs_button_view.setText(R.string.forest);
            cs_bool = 5;
            // turn Caged Sun off
        } else if(cs_button_text.equals("Forest")){
            cs_button_view.setText(R.string.no);
            cs_bool = 0;
        }
    }

    public void buttonClicked_mr_active(View view){
        Button mr_button_view = findViewById(R.id.mr_button_id);
        String mr_button_text = mr_button_view.getText().toString();
        if(mr_button_text.equals("No")){
            mr_button_view.setText(R.string.yes);
            mr_bool = 1;
        } else if(mr_button_text.equals("Yes")){
            mr_button_view.setText(R.string.no);
            mr_bool = 0;
        }
    }

    public void buttonClicked_mf_active(View view){
        Button mf_button_view = findViewById(R.id.mf_button_id);
        String mf_button_text = mf_button_view.getText().toString();
        if(mf_button_text.equals("No")){
            mf_button_view.setText(R.string.yes);
            mf_bool = 1;
        } else if(mf_button_text.equals("Yes")){
            mf_button_view.setText(R.string.no);
            mf_bool = 0;
        }
    }

    public void buttonClicked_mw_active(View view){
        Button mw_button_view = findViewById(R.id.mw_button_id);
        String mw_button_text = mw_button_view.getText().toString();
        if(mw_button_text.equals("No")){
            mw_button_view.setText(R.string.yes);
            mf_bool = 1;
        } else if(mw_button_text.equals("Yes")){
            mw_button_view.setText(R.string.no);
            mf_bool = 0;
        }
    }

    public void buttonClicked_oa_active(View view){
        Button oa_button_view = findViewById(R.id.oa_button_id);
        String oa_button_text = oa_button_view.getText().toString();
        if(oa_button_text.equals("No")){
            oa_button_view.setText(R.string.yes);
            oa_bool = 1;
        } else if(oa_button_text.equals("Yes")){
            oa_button_view.setText(R.string.no);
            oa_bool = 0;
        }
    }

    public void buttonClicked_rb_active(View view){
        Button rb_button_view = findViewById(R.id.rb_button_id);
        String rb_button_text = rb_button_view.getText().toString();
        if(rb_button_text.equals("No")){
            rb_button_view.setText(R.string.yes);
            rb_bool = 1;
        } else if(rb_button_text.equals("Yes")){
            rb_button_view.setText(R.string.no);
            rb_bool = 0;
        }
    }

    public void buttonClicked_vh_active(View view){
        Button vh_button_view = findViewById(R.id.vh_button_id);
        String vh_button_text = vh_button_view.getText().toString();
        if(vh_button_text.equals("No")){
            vh_button_view.setText(R.string.yes);
            vh_bool = 1;
        } else if(vh_button_text.equals("Yes")){
            vh_button_view.setText(R.string.no);
            vh_bool = 0;
        }
    }

    public void buttonClicked_zr_active(View view){
        Button zr_button_view = findViewById(R.id.zr_button_id);
        String zr_button_text = zr_button_view.getText().toString();
        if(zr_button_text.equals("No")){
            zr_button_view.setText(R.string.yes);
            zr_bool = 1;
        } else if(zr_button_text.equals("Yes")){
            zr_button_view.setText(R.string.no);
            zr_bool = 0;
        }
    }

    public void buttonClicked_zta_active(View view){
        Button zta_button_view = findViewById(R.id.zta_button_id);
        String zta_button_text = zta_button_view.getText().toString();
        if(zta_button_text.equals("No")){
            zta_button_view.setText(R.string.yes);
            zta_bool = 1;
        } else if(zta_button_text.equals("Yes")){
            zta_button_view.setText(R.string.no);
            zta_bool = 0;
        }
    }

    public void buttonClicked_mana_tracker(View view){
        //Intent to change to mana tracker
        Intent intent = new Intent(this, ManaTracker.class);

        //Reading in EditText info
        String hos_text = Integer.toString(hos_bool);
        intent.putExtra("HOS_MESSAGE", hos_text);

        String vb_text = Integer.toString(vb_bool);
        intent.putExtra("VB_MESSAGE", vb_text);

        String kop_text = Integer.toString(kop_bool);
        intent.putExtra("KOP_MESSAGE", kop_text);

        String cs_text = Integer.toString(cs_bool);
        intent.putExtra("CS_MESSAGE", cs_text);

        String mr_text = Integer.toString(mr_bool);
        intent.putExtra("MR_MESSAGE", mr_text);

        String dok_text = Integer.toString(dok_bool);
        intent.putExtra("DOK_MESSAGE", dok_text);

        String mf_text = Integer.toString(mf_bool);
        intent.putExtra("MF_MESSAGE", mf_text);

        String mw_text = Integer.toString(mw_bool);
        intent.putExtra("MW_MESSAGE", mw_text);

        String oa_text = Integer.toString(oa_bool);
        intent.putExtra("OA_MESSAGE", oa_text);

        String rb_text = Integer.toString(rb_bool);
        intent.putExtra("RB_MESSAGE", rb_text);

        String vh_text = Integer.toString(vh_bool);
        intent.putExtra("VH_MESSAGE", vh_text);

        String zr_text = Integer.toString(zr_bool);
        intent.putExtra("ZR_MESSAGE", zr_text);

        String zta_text = Integer.toString(zta_bool);
        intent.putExtra("ZTA_MESSAGE", zta_text);

        EditText plains_input = (EditText)findViewById(R.id.plains_userinput);
        String plains_text = plains_input.getText().toString();
        intent.putExtra("PLAINS_MESSAGE", plains_text);

        EditText island_input = (EditText)findViewById(R.id.island_userinput);
        String island_text = island_input.getText().toString();
        intent.putExtra("ISLAND_MESSAGE", island_text);

        EditText swamp_input = (EditText)findViewById(R.id.swamp_userinput);
        String swamp_text = swamp_input.getText().toString();
        intent.putExtra("SWAMP_MESSAGE", swamp_text);

        EditText mountain_input = (EditText)findViewById(R.id.mountain_userinput);
        String mountain_text = mountain_input.getText().toString();
        intent.putExtra("MOUNTAIN_MESSAGE", mountain_text);

        EditText forest_input = (EditText)findViewById(R.id.forest_userinput);
        String forest_text = forest_input.getText().toString();
        intent.putExtra("FOREST_MESSAGE", forest_text);

        startActivity(intent);
    }

}
