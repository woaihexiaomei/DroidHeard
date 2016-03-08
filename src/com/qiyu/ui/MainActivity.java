package com.qiyu.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import cn.jpush.android.api.JPushInterface;

import com.qiyu.droidheard.R;

public class MainActivity extends Activity{

	Button btn;
	
	Context sInstance;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		sInstance = this;
		
		btn = (Button) findViewById(R.id.btn);
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				JPushInterface.init(sInstance);
			}
		});
		
		 
		
		
		
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		
		JPushInterface.onPause(sInstance);
	
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		
		JPushInterface.onResume(sInstance);
	
	}
	
	
}
