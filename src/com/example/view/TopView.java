package com.example.view;

public interface TopView {
	/**
	 * facade pattern for handling all ActionBar settings
	 */
	void initViews();
	void openDatePickerDialog();
	void startListActivity();
	void updateCalenderDate(String s);
}
