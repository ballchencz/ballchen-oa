package com.ballchen.oa.base.model;

public class PageHelper {
	private int page = 1;// 当前页
	private int rows = 15;// 每页显示记录数
	private String sort;// 排序字段
	private String order;// asc/desc
	private Long total;//总记录数
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	
	}


}
