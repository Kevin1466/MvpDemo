package com.example.mvpdemo;

import java.io.ObjectInputStream.GetField;

import com.example.view.TopView;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.DatePicker;

@SuppressLint("NewApi")
public class DatePickerFragment extends Fragment implements TopView {
	
	public static final String TAG = "DatePickerFragment";
	private static DatePickerFragment mDatePickerFragment = null;
	private DatePickerDialog mDatePickerDialog = null;
	//initialize fragment
	public static DatePickerFragment newInstance() {
		if(mDatePickerFragment == null) {
			mDatePickerFragment = new DatePickerFragment();
		}
		return mDatePickerFragment;
	}
	
	public void show(FragmentManager fm, String s){
		FragmentTransaction ft = fm.beginTransaction();
		ft.add(this, TAG);		//??????
		ft.commit();
		mDatePickerDialog.show();
	}

	private int mYear, mMonthOfYear, mDayOfMonth;
	@Override
	public void initViews() {
//		mDatePickerDialog = new DatePickerDialog(getContext(), new MyOnDateSetListener(), mYear, mMonthOfYear, mDayOfMonth);
	}

	@Override
	public void openDatePickerDialog() {
		
	}

	@Override
	public void startListActivity() {
		
	}

	@Override
	public void updateCalenderDate(String s) {
		
	}
	
	class MyOnDateSetListener implements OnDateSetListener {

		@Override
		public void onDateSet(DatePicker view, int year, int monthOfYear,
				int dayOfMonth) {
			
		}
		
	}
	
}
