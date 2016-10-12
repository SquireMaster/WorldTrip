package com.patrick.worldtrip;

import android.media.MediaPlayer;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    Button cityMontreal,
           cityLondon,
           cityRio,
           cityTokyo,
           citySidney,
           cityJohannesburg;

    final LatLng montreal = new LatLng(45.5017, -73.5673);
    final LatLng london = new LatLng(51.5074, -0.1278);
    final LatLng rio = new LatLng(-22.9068, -43.1729);
    final LatLng tokyo = new LatLng(35.6895, 139.6917);
    final LatLng sidney = new LatLng(-33.8688, 151.2093);
    final LatLng johannesburg = new LatLng(-26.2041, 28.0473);

    final LatLng startingPoint = new LatLng(0.0, 0.0);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    } // end method onCreate()


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.addMarker(new MarkerOptions().position(montreal).title("Montreal, Canada"));
        mMap.addMarker(new MarkerOptions().position(london).title("London, UK"));
        mMap.addMarker(new MarkerOptions().position(rio).title("Rio de Janeirio, Brazil"));
        mMap.addMarker(new MarkerOptions().position(tokyo).title("Tokyo, Japan"));
        mMap.addMarker(new MarkerOptions().position(sidney).title("Sidney, Australia"));
        mMap.addMarker(new MarkerOptions().position(johannesburg).title("Johannesburg, South Africa"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(startingPoint));

        Button buttonMontreal = (Button) findViewById(R.id.button_montreal);
        Button buttonLondon = (Button) findViewById(R.id.button_london);
        Button buttonRio = (Button) findViewById(R.id.button_rio);
        Button buttonTokyo = (Button) findViewById(R.id.button_tokyo);
        Button buttonSidney = (Button) findViewById(R.id.button_sidney);
        Button buttonJohannesburg = (Button) findViewById(R.id.button_johannesburg);

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.aircraft);


        buttonMontreal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mp.start();
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(montreal, 10));
                Toast.makeText(getBaseContext(), "Welcome to Montreal", Toast.LENGTH_SHORT).show();

            } // end method onClick()

        }); // end listener buttonMontreal


        buttonLondon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mp.start();
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(london, 10));
                Toast.makeText(getBaseContext(), "Welcome to London", Toast.LENGTH_SHORT).show();

            } // end method onClick()

        }); // end listener buttonLondon


        buttonRio.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mp.start();
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(rio, 10));
                Toast.makeText(getBaseContext(), "Welcome to Rio", Toast.LENGTH_SHORT).show();

            } // end method onClick()

        }); // end listener buttonRio


        buttonTokyo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mp.start();
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(tokyo, 10));
                Toast.makeText(getBaseContext(), "Welcome to Tokyo", Toast.LENGTH_SHORT).show();

            } // end method onClick()

        }); // end listener buttonTokyo


        buttonSidney.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mp.start();
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(sidney, 10));
                Toast.makeText(getBaseContext(), "Welcome to Sidney", Toast.LENGTH_SHORT).show();

            } // end method onClick()

        }); // end listener buttonSidney


        buttonJohannesburg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mp.start();
                mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(johannesburg, 10));
                Toast.makeText(getBaseContext(), "Welcome to Johannesburg", Toast.LENGTH_SHORT).show();

            } // end method onClick()

        }); // end listener buttonJohannesburg

    } // end method onMapReady()

} // end class MapsActivity
