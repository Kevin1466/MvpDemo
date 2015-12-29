package com.example.presenter;

import com.example.activity.IInfoView;
import com.example.bean.InfoBean;
import com.example.model.IInfoMode;
import com.example.model.InfoModelImpl;

/**
 * in charge for connecting UI and data logic
 * @author renguangkai
 *
 */
public class TestPresenter {
	
	private IInfoMode infoMode;
	private IInfoView infoView;
	
	public TestPresenter(IInfoView infoView) {
		this.infoView = infoView;
		infoMode = new InfoModelImpl();
	}
	
	//be called by UI
	public void saveInfo(InfoBean infoBean) {
		infoMode.setInfo(infoBean);
	}
	
	//be called by UI
	public void getInfo() {
		infoView.setInfo(infoMode.getInfo());
	}
}
