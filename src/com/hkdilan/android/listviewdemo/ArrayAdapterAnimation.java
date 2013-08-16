package com.hkdilan.android.listviewdemo;

import java.util.HashMap;
import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;

public class ArrayAdapterAnimation extends ArrayAdapter<String> {

	private HashMap<String, Integer> mIdMap = new HashMap<String, Integer>();
	
	public ArrayAdapterAnimation(Context context, int resource,
			List<String> objects) {
		super(context, resource, objects);
	}

}
