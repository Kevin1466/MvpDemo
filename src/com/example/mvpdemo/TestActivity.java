package com.example.mvpdemo;

import com.example.activity.IInfoView;
import com.example.bean.InfoBean;
import com.example.presenter.TestPresenter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends Activity implements IInfoView ,OnClickListener {
	
	private EditText mIDEdt, mNameEdt, mAddressEdt;
	private TextView mPersonInfoTv;
	private Button mStoreInfo, mReviewInfo;
	private TestPresenter presenter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		initData();
	}
	
	private void initData() {
		presenter = new TestPresenter(this);
		
		mIDEdt = (EditText) findViewById(R.id.edt_id);
		mNameEdt = (EditText) findViewById(R.id.edt_name);
		mAddressEdt = (EditText) findViewById(R.id.edt_address);
		mPersonInfoTv = (TextView) findViewById(R.id.tv_person_info);
		mStoreInfo = (Button) findViewById(R.id.btn_store_info);
		mReviewInfo = (Button) findViewById(R.id.btn_review_info);
		
		mStoreInfo.setOnClickListener(this);
		mReviewInfo.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		if(v.getId() == R.id.btn_store_info) {
			presenter.saveInfo(getInfo());
			Toast.makeText(getApplicationContext(), "Save Date Successed", 3000).show();
		} else if(v.getId() == R.id.btn_review_info) {
			presenter.getInfo();
		}
	}

	@Override
	public void setInfo(InfoBean infoBean) {
		StringBuilder builder = new StringBuilder();
		
		builder.append(infoBean.ID).append("\n");
		builder.append(infoBean.name).append("\n");
		builder.append(infoBean.address);
		mPersonInfoTv.setText(builder);
	}

	@Override
	public InfoBean getInfo() {
		InfoBean infoBean = new InfoBean();
		
		infoBean.ID = Long.valueOf(mIDEdt.getText().toString().trim());
		infoBean.name = mNameEdt.getText().toString().trim();
		infoBean.address = mAddressEdt.getText().toString().trim();
		return infoBean;
	}
	
}
