package com.qiyu.util.receive;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import cn.jpush.android.api.JPushInterface;

import com.qiyu.util.RecorderService;
import com.qiyu.util.aidl.RecordInterface;

public class RecordReceive extends BroadcastReceiver {

	static RecordInterface recordInterface;

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub

		Log.e("innog", "-----------------------");

		String action = intent.getAction();

		Bundle bundle = intent.getExtras();

		if (action.equals(JPushInterface.ACTION_MESSAGE_RECEIVED)) {

			String message = bundle.getString(JPushInterface.EXTRA_MESSAGE);

			

			if (null == recordInterface) {

				Log.e("innog", "--interface----是空");
				
				connectService(context);

			}

			if (message.equals("start")) {

				if (null != recordInterface) {

					try {
						recordInterface.startRecord();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			} else if (message.equals("stop")) {

				if (null != recordInterface) {

					try {
						recordInterface.stopRecord();
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			} else if (message.equals("startservice")) {

				Intent intent2 = new Intent(context, RecorderService.class);
				intent2.putExtra(RecorderService.ACTION_NAME,
						RecorderService.ACTION_DISABLE_MONITOR_REMAIN_TIME);
				context.startService(intent2);

			}

		}

	}

	public void connectService(Context mContext) {

		Intent intent = new Intent(mContext, RecorderService.class);
		mContext.getApplicationContext().bindService(intent, serviceConnection,
				Context.BIND_AUTO_CREATE);

	}

	ServiceConnection serviceConnection = new ServiceConnection() {

		@Override
		public void onServiceDisconnected(ComponentName name) {
			// TODO Auto-generated method stub
			Log.e("innog", "断开连接了");
		}

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			// TODO Auto-generated method stub
			
			recordInterface = RecordInterface.Stub.asInterface(service);
			Log.e("innog", "connect service-------------------"+recordInterface);
		}
	};

}
