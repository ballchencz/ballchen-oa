package com.ballchen.oa.account.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ballchen.oa.base.consts.BaseConsts;
import com.ballchen.oa.base.model.BaseModel;

/**
 * 账户实体类
 * @author ChenZhao
 *
 */
@Entity
@Table(name=BaseConsts.BASE_TABLE_NAME+"ACCOUNT")
public class Account extends BaseModel{
	
	/**
	 * 账户名
	 */
	@Column(name="ACCOUNT_NAME",length=50,nullable=false)
	private String accoundName;
	
	/**
	 * 账户密码
	 */
	@Column(name="PASSWORD",length=50,nullable=false)
	private String password;
	
	/**
	 * 备注
	 */
	@Column(name="MARK",length=500)
	private String mark;
}
