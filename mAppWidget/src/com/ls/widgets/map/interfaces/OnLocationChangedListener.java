package com.ls.widgets.map.interfaces;

import com.ls.widgets.map.MapWidget;

import android.location.Location;

public interface OnLocationChangedListener
{
    public void onLocationChanged(MapWidget v, Location location);
}
