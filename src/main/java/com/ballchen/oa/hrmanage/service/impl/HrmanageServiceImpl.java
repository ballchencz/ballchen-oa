package com.ballchen.oa.hrmanage.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ballchen.oa.base.model.PageHelper;
import com.ballchen.oa.base.service.IBaseService;
import com.ballchen.oa.hrmanage.dao.IHrmanageDAO;
import com.ballchen.oa.hrmanage.model.UserBasic;
import com.ballchen.oa.hrmanage.service.IHrmanageService;

@Service
@Transactional
public class HrmanageServiceImpl implements IHrmanageService {
	
	@Autowired
	private IHrmanageDAO hrmanageDAO;
	@Autowired
	private IBaseService baseService;
	
	@Override
	public void saveUserBasic(UserBasic userBasic) {
		this.hrmanageDAO.saveUserBasic(userBasic);
	}
	@Override
	public List<UserBasic> getUserBasicByParam(UserBasic userBasic,PageHelper pageHelper) {
		String hql = "FROM UserBasic t";
		Map<String,Object> params = new HashMap<String,Object>(); 
		hql += this.baseService.whereHQL(userBasic, params);
		hql += this.baseService.orderHQL(pageHelper);
		return hrmanageDAO.getUserBasicListByQueryParam(hql, params, pageHelper);
	}
	
	@Override
	public long getUsersTotal(UserBasic userBasic,PageHelper pageHelper) {
		String hql = "SELECT COUNT(*) FROM UserBasic t";
		Map<String,Object> queryMap = new HashMap<String,Object>();
		hql += this.baseService.whereHQL(userBasic, queryMap);
		return hrmanageDAO.getUsersTotal(hql,queryMap);
	}
	/*--------------------setter/getter---------------------------*/
	public IHrmanageDAO getHrmanageDAO() {
		return hrmanageDAO;
	}

	public void setHrmanageDAO(IHrmanageDAO hrmanageDAO) {
		this.hrmanageDAO = hrmanageDAO;
	}
}
