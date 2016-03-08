package com.qiyu.util.receive;

import cn.jpush.a.a.ac;
import cn.jpush.android.api.JPushInterface;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class RecordReceive extends BroadcastReceiver{

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub
		
		Log.e("innog", "-----------------------");
		
		String action = intent.getAction();

		Bundle bundle = intent.getExtras();
		
		if (action.equals(JPushInterface.ACTION_MESSAGE_RECEIVED)) {
			
	        String message = bundle.getString(JPushInterface.EXTRA_MESSAGE);
			
	        Log.e("innog", "---"+message);
	        
	        if (message.equals("start")) {
				
			}else if (message.equals("stop")){
			
			}
	        
		}
		
		
	}



	
	
	
}
