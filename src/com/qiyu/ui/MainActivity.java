package com.qiyu.ui;

import com.baidu.android.pushservice.PushConstants;
import com.baidu.android.pushservice.PushManager;
import com.qiyu.droidheard.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

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
		
				PushManager.startWork(getApplicationContext(), PushConstants.LOGIN_TYPE_API_KEY, "{HFno9tx9U6EOEThmuvubRvVj}");		
				
			}
		});
		
		 
		
		
		
	}
	
	
	
}
