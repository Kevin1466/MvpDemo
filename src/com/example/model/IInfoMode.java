package com.example.model;

import com.example.bean.InfoBean;

/**
 * mainly interact with data provider
 * @author renguangkai
 *
 */
public interface IInfoMode {
	//get data from data provider
	InfoBean getInfo();
	//store date in data provider
	void setInfo(InfoBean info);
}
