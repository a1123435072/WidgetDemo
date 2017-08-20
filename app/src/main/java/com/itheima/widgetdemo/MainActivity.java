package com.itheima.widgetdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
	//笔记:
	//自定义控件:android本身没有提供,需要开发者自定定义设计的控件
	//1,继承已有控件:例如Button继承TextView
	//2,继承View
	//3,继承ViewGroup
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
}
