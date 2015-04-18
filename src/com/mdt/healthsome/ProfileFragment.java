package com.mdt.healthsome;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProfileFragment extends Fragment {

	View rootView;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
		rootView = inflater.inflate(R.layout.fragment_profile, container, false);
		ProgressBar progressBar1 = (ProgressBar) rootView.findViewById(R.id.progressBar1);
		progressBar1.setProgress(66);
		ProgressBar progressBar2 = (ProgressBar) rootView.findViewById(R.id.progressBar2);
		progressBar2.setProgress(81);
		
		TextView signup = (TextView)rootView.findViewById(R.id.textView14);
		 
		 signup.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent i = new Intent(getActivity(), Survey.class);
		        startActivityForResult(i, 0);
			}
		 });
		 
		return rootView;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	@Override 
	public void onActivityResult(int requestCode, int resultCode, Intent data) {     
		super.onActivityResult(requestCode, resultCode, data); 
		CheckBox checkBox = (CheckBox) rootView.findViewById(R.id.checkBox1);
		checkBox.setChecked(true);
		checkBox.setClickable(false);
	}
}
