package com.ballchen.oa.hrmanage.dao;

import com.ballchen.oa.hrmanage.model.UserBasic;

/**
 * 人力资源管理DAO接口
 * @author ChenZhao
 *
 */
public interface IHrmanageDAO {
	
	/**
	 * 保存用户基本信息
	 * @param userBasic 用户基本信息
	 */
	public void saveUserBasic(UserBasic userBasic);
}
