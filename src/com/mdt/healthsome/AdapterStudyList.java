package com.mdt.healthsome;

import java.util.List;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterStudyList extends ArrayAdapter<List<String>> {

	private List<List<String>> contents;
	private Resources myres;
	public AdapterStudyList(Context context, int resource,
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
	        v = vi.inflate(R.layout.study_listview_item, null);
	    }
	    List<String> item = contents.get(position);
	    

	    if (item != null) {
	    	TextView titleView = (TextView) v.findViewById(R.id.title);
	    	TextView subView = (TextView) v.findViewById(R.id.subTitle);
	    	TextView calendarView = (TextView) v.findViewById(R.id.days);
	    	TextView rewardView = (TextView) v.findViewById(R.id.reward);
	    	ImageView image = (ImageView)v.findViewById(R.id.iViewThumb);
	        titleView.setText(item.get(0));
	        subView.setText(item.get(1));
	        calendarView.setText(item.get(2));
	        rewardView.setText(item.get(3));
	        switch(position){
	        	case 0:
	        		image.setImageBitmap(decodeSampledBitmapFromResource(myres, R.drawable.exercisecropped, 100, 100));
	        		break;	
	        	case 1:
	        		image.setImageBitmap(decodeSampledBitmapFromResource(myres, R.drawable.dietarycropped, 100, 100));
	        		break;
	        	case 2:
	        		image.setImageBitmap(decodeSampledBitmapFromResource(myres, R.drawable.drugcropped, 100, 100));
	        		break;
	        	case 3:
	        		image.setImageBitmap(decodeSampledBitmapFromResource(myres, R.drawable.mentalcropped, 100, 100));
	        		break;
	        	case 4:
	        		image.setImageBitmap(decodeSampledBitmapFromResource(myres, R.drawable.alcoholcropped, 100, 100));
	        		break;
	        	case 5:
	        		image.setImageBitmap(decodeSampledBitmapFromResource(myres, R.drawable.diabetescropped, 100, 100));
	        		break;
	        	case 6:
	        		image.setImageBitmap(decodeSampledBitmapFromResource(myres, R.drawable.tobaccocropped, 100, 100));        	
	        		break;
	        	case 7:
	        		image.setImageBitmap(decodeSampledBitmapFromResource(myres, R.drawable.heartcropped, 100, 100));
	        		break;
	        }
	    }
	    return v;
	}
	
	static Bitmap decodeSampledBitmapFromResource(Resources res, int resId, int reqWidth, int reqHeight) {
		// First decode with inJustDecodeBounds=true to check dimensions
		final BitmapFactory.Options options = new BitmapFactory.Options();
		options.inJustDecodeBounds = true;
		BitmapFactory.decodeResource(res, resId, options);
		// Calculate inSampleSize
		options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);
		// Decode bitmap with inSampleSize set
		options.inJustDecodeBounds = false;
		return BitmapFactory.decodeResource(res, resId, options);
	}
	
	//Given the bitmap size and View size calculate a subsampling size (powers of 2) 
		static int calculateInSampleSize( BitmapFactory.Options options, int reqWidth, int reqHeight) {
		    int inSampleSize = 1;	//Default subsampling size
		    // See if image raw height and width is bigger than that of required view
		    if (options.outHeight > reqHeight || options.outWidth > reqWidth) {
		    	//bigger
		        final int halfHeight = options.outHeight / 2;
		        final int halfWidth = options.outWidth / 2;
		        // Calculate the largest inSampleSize value that is a power of 2 and keeps both
		        // height and width larger than the requested height and width.
		        while ((halfHeight / inSampleSize) > reqHeight
		                && (halfWidth / inSampleSize) > reqWidth) {
		            inSampleSize *= 2;
		        }
		    }
		    return inSampleSize;
		}

}
