package com.example.mvpdemo;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
		//ActionBar settings
		ActionBar actionBar = getActionBar();
		actionBar.setCustomView(R.layout.bar_listview);
		actionBar.show();
		//Set event listeners
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
		startActivity(new Intent(this, ListActivity.class));
	}

	/**
	 * when called?
	 */
	@Override
	public void updateCalenderDate(String s) {
		mTopPresenter.updateCalendarDate();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		MenuItem item1 = menu.add(0, 0, 0, "item--1");
		MenuItem item2 = menu.add(0, 0, 0, "item--2");
		MenuItem item3 = menu.add(0, 0, 0, "item--3");
		item1.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		item2.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		item3.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);
		return true;
	}
	
}
