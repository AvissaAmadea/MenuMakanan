package com.avissa.menumakanan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String> fotoMakanan = new ArrayList<>();
    private ArrayList<String> namaMakanan = new ArrayList<>();
    private ArrayList<String> hargaMakanan = new ArrayList<>();
    private ArrayList<String> infoMakanan = new ArrayList<>();
    private Context context;


    public RecyclerViewAdapter(ArrayList<String> fotoMakanan, ArrayList<String> namaMakanan, ArrayList<String> hargaMakanan, ArrayList<String> infoMakanan, Context context) {
        this.fotoMakanan = fotoMakanan;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
        this.infoMakanan = infoMakanan;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.desain_layout_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);


        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Glide.with(context).asBitmap().load(fotoMakanan.get(position)).into(holder.fm1);

        holder.nm_mkn1.setText(namaMakanan.get(position));

        holder.harga_mkn.setText(hargaMakanan.get(position));

        holder.ConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Foto_Makanan", fotoMakanan.get(position));
                intent.putExtra("Nama_Makanan", namaMakanan.get(position));
                intent.putExtra("Harga_Makanan", hargaMakanan.get(position));
                intent.putExtra("Info_Makanan", infoMakanan.get(position));

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namaMakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        CircleImageView fm1;
        TextView nm_mkn1;
        TextView harga_mkn;
        ConstraintLayout ConstraintLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fm1 = itemView.findViewById(R.id.fm1);
            nm_mkn1 = itemView.findViewById(R.id.nm_mkn1);
            harga_mkn = itemView.findViewById(R.id.harga_mkn);
            ConstraintLayout = itemView.findViewById(R.id.ConstraintLayout);

        }
    }
}
