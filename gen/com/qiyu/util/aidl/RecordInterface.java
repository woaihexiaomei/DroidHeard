/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\workshop4\\DroidHeard\\src\\com\\qiyu\\util\\aidl\\RecordInterface.aidl
 */
package com.qiyu.util.aidl;
public interface RecordInterface extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.qiyu.util.aidl.RecordInterface
{
private static final java.lang.String DESCRIPTOR = "com.qiyu.util.aidl.RecordInterface";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.qiyu.util.aidl.RecordInterface interface,
 * generating a proxy if needed.
 */
public static com.qiyu.util.aidl.RecordInterface asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.qiyu.util.aidl.RecordInterface))) {
return ((com.qiyu.util.aidl.RecordInterface)iin);
}
return new com.qiyu.util.aidl.RecordInterface.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_startRecord:
{
data.enforceInterface(DESCRIPTOR);
this.startRecord();
reply.writeNoException();
return true;
}
case TRANSACTION_stopRecord:
{
data.enforceInterface(DESCRIPTOR);
this.stopRecord();
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.qiyu.util.aidl.RecordInterface
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public void startRecord() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startRecord, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopRecord() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopRecord, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_startRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_stopRecord = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public void startRecord() throws android.os.RemoteException;
public void stopRecord() throws android.os.RemoteException;
}
