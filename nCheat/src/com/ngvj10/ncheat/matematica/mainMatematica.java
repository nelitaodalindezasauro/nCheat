package com.ngvj10.ncheat.matematica;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.ngvj10.ncheat.R;

public class mainMatematica extends Activity implements OnClickListener {

	Button deltaBaskhara;
	Button Baskhara;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.matematica);

		deltaBaskhara = (Button) findViewById(R.id.delta_baskhara);
		Baskhara = (Button) findViewById(R.id.baskhara);

		deltaBaskhara
				.setOnClickListener((android.view.View.OnClickListener) this);
		Baskhara.setOnClickListener((android.view.View.OnClickListener) this);

	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {

		if (deltaBaskhara.getId() == ((Button) v).getId()) {
			startActivity(new Intent(this, deltaBaskhara.class));
		}
		if (Baskhara.getId() == ((Button) v).getId()) {
			startActivity(new Intent(this, Baskhara.class));
		}
	}

}