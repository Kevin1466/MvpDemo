package com.example.view;

public interface TopView {
	/**
	 * facade pattern for handling all Actionbar settings
	 */
	void initViews();
	void openDatePickerDialog();
	void startListActivity();
	void updateCalenderDate(String s);
}
