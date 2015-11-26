package com.example.boasvindas;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;

public class TelaAberturaSplashActivity extends Activity implements Runnable {

	private final int DURACAO_SPLASH_SCREEN = 900;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

		Handler hand = new Handler();
		hand.postDelayed(this, DURACAO_SPLASH_SCREEN);
	}

	public void run() {
		Intent i = new Intent(this, AvaliarActivity.class);
		startActivity(i);
		finish();
	}
}
