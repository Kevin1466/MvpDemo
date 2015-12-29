package com.example.model;

import com.example.bean.InfoBean;

public class InfoModelImpl implements IInfoMode {
	
	//simulated data
	private InfoBean infoBean = new InfoBean();

	@Override
	public InfoBean getInfo() {
		return infoBean;
	}

	@Override
	public void setInfo(InfoBean infoBean) {
		this.infoBean = infoBean;
	}

}
