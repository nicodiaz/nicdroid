package com.example.hellotabwidget;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class HelloTabWidget extends TabActivity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Resources res = getResources();
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec = null;
		Intent intent = null;
		
		intent = new Intent().setClass(this, ArtistsActivity.class);
		
		spec = tabHost.newTabSpec("artists")
						.setIndicator("Artists", res.getDrawable(R.drawable.ic_tab_artists))
						.setContent(intent);
		tabHost.addTab(spec);

	    // Do the same for the other tabs
	    intent = new Intent().setClass(this, AlbumsActivity.class);
	    spec = tabHost.newTabSpec("albums").setIndicator("Albums",
	                      res.getDrawable(R.drawable.ic_tab_artists))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    intent = new Intent().setClass(this, SongsActivity.class);
	    spec = tabHost.newTabSpec("songs").setIndicator("Songs",
	                      res.getDrawable(R.drawable.ic_tab_artists))
	                  .setContent(intent);
	    tabHost.addTab(spec);

	    tabHost.setCurrentTab(2);
		
	}

}
