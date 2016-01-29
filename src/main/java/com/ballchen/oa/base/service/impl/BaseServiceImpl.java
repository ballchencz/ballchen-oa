package com.ballchen.oa.base.service.impl;

import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ballchen.oa.base.consts.BaseConsts;
import com.ballchen.oa.base.model.PageHelper;
import com.ballchen.oa.base.service.IBaseService;
@Service
public class BaseServiceImpl implements IBaseService {

	@Override
	public Map<String, Object> getNoramlReturnJSONMap(boolean flag,String handler) {
		Map<String,Object> normalReturnJSONMap = new HashMap<String,Object>();
		normalReturnJSONMap.put("flag", flag);
		normalReturnJSONMap.put("info", BaseConsts.HANDLER_FLAG_INFO_MAP.get(handler));
		return normalReturnJSONMap;
	}
    @Override
    public String orderHQL(PageHelper pageHelper) {
        String orderString = "";
        if (pageHelper.getSort() != null && pageHelper.getOrder() != null) {
            orderString = " order by t." + pageHelper.getSort() + " " + pageHelper.getOrder();
        }

        return orderString;
    }

    @Override
    public  String whereHQL(Object obj, Map<String, Object> queryParams) {
        String hql = null;
        Field [] fields = obj.getClass().getDeclaredFields();
        if(fields!=null && fields.length>0){
            hql = " WHERE 1=1";
            for(Field field : fields){
                field.setAccessible(true);
	                /*获得字段名称*/
                String fieldName = field.getName();
                try {
                    Object valueObj = field.get(obj);
                    if(field.getType().toString().endsWith("String")){
                        if(valueObj!=null && !valueObj.equals("")){
                            hql += " AND t."+fieldName+" like :"+fieldName;
                            queryParams.put(fieldName,"%"+valueObj+"%");
                        }
                    }else if(field.getType().toString().endsWith("Date")){
                        if(valueObj!=null){
                            Date date = (Date)valueObj;
                            String queryDate;
                            Calendar calendar = Calendar.getInstance();
                            calendar.setTime(date);
                            int hours = calendar.get(Calendar.HOUR_OF_DAY);
                            int minutes = calendar.get(Calendar.MINUTE);
                            int seconds = calendar.get(Calendar.SECOND);
                            if(hours==0 && minutes==0 && seconds==0){
                                SimpleDateFormat sdf = new SimpleDateFormat(BaseConsts.dateStringFormat);
                                queryDate = sdf.format(date);
                            }else{
                                SimpleDateFormat sdf = new SimpleDateFormat(BaseConsts.dateTimeStringFormat);
                                queryDate = sdf.format(date);
                            }
                            hql += " AND t."+fieldName+" like '%"+queryDate+"%'";
                            //queryParams.put(fieldName,"%"+queryDate+"%");
                        }
                    }else{
                        if(valueObj!=null){
                            hql += " AND t."+fieldName+" = :"+fieldName;
                            queryParams.put(fieldName,valueObj);
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return hql;
    }
}
