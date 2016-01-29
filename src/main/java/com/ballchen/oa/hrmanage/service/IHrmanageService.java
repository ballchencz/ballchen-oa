package com.ballchen.oa.hrmanage.service;

import java.util.List;

import com.ballchen.oa.base.model.PageHelper;
import com.ballchen.oa.hrmanage.model.UserBasic;

public interface IHrmanageService {
	
	/**
	 * 添加用户基本信息
	 * @param userBasic 用户基本信息
	 */
	public void saveUserBasic(UserBasic userBasic);
	
	/**
	 * 根据参数获得用户信息列表
	 * @param userBasic 用户信息
	 * @return List<UserBasic>
	 */
	public List<UserBasic> getUserBasicByParam(UserBasic userBasic,PageHelper pageHelper);
	
	/**
	 * 根据查询参数获得总记录数
	 * @param userBasic 用户对象
	 * @return long 总记录数
	 */
	public long getUsersTotal(UserBasic userBasic,PageHelper pageHelper);
}
