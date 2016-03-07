package com.qiyu.util.receive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class RecordReceive extends BroadcastReceiver{

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		
		String action = arg1.getAction();
		
		Log.e("innog", "action"+action);
		
	}

	
	
	
}
