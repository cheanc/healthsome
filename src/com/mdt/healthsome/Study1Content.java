package com.mdt.healthsome;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.graphics.Color;

public class Study1Content extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_study1_content);
	
	
		Button joinStudyButton = (Button)findViewById(R.id.join_study);
		
		joinStudyButton.setOnClickListener(new OnClickListener(){
	        	public void onClick(View viewParam) {
	        		Button thisButton = (Button)findViewById(R.id.join_study);
	        		thisButton.setBackgroundColor(Color.parseColor("#63D1F4"));
	        		thisButton.setText("Joined");
	        		thisButton.setClickable(false);
	        		finish();
	        	}
	     });
		 
	}
}
