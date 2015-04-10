package com.mdt.healthsome;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class LogIn extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log_in);
	
	
		Button signinButton = (Button)findViewById(R.id.sign_in);
		
		 signinButton.setOnClickListener(new OnClickListener(){
	        	public void onClick(View viewParam) {
	        		TextView username = (TextView)findViewById(R.id.username);
	        		TextView password = (TextView)findViewById(R.id.password);
	        		if ((username.getText().toString().equals("vibs")) && (password.getText().toString().equals("mdt"))){
	        			Intent i = new Intent(LogIn.this, MainActivity.class);
	        	        startActivity(i);
	        		}
	        		username.setText("");
	        		password.setText("");
	        	}
	     });
		 
		 TextView signup = (TextView)findViewById(R.id.sign_up);
		 
		 signup.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent i = new Intent(LogIn.this, SignUp.class);
		        startActivity(i);
			}
		 });
	}
}
