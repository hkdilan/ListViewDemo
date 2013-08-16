package com.hkdilan.android.listviewdemo;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class AnimationDemo extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.animation);
		
		//get list view from layout
		final ListView listView = (ListView) findViewById(R.id.listView1);
		
		//create string array for list view items
		final String[] values = new String[] {"Android", "iPhone", "WindowsMobile", "Blackberry"};
		
		//create arraylist
		final ArrayList<String> list = new ArrayList<String>(Arrays.asList(values));
	}
}
