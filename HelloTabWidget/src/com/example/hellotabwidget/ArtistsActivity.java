package com.example.hellotabwidget;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ArtistsActivity extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		TextView textView = new TextView(this);
		textView.setText("This is the artists Tab");
		setContentView(textView);
	}
}