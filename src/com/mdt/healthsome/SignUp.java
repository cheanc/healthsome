package com.mdt.healthsome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class SignUp extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up);
	
	
		Button signupButton = (Button)findViewById(R.id.sign_up);
		
		signupButton.setOnClickListener(new OnClickListener(){
			public void onClick(View viewParam) {
				TextView username = (TextView)findViewById(R.id.username);
        		TextView password = (TextView)findViewById(R.id.password);
        		TextView email = (TextView)findViewById(R.id.email);
        		username.setText("");
        		password.setText("");
        		email.setText("");	
			}
	     });
		 
		Button cancelButton = (Button)findViewById(R.id.cancel);
		 
		cancelButton.setOnClickListener(new OnClickListener(){
        	public void onClick(View viewParam) {
        		Intent i = new Intent(getApplicationContext(), LogIn.class);
                startActivity(i);
        	}
		});
	}
}
