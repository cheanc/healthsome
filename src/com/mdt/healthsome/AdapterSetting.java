package com.mdt.healthsome;
import java.util.List;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class AdapterSetting extends ArrayAdapter<List<String>> {
	private List<List<String>> contents;
	private Resources myres;
	public AdapterSetting(Context context, int resource,
			 List<List<String>> objects) {
		super(context, resource, objects);
		myres = context.getResources();
		
		contents = objects;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
	    View v = convertView;
	    if (v == null) {
	        LayoutInflater vi;
	        vi = LayoutInflater.from(getContext());
	        v = vi.inflate(R.layout.privacy, null);
	    }
	    List<String> item = contents.get(position);
	    
	    if (item != null) {
	    	TextView titleView = (TextView) v.findViewById(R.id.privacyText);
	    	titleView.setText(item.get(0));
	    }
	    return v;
	}
}