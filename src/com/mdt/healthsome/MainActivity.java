package com.mdt.healthsome;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity{
	
	StudiesFragment fragmentTab1 = new StudiesFragment();
	MystudiesFragment fragmentTab2 = new MystudiesFragment();
	ProfileFragment fragmentTab3 = new ProfileFragment();
	
	TabHost tab;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    tab = (TabHost)this.findViewById(android.R.id.tabhost);
	    createTab();
	}

	private void createTab() {
		
		TabHost.TabSpec tab1Spec = tab.newTabSpec("tab1");
	    tab1Spec.setIndicator("TAB 1");
	    Intent p = new Intent(this, ProfileFragment.class);
	    tab1Spec.setContent(p);

	    TabHost.TabSpec tab2Spec = tab.newTabSpec("tab2");
	    tab2Spec.setIndicator("TAB 2");
	    Intent p2 = new Intent(this, StudiesFragment.class);
	    tab2Spec.setContent(p2);

	    tab.addTab(tab1Spec);
	    tab.addTab(tab2Spec);
	}
}
