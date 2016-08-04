package com.ballchen.oa.base.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@MappedSuperclass
public class BaseModel implements Serializable {

	/**
	 * 主键ID
	 */
	@Id  
	@GeneratedValue(generator="system-uuid")  
	@GenericGenerator(name = "system-uuid",strategy="uuid")  
	@Column(name="ID",length=32)  
	private String id;
	
	/**
	 * 添加时间
	 */
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ADD_DATE", length = 7)	
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date addDate;
	
	/**
	 * 删除状态（0.未删除；1.已删除）
	 */
	@Column(name="DELETE_STATUS",columnDefinition="INT default 0")
	private Integer deleteStatus;

	/*-----------------------setter/getter------------------------*/
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

	public Integer getDeleteStatus() {
		return deleteStatus;
	}

	public void setDeleteStatus(Integer deleteStatus) {
		this.deleteStatus = deleteStatus;
	}
	
	
}
