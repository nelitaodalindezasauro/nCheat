package com.ngvj10.ncalc.matematica.area;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ngvj10.ncalc.R;

public class AreaTri extends Activity implements OnClickListener {

	EditText b;
	EditText h;
	TextView resultado;
	Button calcula;
	View view;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.areatri);

		b = (EditText) findViewById(R.id.bTri);
		h = (EditText) findViewById(R.id.hTri);
		resultado = (TextView) findViewById(R.id.resultadoTri);
		calcula = (Button) findViewById(R.id.calculaATri);

		calcula.setOnClickListener((android.view.View.OnClickListener) this);

		int r = (int) (Math.random() * 255);
		int g = (int) (Math.random() * 255);
		int b = (int) (Math.random() * 255);
		view = (View) findViewById(R.id.areadotriangulo);
		view.setBackgroundColor(Color.rgb(r, g, b));
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	public void onClick(View v) {

		if (calcula.getId() == ((Button) v).getId()) {

			int hO = Integer.parseInt((String) h.getText().toString());
			int bO = Integer.parseInt((String) b.getText().toString());

			double resultadoO = (bO*hO)/2;

			resultado.setText("Resultado: " + resultadoO);
		}
	}

}