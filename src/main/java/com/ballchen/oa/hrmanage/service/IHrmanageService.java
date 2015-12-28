package com.ballchen.oa.hrmanage.service;

import com.ballchen.oa.hrmanage.model.UserBasic;

public interface IHrmanageService {
	
	/**
	 * 添加用户基本信息
	 * @param userBasic 用户基本信息
	 */
	public void saveUserBasic(UserBasic userBasic);
}
