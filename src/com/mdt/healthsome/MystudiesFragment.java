package com.mdt.healthsome;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class MystudiesFragment extends Fragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fragment_mystudies,
				container, false);

		ListView ongoingListView = (ListView) (rootView
				.findViewById(R.id.goingListView));
		ListView completedListView = (ListView) (rootView
				.findViewById(R.id.completedListView));

		List<List<String>> ongoingItems = new ArrayList<List<String>>();
		List<List<String>> completedItems = new ArrayList<List<String>>();

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

		ongoingItems.add(item1);
		ongoingItems.add(item2);
		completedItems.add(item3);

		AdapterOngoingList goinglistadpter = new AdapterOngoingList(
				getActivity(), R.layout.study_listview_item, ongoingItems);
		AdapterOngoingList completedlistadpter = new AdapterOngoingList(
				getActivity(), R.layout.study_listview_item, completedItems);
		ongoingListView.setAdapter(goinglistadpter);
		ongoingListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				Intent intent = new Intent(getActivity(), Study1Content.class);
				// based on item add info to intent
				startActivityForResult(intent, 0);

			}

		});
		completedListView.setAdapter(completedlistadpter);
		completedListView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {

				Intent intent = new Intent(getActivity(), Study1Content.class);
				// based on item add info to intent
				startActivityForResult(intent, 0);

			}

		});
		return rootView;
	}
}
