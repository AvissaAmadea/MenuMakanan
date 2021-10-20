package com.avissa.menumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView ft;
    TextView nama_mkn, hrg_mkn, info_mkn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ft = findViewById(R.id.ft);
        nama_mkn = findViewById(R.id.nama_mkn);
        hrg_mkn = findViewById(R.id.hrg_mkn);
        info_mkn = findViewById(R.id.info_mkn);

        getIncomingExtra();

    }

    private void getIncomingExtra(){

        if(getIntent().hasExtra("Foto_Makanan") && getIntent().hasExtra("Nama_Makanan") && getIntent().hasExtra("Harga_Makanan") && getIntent().hasExtra("Info_Makanan")) {

            String fotoMakanan = getIntent().getStringExtra("Foto_Makanan");
            String namaMakanan = getIntent().getStringExtra("Nama_Makanan");
            String hargaMakanan = getIntent().getStringExtra("Harga_Makanan");
            String infoMakanan = getIntent().getStringExtra("Info_Makanan");

            setDataActivity(fotoMakanan, namaMakanan, hargaMakanan, infoMakanan);

        }
    }

    private void setDataActivity(String fotoMakanan, String namaMakanan, String hargaMakanan, String infoMakanan){

        Glide.with(this).asBitmap().load(fotoMakanan).into(ft);

        nama_mkn.setText(namaMakanan);

        hrg_mkn.setText(hargaMakanan);

        info_mkn.setText(infoMakanan);

    }

}