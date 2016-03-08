package com.qiyu.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import cn.jpush.android.api.JPushInterface;

import com.qiyu.droidheard.R;

public class MainActivity extends Activity{

	Button btn;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
		
		btn = (Button) findViewById(R.id.btn);
		
		btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				JPushInterface.init(getApplicationContext());
			}
		});
		
		 
		
		
		
	}
	
	
	
}
