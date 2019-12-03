package com.ao.testmockito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


	}

	Context mContext;

	public MainActivity(Context mContext) {
		this.mContext = mContext;
	}


	public String getHelloWorldString() {
		return mContext.getString(R.string.app_name);

	}
}
