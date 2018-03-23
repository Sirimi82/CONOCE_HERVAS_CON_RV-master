package com.local.conoce_hervs;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.local.conoce_hervs.model.ModelPuntos;

public class Maps_activity extends FragmentActivity implements OnMapReadyCallback {
Intent intent=new Intent();
    String nombre;
    Double Lng;
    Double Lat;
    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_layout);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);;
        ModelPuntos puntos;
        Bundle bundle = getIntent().getExtras();
        puntos = getIntent().getParcelableExtra("posicion");
        nombre = puntos.getNombre();
        Lat=Double.parseDouble(puntos.getLat());
        Lng=Double.parseDouble(puntos.getLng());
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng hervas = new LatLng(Lat, Lng);
        mMap.addMarker(new MarkerOptions().position(hervas).title(nombre));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(hervas));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setMapToolbarEnabled(true);
        mMap.getUiSettings().setScrollGesturesEnabled(true);
    }
}