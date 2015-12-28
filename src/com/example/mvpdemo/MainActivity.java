package com.example.mvpdemo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.Bind;
import butterknife.ButterKnife;

import com.example.presenter.TopPresenter;
import com.example.view.TopView;

public class MainActivity extends Activity implements TopView {
	
	@Bind(R.id.calendar_title)
	TextView mCalenderTitle;
	
	private TopPresenter mTopPresenter;
	private DatePickerFragment mDatePickerFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ButterKnife.bind(this);
		
		//Save TopPresenter instance in a member variable field
		mTopPresenter = new TopPresenter();
		mTopPresenter.onCreate(this);
	}

	//when called???
	@Override
	public void initViews() {
		setContentView(R.layout.activity_main);
		mDatePickerFragment = new DatePickerFragment();
	}

	@SuppressLint("NewApi")
	@Override
	public void openDatePickerDialog() {
		DatePickerFragment.newInstance().show(getFragmentManager(), DatePickerFragment.TAG);
		//do not write logic here, all logic must be passed to the Presenter
		mTopPresenter.updateCalendarDate();
	}

	@Override
	public void startListActivity() {
		
	}

	/**
	 * when called?
	 */
	@Override
	public void updateCalenderDate(String s) {
		mTopPresenter.updateCalendarDate();
	}
	
}
