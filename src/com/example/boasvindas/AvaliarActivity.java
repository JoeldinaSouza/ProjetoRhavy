package com.example.boasvindas;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class AvaliarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activiy_individual);
		
		Button button = (Button) findViewById(R.id.Button01);
        button.setOnClickListener(new NotificationOnClic());
	}
	
	public void avaliar(View v){
		Log.i("SEU NOME", "BOTAO");
	}
	
	
}
