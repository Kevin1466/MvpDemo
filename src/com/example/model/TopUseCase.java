package com.example.model;

import android.content.res.Resources;

/**
 * Model? Entity?
 * Can be applied unit test, cus it segregates view and business logic
 * @author renguangkai
 *
 */
public class TopUseCase {
	
	private String date;
	
	public String getDateToDisplay(Resources res) {
		return res.toString();
	}
	
	/**
	 * hide the detail of TopPresenter
	 */
	public void saveCalenderDate() {
		date = getDateToDisplay(null);
	}
}
