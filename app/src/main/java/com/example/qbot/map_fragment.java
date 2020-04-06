package com.example.qbot;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class map_fragment extends Fragment implements OnMapReadyCallback {

    GoogleMap mMap;
    MapView mMapView;
    View mView;

    public map_fragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_map_fragment, container, false);
        return mView;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mMapView = (MapView) mView.findViewById(R.id.map);
        if (mMapView != null) {
            mMapView.onCreate(null);
            mMapView.onResume();
            mMapView.getMapAsync(this);

        }
    }

    public void onMapReady(GoogleMap googleMap) {
        MapsInitializer.initialize(getContext());

        /*mMap = googleMap;
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        googleMap.addMarker(new MarkerOptions().position(new LatLng(40.689021, 74.021552)).title("marker ") .snippet("I hope to go there "));
*/
        LatLng Depstar = new LatLng(22.600724, 72.820281);
        googleMap.addMarker(new MarkerOptions().position(Depstar).title("Marker in DEPSTAR").icon(BitmapDescriptorFactory.fromResource(R.drawable.depstar1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Depstar, 17F));
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(Depstar));
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(Depstar));

        LatLng BCA = new LatLng(22.603456, 72.818398);
        googleMap.addMarker(new MarkerOptions().position(BCA).title("Marker in CMPICA").icon(BitmapDescriptorFactory.fromResource(R.drawable.cmpica1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(BCA, 17F));

        LatLng I2IM = new LatLng(22.600093, 72.820796);
        googleMap.addMarker(new MarkerOptions().position(I2IM).title("Marker in I2IM").icon(BitmapDescriptorFactory.fromResource(R.drawable.i2im1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(I2IM, 17F));

        LatLng RPCP = new LatLng(22.599348, 72.819391);
        googleMap.addMarker(new MarkerOptions().position(RPCP).title("Marker in RPCP").icon(BitmapDescriptorFactory.fromResource(R.drawable.rpcp1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(RPCP, 17F));

        LatLng CH = new LatLng(22.602693, 72.821478);
        googleMap.addMarker(new MarkerOptions().position(CH).title("Marker in Charusat hospital").icon(BitmapDescriptorFactory.fromResource(R.drawable.ch1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CH, 17F));

        LatLng PDPIAS = new LatLng(22.601762, 72.819670);
        googleMap.addMarker(new MarkerOptions().position(PDPIAS).title("Marker in PDPIAS").icon(BitmapDescriptorFactory.fromResource(R.drawable.pdpias1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(PDPIAS, 17F));

        LatLng mainenterence = new LatLng(22.597906, 72.821546);
        googleMap.addMarker(new MarkerOptions().position(mainenterence).title("Main Enternance").icon(BitmapDescriptorFactory.fromResource(R.drawable.charusat1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mainenterence, 17F));

        LatLng Cricket = new LatLng(22.598870, 72.821975);
        googleMap.addMarker(new MarkerOptions().position(Cricket).title("Cricket Ground"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Cricket, 17F));

        LatLng Volly = new LatLng(22.599747, 72.820981);
        googleMap.addMarker(new MarkerOptions().position(Volly).title("VollyBall Ground"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Volly, 17F));

        LatLng CSPITEC = new LatLng(22.600150, 72.819296);
        googleMap.addMarker(new MarkerOptions().position(CSPITEC).title("Marker in CSPIT(EC/EE)").icon(BitmapDescriptorFactory.fromResource(R.drawable.cspit1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CSPITEC, 17F));

        LatLng CSPITML = new LatLng(22.599516, 72.817903);
        googleMap.addMarker(new MarkerOptions().position(CSPITML).title("Marker in CSPIT(ML/CL)").icon(BitmapDescriptorFactory.fromResource(R.drawable.cspit1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CSPITML, 17F));

        LatLng ARIP = new LatLng(22.603106, 72.820256);
        googleMap.addMarker(new MarkerOptions().position(ARIP).title("Marker in ARIP").icon(BitmapDescriptorFactory.fromResource(R.drawable.arip1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ARIP, 17F));

        LatLng CIN = new LatLng(22.603760, 72.820861);
        googleMap.addMarker(new MarkerOptions().position(CIN).title("Marker in Institute of Nursing").icon(BitmapDescriptorFactory.fromResource(R.drawable.mtin1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(CIN, 17F));

        LatLng GH = new LatLng(22.601087, 72.818238);
        googleMap.addMarker(new MarkerOptions().position(GH).title("Marker in Girls Hostel"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(GH, 17F));

        LatLng Admin = new LatLng(22.599670, 72.820494);
        googleMap.addMarker(new MarkerOptions().position(Admin).title("Marker in Admin").icon(BitmapDescriptorFactory.fromResource(R.drawable.charusat1)));
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Admin, 17F));
    }
}