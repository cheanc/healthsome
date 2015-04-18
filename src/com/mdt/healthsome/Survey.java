package com.mdt.healthsome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Survey extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_survey);
		
		SeekBar seekBar1 = (SeekBar) findViewById(R.id.seekBar1);
		seekBar1.setMax(8);
		SeekBar seekBar2 = (SeekBar) findViewById(R.id.seekBar2);
		seekBar2.setMax(8);
		
		Button submitButton = (Button) findViewById(R.id.submit);
		
		submitButton.setOnClickListener(new OnClickListener(){
        	public void onClick(View viewParam) {
        		setResult(Activity.RESULT_OK, new Intent());
        		finish();
        	}
     });
	}
}
