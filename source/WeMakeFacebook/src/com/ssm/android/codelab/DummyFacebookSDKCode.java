package com.ssm.android.codelab;

import android.util.Log;

import com.facebook.android.Facebook;

/*
 * This code will be build successfully, 
 * if Facebook SDK for Android library is successfully linked. 
 */
public class DummyFacebookSDKCode {

	private static final String TAG = "DummyFacebookSDKCode";

	static {
		Log.v(TAG, "Facebook SDK for Android is successfuly loaded: " + Facebook.class.getName());
	}

}//end class