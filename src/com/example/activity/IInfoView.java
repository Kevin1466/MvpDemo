package com.example.activity;

import com.example.bean.InfoBean;

public interface IInfoView {
	//bind data to UI
	void setInfo(InfoBean infoBean);
	//get data from UI
	InfoBean getInfo();
}
