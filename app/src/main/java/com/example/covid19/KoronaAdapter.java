package com.example.covid19;

import android.app.Activity;
import android.icu.text.Transliterator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class KoronaAdapter extends RecyclerView.Adapter<KoronaAdapter.KoronaHolder> {
    Data datanya;
    Activity activity;

    public KoronaAdapter(Data datanya, Activity activity) {
        this.datanya = datanya;
        this.activity = activity;
    }

    @NonNull
    @Override
    public KoronaAdapter.KoronaHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.rv_item,parent,false);
        return new KoronaHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KoronaAdapter.KoronaHolder holder, int position) {
       holder.txt_prov.setText(datanya.getProvinsiku().get(position).getKey());
       int a=datanya.getProvinsiku().get(position).getDoc_count();
       holder.txt_doc.setText(Integer.toString(a));
       int b=datanya.getProvinsiku().get(position).getJumlah_kasus();
       holder.txt_dok.setText(Integer.toString(b));
       int c=datanya.getProvinsiku().get(position).getJumlah_sembuh();
       holder.txt_dok.setText(Integer.toString(c));
       int d=datanya.getProvinsiku().get(position).getJumlah_meninggal();
       holder.txt_dok.setText(Integer.toString(d));
       int e=datanya.getProvinsiku().get(position).getJumlah_dirawat();
       holder.txt_dok.setText(Integer.toString(e));
       holder.txt_lk.setText(datanya.getJenkelnya().get(position).getKey());
       int f=datanya.getJenkelnya().get(position).getDoc_count();
       holder.txt_pr.setText(Integer.toString(f));
       holder.txt_jml.setText(datanya.getUmurnya().get(position).getKey());
       int g=datanya.getUmurnya().get(position).getDoc_count();
       holder.txt_count.setText(Integer.toString(g));
    }

    @Override
    public int getItemCount() {
        return datanya.
                size();
    }

    static class KoronaHolder extends RecyclerView.ViewHolder {
        TextView txt_prov,txt_doc,txt_dok,txt_sembuh,txt_meni,txt_rawat,txt_lk,txt_pr,txt_jml,txt_count;

        public KoronaHolder(@NonNull View itemView) {
            super(itemView);
            txt_prov=(TextView)itemView.findViewById(R.id.txt_prov);
            txt_doc=(TextView)itemView.findViewById(R.id.txt_doc);
            txt_dok=(TextView)itemView.findViewById(R.id.txt_dok);
            txt_sembuh=(TextView)itemView.findViewById(R.id.txt_sembuh);
            txt_meni=(TextView)itemView.findViewById(R.id.txt_meni);
            txt_rawat=(TextView)itemView.findViewById(R.id.txt_rawat);
            txt_lk=(TextView)itemView.findViewById(R.id.txt_lk);
            txt_pr=(TextView)itemView.findViewById(R.id.txt_pr);
            txt_jml=(TextView)itemView.findViewById(R.id.txt_jml);
            txt_count=(TextView)itemView.findViewById(R.id.txt_count);
             }
        }
}
