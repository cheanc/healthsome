package com.mdt.healthsome;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
public class SettingFragment extends Fragment {
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_setting, container, false);
        
        ListView mainListView = (ListView) (rootView.findViewById( R.id.settingListView ));
        
        List<List<String>> items = new ArrayList<List<String>>();
        
        List<String> item1 = new ArrayList<String>();
        item1.add("Privacy");
        
        items.add(item1);
        
        AdapterSetting listadpter = new AdapterSetting(getActivity(), R.layout.privacy, items);
        mainListView.setAdapter(listadpter);
        return rootView;
    }
}