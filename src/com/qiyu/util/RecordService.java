package com.qiyu.util;

import com.qiyu.sound.Recorder;
import com.qiyu.util.aidl.RecordInterface;
import com.qiyu.util.aidl.RecordInterface.Stub;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class RecordService extends Service{

	
	Recorder recorder = new Recorder(getApplicationContext());
	
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Deprecated
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		return super.onStartCommand(intent, flags, startId);
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
	}
	
	
	public RecordInterface.Stub recordConnection = new RecordInterface.Stub() {
		
		@Override
		public void stopRecord() throws RemoteException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void startRecord() throws RemoteException {
			// TODO Auto-generated method stub
			
		}
	};
	
	
}
