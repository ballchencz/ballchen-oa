package com.ballchen.oa.hrmanage.dao.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ballchen.oa.base.dao.IBaseDAO;
import com.ballchen.oa.base.model.PageHelper;
import com.ballchen.oa.hrmanage.dao.IHrmanageDAO;
import com.ballchen.oa.hrmanage.model.UserBasic;

/**
 * 人力资源管理DAO实现类
 * @author ChenZhao
 *
 */
@Repository
public class HrmanageDAOImpl implements IHrmanageDAO {

	@Autowired
	private IBaseDAO<UserBasic> baseDAO;
	
	@Override
	public void saveUserBasic(UserBasic userBasic) {
		baseDAO.save(userBasic);
	}
	
	@Override
	public List<UserBasic> getUserBasicListByQueryParam(String hql, Map<String, Object> params,PageHelper pageHelper) {
		List<UserBasic> array = null;
		if(null!=params && !params.isEmpty()){			
			array =  baseDAO.find(hql,params, pageHelper.getPage(), pageHelper.getRows());
		}else{
			array = baseDAO.find(hql,pageHelper.getPage(),pageHelper.getRows());
		}
		return array;
	}
	@Override
	public long getUsersTotal(String hql,Map<String,Object> queryMap) {
		long count = 0;
		if(!queryMap.isEmpty()){			
			count = baseDAO.count(hql,queryMap);
		}else{
			count = baseDAO.count(hql);
		}
		return count;
	}
	/*---------------------setter/getter----------------------*/
	public IBaseDAO<UserBasic> getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(IBaseDAO<UserBasic> baseDAO) {
		this.baseDAO = baseDAO;
	}
}
