package com.ballchen.oa.base.service;

import java.util.Map;

import com.ballchen.oa.base.model.PageHelper;

public interface IBaseService {
	
	/**
	 * 向前台输出返回参数
	 * @param flag 标示
	 * @param handler 参数
	 * @return Map<String,Object>
	 */
	public Map<String,Object> getNoramlReturnJSONMap(boolean flag,String handler);
    /**
     * 组装sql排序语句
     * @param pageHelper 分页对象
     * @return String
     */
    public String orderHQL(PageHelper pageHelper);

    /**
     * 条件查询语句
     * @param obj 需要查询的类
     * @param queryParams 查询参数Map集合
     * @return String
     */
    public String whereHQL(Object obj,Map<String,Object> queryParams);
	
}
