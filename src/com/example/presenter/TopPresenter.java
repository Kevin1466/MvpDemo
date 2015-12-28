package com.example.presenter;

import android.content.Context;

import com.example.model.TopUseCase;
import com.example.view.TopView;

/**
 * all business logics must be delegate to TopPresenter
 * what important is Presenter connect only View and Model
 * @author renguangkai
 *
 */
public class TopPresenter {
	private Context mContext;
	private TopView mView;			//View
	private TopUseCase mUseCase;	//Model
	public TopPresenter() {
		mUseCase = new TopUseCase();
	}
	
	public void onCreate(TopView topView) {
		mView = topView;
		mView.initViews();
	}
	
	public void updateCalendarDate() {
		//do not forget to return if view instance is null
		if(mView == null) return;
		
		//here logic comes
		String dateToDisplay = mUseCase.getDateToDisplay(mContext.getResources());
		mView.updateCalenderDate(dateToDisplay);
		
		//here you save date, and this logic is hidden in Use Case class
		mUseCase.saveCalenderDate();
	}
}
