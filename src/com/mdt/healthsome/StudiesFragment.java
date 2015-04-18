package com.mdt.healthsome;


import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class StudiesFragment extends Fragment {
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_studies, container, false);
        
        ListView mainListView = (ListView) (rootView.findViewById( R.id.mainListView ));
        
        List<List<String>> items = new ArrayList<List<String>>();
        
        List<String> item1 = new ArrayList<String>();
        item1.add("Physical Activity");
        item1.add("Standford Medicine");
        item1.add("Last for 60 days");
        item1.add("Reward $50");
        List<String> item2 = new ArrayList<String>();
        item2.add("Dietary Behaviours");
        item2.add("UPMC");
        item2.add("Last for 30 days");
        item2.add("Reward $30");
        List<String> item3 = new ArrayList<String>();
        item3.add("Drug Use");
        item3.add("UPMC");
        item3.add("Last for 7 days");
        item3.add("Gift Cards");
        List<String> item4 = new ArrayList<String>();
        item4.add("Mental health");
        item4.add("Harvard School of Public Health");
        item4.add("Last for 14 days");
        item4.add("Gift Cards");
        List<String> item5 = new ArrayList<String>();
        item5.add("Alcohol Use");
        item5.add("Standford Medicine");
        item5.add("Last for 30 days");
        item5.add("Reward $25");
        List<String> item6 = new ArrayList<String>();
        item6.add("Diabetes Research Study");
        item6.add("Johns Hopkins University");
        item6.add("Last for 7 days");
        item6.add("Gift Cards");
        List<String> item7 = new ArrayList<String>();
        item7.add("Tobacco Use");
        item7.add("Harvard School of Public Health");
        item7.add("Last for 14 days");
        item7.add("Gift Cards");
        List<String> item8 = new ArrayList<String>();
        item8.add("MyHeart Counts");
        item8.add("University of Pittsburgh");
        item8.add("Last for 30 days");
        item8.add("Reward $25");
        
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);
        
        AdapterStudyList listadpter = new AdapterStudyList(getActivity(), R.layout.study_listview_item, items);
        mainListView.setAdapter(listadpter);
        mainListView.setOnItemClickListener(new OnItemClickListener(){


        	

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				

	        	Intent intent = new Intent(getActivity(),Study1Content.class);
	        	//based on item add info to intent
	        	startActivityForResult(intent, 0);
				
			}


        	});
        return rootView;
    }
}
