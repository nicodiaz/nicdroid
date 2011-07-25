package com.example.hellol10n;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HelloL10N extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Button b = null;

		(b = (Button) findViewById(R.id.flag_button)).setBackgroundDrawable(this.getResources().getDrawable(
				R.drawable.flag));

		AlertDialog.Builder builder = new AlertDialog.Builder(this);

		builder.setMessage(R.string.dialog_text).setCancelable(false).setTitle(R.string.dialog_title)
				.setPositiveButton("Done", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which)
					{
						dialog.dismiss();
					}
				});

		final AlertDialog alert = builder.create();

		b.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v)
			{
				alert.show();
			}
		});
	}
}