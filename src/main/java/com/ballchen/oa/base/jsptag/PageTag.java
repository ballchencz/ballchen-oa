package com.ballchen.oa.base.jsptag;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class PageTag extends SimpleTagSupport {
	
	private Integer page;//第几页
	private Integer rows;//每页几行
	private String sort; //排序字段
	private String order;//排序方式asc/desc
	private Long total;//总共几条记录
	
	@Override
	public void doTag() throws JspException, IOException {
		long totalPage = this.getTotalPage(rows, total);//获得总页数
		JspWriter jspWriter = getJspContext().getOut();
		jspWriter.println("<div class=\"pagin\">");
		jspWriter.println("<div class=\"message\">");
		jspWriter.println("共<i class=\"blue\">"+total+"</i>条记录，当前显示第&nbsp;<i class=\"blue\">"+page+"&nbsp;</i>页");
		jspWriter.println("</div>");
		jspWriter.println("<ul class=\"paginList\">");
		jspWriter.println("<li class=\"paginItem\"><a href=\"javascript:;\"><span class=\"pagepre\"></span></a></li>");//分页开始
		if(totalPage <= 7){			
			for(long i=1;i<=totalPage;i++){
				if(i==page){					
					jspWriter.println("<li class=\"paginItem current\"><a href=\"javascript:;\">"+i+"</a></li>");
				}else{
					jspWriter.println("<li class=\"paginItem\"><a href=\"javascript:;\">"+i+"</a></li>");					
				}
			}
		}else{
			for(long i=1;i<=5;i++){
				if(i==page){
					jspWriter.println("<li class=\"paginItem current\"><a href=\"javascript:;\">"+i+"</a></li>");
				}else{
					jspWriter.println("<li class=\"paginItem\"><a href=\"javascript:;\">"+i+"</a></li>");					
				}
			}
			jspWriter.println("<li class=\"paginItem more\"><a href=\"javascript:;\">...</a></li>");
			if(totalPage==page){
				jspWriter.println("<li class=\"paginItem current\"><a href=\"javascript:;\">10</a></li>");
			}else{
				jspWriter.println("<li class=\"paginItem current\"><a href=\"javascript:;\">10</a></li>");				
			}
		}
		jspWriter.println("<li class=\"paginItem\"><a href=\"javascript:;\"><span class=\"pagenxt\"></span></a></li>");//分页
		jspWriter.println("</ul>");
		
		jspWriter.println("</div>");
	}
	
	/**
	 * 获得总页数
	 * @param rows 每页几条记录
	 * @param total 总共有几条记录
	 * @return Long 一共有几页
	 */
	private long getTotalPage(Integer rows,Long total){
		long totalPage = 0L;
		if(total%rows > 0){
			totalPage = (total/rows)+1;
		}else{
			totalPage = total/rows;
		}
		return totalPage;
	}

	/*-----------------------setter/getter-------------------------------------*/
	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
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
