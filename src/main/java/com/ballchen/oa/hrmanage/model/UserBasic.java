package com.ballchen.oa.hrmanage.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.ballchen.oa.base.model.BaseModel;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 用户基本表
 * @author ChenZhao
 */
@Entity
@Table(name="BALLCHEN_T_USER_BASIC")
public class UserBasic extends BaseModel{
	
	/**
	 * 用户名
	 */
	@Column(name="USER_NAME",length=200,nullable=false)
	private String userName;
	
	/**
	 * 用户性别（0.女,1.男）
	 */
	@Column(name="USER_SEX",nullable=false,columnDefinition="INT default 0")
	private Integer userSex;
	
	/**
	 * 身份证号码
	 */
	@Column(name="ID_NUM",nullable=false,length=30)
	private String idNum;
	
	/**
	 * 出生日期
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDAY", length = 7)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	
	/**
	 * 婚姻状况 0、未婚；1、已婚；2。离异；3.丧偶
	 */
	@Column(name = "MARITAL_STATUS",columnDefinition="INT default 0")
	private Integer maritalStatus;
	
	/**
	 * 民族（）
	 */
	@Column(name = "NATION", precision = 2, scale = 0)
	private Integer nation;
	/**
	 * 籍贯
	 */
	@Column(name = "NATIVE_PLACE", length = 200)
	private String nativePlace;
	/**
	 * 政治面貌 0。群众；1.团员；2.党员；3.其它
	 */
	@Column(name = "POLITICAL_STATUS", precision = 2, scale = 0)
	private Integer politicalStatus;
	/**
	 * 个人电话
	 */
	@Column(name = "PHONE", length = 30)
	private String phone;
	/**
	 * 电子邮箱
	 */
	@Column(name = "EMAIL", length = 200)
	private String email;
	/**
	 * 备注
	 */
	@Column(name = "EMAIL", length = 500)
	private String mark;
	
	/*----------------------setter/getter方法-------------------------------*/
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getUserSex() {
		return userSex;
	}
	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(Integer maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public Integer getNation() {
		return nation;
	}
	public void setNation(Integer nation) {
		this.nation = nation;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public Integer getPoliticalStatus() {
		return politicalStatus;
	}
	public void setPoliticalStatus(Integer politicalStatus) {
		this.politicalStatus = politicalStatus;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	
	

}
