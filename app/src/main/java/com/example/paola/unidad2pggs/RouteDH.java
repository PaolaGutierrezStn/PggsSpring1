package com.example.paola.unidad2pggs;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class RouteDH extends AppCompatActivity {

    public void nextActivity11(View view){
        startActivity(new Intent(this, Map.class));
    }

    public Route[] routes = {
            new Route(R.drawable.dh1, "Ruta independencia", "Conoce los lugares más importantes para la independencia del municipio"),
            new Route(R.drawable.dh2, "Ruta Jose Alfredo", "Descubre los bares  donde el cantante y compositor mexicano creó una gran cantidad de temas, principalmente rancheras, huapangos y corridos"),
            new Route(R.drawable.dh3, "Ruta general", "Visita los mejores lugares en la Cuna de la Independencia"),
    };

    private ListView lsvRoutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.route_dh);
        lsvRoutes = findViewById(R.id.lsv_routes);
        RouteAdapter adapter = new RouteAdapter(this, routes);
        lsvRoutes.setAdapter(adapter);

    }

    static class ViewHolder {
        TextView txvNameRoute;
        TextView txvDescription;
        ImageView imvPhoto;
    }

    class RouteAdapter extends ArrayAdapter<Route> {
        public RouteAdapter(@NonNull Context context, Route[] data) {
            super(context, R.layout.route, data);
        }

        public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent) {
            View cell = convertView;
            ViewHolder holder;
            if (cell == null) {
                LayoutInflater inflater = LayoutInflater.from(getContext());
                cell = inflater.inflate(R.layout.route, null);

                holder = new ViewHolder();
                holder.imvPhoto = cell.findViewById(R.id.imv_photo);
                holder.txvNameRoute = cell.findViewById(R.id.txv_name_route);
                holder.txvDescription = cell.findViewById(R.id.txv_description);

                cell.setTag(holder);
            } else {
                holder = (ViewHolder) cell.getTag();
            }

            holder.imvPhoto.setImageResource(routes[position].getImageId());
            holder.txvNameRoute.setText(routes[position].getNameRoute());
            holder.txvDescription.setText(routes[position].getDescription());
            return cell;
        }
    }
}



