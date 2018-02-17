package com.example.paola.unidad2pggs;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

public class PhotoDH extends AppCompatActivity {

    public void nextActivity22(View view){
        startActivity(new Intent(this, Map.class));
    }

    private Photo[] photos = {
            new Photo(R.drawable.dh4, "Fuente en Jardín Principal"),
            new Photo(R.drawable.dh5, "Kiosco en Jardín Principal"),
            new Photo(R.drawable.dh6, "Callejon Casiano Exiga"),
            new Photo(R.drawable.dh7, "Árbol de la noche triste"),
            new Photo(R.drawable.dh12, "Jardín Principal"),
            new Photo(R.drawable.dh13, "Museo José Alfredo Jiménez"),
    };

    private GridView grvPhotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photo_dh);
        grvPhotos = findViewById(R.id.grv_photos);
        PhotoAdapter adapter = new PhotoAdapter(this, photos);
        grvPhotos.setAdapter(adapter);
    }

    static class ViewHolder {
        TextView txvNamePlace;
        ImageView imvThumbnail;
    }

    class PhotoAdapter extends ArrayAdapter<Photo> {
        public PhotoAdapter(@NonNull Context context, Photo[] data) {
            super(context, R.layout.photo, data);
        }


        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View cell = convertView;
            ViewHolder holder;
            if (cell == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                cell = inflater.inflate(R.layout.photo, null);

                holder = new ViewHolder();
                holder.imvThumbnail = cell.findViewById(R.id.imv_thumbnail);
                holder.txvNamePlace = cell.findViewById(R.id.txv_name_place);

                cell.setTag(holder);
            } else {
                holder = (ViewHolder) cell.getTag();
            }
            holder.imvThumbnail.setImageResource(photos[position].getImageId());
            holder.txvNamePlace.setText(photos[position].getNamePlace());
            return cell;
        }
    }
}
