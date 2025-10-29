package com.example.ac_apigooglemaps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback
{
    private GoogleMap myMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        myMap = googleMap;
        LatLng house = new LatLng(-17.772513, -63.154278);
        LatLng familia1 = new LatLng(-17.750880, -63.178072);
        LatLng familia2 = new LatLng(-17.764694, -63.184113);
        LatLng familia3 = new LatLng(-31.410306, -64.159570);
        LatLng familia4 = new LatLng(-19.930544, -43.924064);
        LatLng familia5 = new LatLng(52.363093, 4.895092);

        myMap.moveCamera(CameraUpdateFactory.newLatLng(house));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(familia1));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(familia2));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(familia3));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(familia4));
        myMap.moveCamera(CameraUpdateFactory.newLatLng(familia5));


        MarkerOptions options = new MarkerOptions().position(house).title("Familia Avaro Oliva");
        MarkerOptions options2 = new MarkerOptions().position(familia1).title("Familia Oliva Silva");
        MarkerOptions options3 = new MarkerOptions().position(familia2).title("Familia Oliva Roca");
        MarkerOptions options4 = new MarkerOptions().position(familia3).title("Familia Avaro");
        MarkerOptions options5 = new MarkerOptions().position(familia4).title("Familia Oliva Soria");
        MarkerOptions options6 = new MarkerOptions().position(familia5).title("Familia Oliva Soria");

        options.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE));
        options2.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED));
        options3.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
        options4.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET));
        options5.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));
        options6.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW));

        myMap.addMarker(options);
        myMap.addMarker(options2);
        myMap.addMarker(options3);
        myMap.addMarker(options4);
        myMap.addMarker(options5);
        myMap.addMarker(options6);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}