package com.ballchen.oa.hrmanage.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ballchen.oa.base.dao.IBaseDAO;
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

	/*---------------------setter/getter----------------------*/
	public IBaseDAO<UserBasic> getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(IBaseDAO<UserBasic> baseDAO) {
		this.baseDAO = baseDAO;
	}

	
}
