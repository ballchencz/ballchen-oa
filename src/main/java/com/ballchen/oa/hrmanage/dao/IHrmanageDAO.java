package com.ballchen.oa.hrmanage.dao;

import java.util.List;
import java.util.Map;

import com.ballchen.oa.base.model.PageHelper;
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
	
	/**
	 * 根据参数获得用户基本信息列表
	 * @param hql 查询语句
	 * @param params 查询参数
	 * @return List<UserBasic> 返回列表
	 */
	public List<UserBasic> getUserBasicListByQueryParam(String hql,Map<String,Object> params,PageHelper pageHelper);
	/**
	 * 根据查询参数活的总数
	 * @param hql 查询语句
	 * @param queryMap 查询参数
	 * @return long 结果总数
	 */
	public long getUsersTotal(String hql,Map<String,Object> queryMap);
}
