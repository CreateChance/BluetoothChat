package com.example.android.Bluetoothchat;

import android.util.Log;

public class Debug {
	
	private static final boolean VERBOSE = false;
	
	private static final boolean DEBUG = true;
	
	private static final boolean INFO = true;
	
	private static final boolean WARNING = true;
	
	private static final boolean ERROR = true;
	
	public static void v(String TAG, String msg) {
		if (VERBOSE) {
			Log.v(TAG, msg);
		}
	}
	
	public static void d(String TAG, String msg) {
		if (DEBUG) {
			Log.d(TAG, msg);
		}
	}
	
	public static void i(String TAG, String msg) {
		if (INFO) {
			Log.i(TAG, msg);
		}
	}
	
	public static void w(String TAG, String msg) {
		if (WARNING) {
			Log.w(TAG, msg);
		}
	}
	
	public static void error(String TAG, String msg) {
		if (ERROR) {
			Log.e(TAG, msg);
		}
	}

}
