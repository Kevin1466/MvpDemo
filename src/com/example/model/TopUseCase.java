package com.example.model;

import android.content.res.Resources;

/**
 * Model? Entity?
 * @author renguangkai
 *
 */
public class TopUseCase {
	
	private String date;
	
	public String getDateToDisplay(Resources res) {
		return res.toString();
	}
	
	public void saveCalenderDate() {
		date = getDateToDisplay(null);
	}
}
