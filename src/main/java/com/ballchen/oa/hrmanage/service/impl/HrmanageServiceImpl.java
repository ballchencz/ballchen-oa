package com.ballchen.oa.hrmanage.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ballchen.oa.hrmanage.dao.IHrmanageDAO;
import com.ballchen.oa.hrmanage.model.UserBasic;
import com.ballchen.oa.hrmanage.service.IHrmanageService;

@Service
@Transactional
public class HrmanageServiceImpl implements IHrmanageService {
	
	@Autowired
	private IHrmanageDAO hrmanageDAO;
	
	@Override
	public void saveUserBasic(UserBasic userBasic) {
		this.hrmanageDAO.saveUserBasic(userBasic);
	}

	/*--------------------setter/getter---------------------------*/
	public IHrmanageDAO getHrmanageDAO() {
		return hrmanageDAO;
	}

	public void setHrmanageDAO(IHrmanageDAO hrmanageDAO) {
		this.hrmanageDAO = hrmanageDAO;
	}
	
	

}
