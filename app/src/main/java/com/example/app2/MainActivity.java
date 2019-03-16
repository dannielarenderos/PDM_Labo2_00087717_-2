package com.example.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imagen1;
    private ImageView imagen2;
    private ImageView imagen3;
    private ImageView imagen4;
    private ImageView imagen5;
    private ImageView imagen6;
    private ImageView imagen7;
    private ImageView imagen8;
    private ImageView imagen9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagen1=(ImageView) findViewById(R.id.img1);
        imagen2=(ImageView) findViewById(R.id.img2);
        imagen3=(ImageView) findViewById(R.id.img3);
        imagen4=(ImageView) findViewById(R.id.img4);
        imagen5=(ImageView) findViewById(R.id.img5);
        imagen6=(ImageView) findViewById(R.id.img6);
        imagen7=(ImageView) findViewById(R.id.img7);
        imagen8=(ImageView) findViewById(R.id.img8);
        imagen9=(ImageView) findViewById(R.id.img9);

        imagen1.setOnClickListener(this);
        imagen2.setOnClickListener(this);
        imagen3.setOnClickListener(this);
        imagen4.setOnClickListener(this);
        imagen5.setOnClickListener(this);
        imagen6.setOnClickListener(this);
        imagen7.setOnClickListener(this);
        imagen8.setOnClickListener(this);
        imagen9.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        int img_ = (int)  (Math.random() * ((5 - 1) + 1)) + 1;

        String Pic_Num = "imagen" +img_;

        switch (v.getId()){
            case R.id.img1:
                imagen1.setImageResource(getResources().getIdentifier(Pic_Num, "drawable", getPackageName()));
                break;
            case R.id.img2:
                imagen2.setImageResource(getResources().getIdentifier(Pic_Num, "drawable", getPackageName()));
                break;
            case R.id.img3:
                imagen3.setImageResource(getResources().getIdentifier(Pic_Num, "drawable", getPackageName()));
                break;
            case R.id.img4:
                imagen4.setImageResource(getResources().getIdentifier(Pic_Num, "drawable", getPackageName()));
                break;
            case R.id.img5:
                imagen5.setImageResource(getResources().getIdentifier(Pic_Num, "drawable", getPackageName()));
                break;
            case R.id.img6:
                imagen6.setImageResource(getResources().getIdentifier(Pic_Num, "drawable", getPackageName()));
                break;
            case R.id.img7:
                imagen7.setImageResource(getResources().getIdentifier(Pic_Num, "drawable", getPackageName()));
                break;
            case R.id.img8:
                imagen8.setImageResource(getResources().getIdentifier(Pic_Num, "drawable", getPackageName()));
                break;
            case R.id.img9:
                imagen9.setImageResource(getResources().getIdentifier(Pic_Num, "drawable", getPackageName()));

        }

    }
}
