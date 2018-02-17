package com.example.paola.unidad2pggs;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ParkingDH extends AppCompatActivity {

    public void nextActivity33(View view){
        startActivity(new Intent(this, Map.class));
    }

    public Parking[] parkings = {
            new Parking(R.drawable.dh8, "Estacionamiento 1", "$10 por hora"),
            new Parking(R.drawable.dh9, "Estacionamiento 2", "$15 por hora"),
            new Parking(R.drawable.dh10, "Centro artesanal", "Baño $3"),
    };

    private ListView lsvParkings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parking_dh);
        lsvParkings = findViewById(R.id.lsv_parkings);
        ParkingAdapter adapter = new ParkingAdapter(this, parkings);
        lsvParkings.setAdapter(adapter);
    }

    static class ViewHolder{
        TextView txvNameParking;
        TextView txvPrice;
        ImageView imvPhoto;
    }


    class ParkingAdapter extends ArrayAdapter<Parking> {
        public ParkingAdapter(@NonNull Context context, Parking[] data) {
            super(context, R.layout.parking, data);
        }

        public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
            View cell = convertView;
            ParkingDH.ViewHolder holder;
            if (cell == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                cell = inflater.inflate(R.layout.parking, null);

                holder = new ParkingDH.ViewHolder();
                holder.imvPhoto = cell.findViewById(R.id.imv_photo);
                holder.txvNameParking = cell.findViewById(R.id.txv_name_parking);
                holder.txvPrice = cell.findViewById(R.id.txv_price);

                cell.setTag(holder);
            } else {
                holder = (ParkingDH.ViewHolder) cell.getTag();
            }

            holder.imvPhoto.setImageResource(parkings[position].getImageId());
            holder.txvNameParking.setText(parkings[position].getNameParking());
            holder.txvPrice.setText(parkings[position].getPrice());
            return cell;
        }
    }
}