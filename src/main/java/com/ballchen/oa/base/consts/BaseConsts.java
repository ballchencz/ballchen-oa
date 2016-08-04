package com.ballchen.oa.base.consts;

import java.util.HashMap;
import java.util.Map;

public class BaseConsts {

	/**
	 * 民族数组
	 */
	public static final String [] nationName = {"汉族", "壮族", "满族","回族","苗族","维吾尔族","土家族",  
	                                            "彝族 ", "蒙古族", "藏族", "布依族", "侗族", "瑶族", "朝鲜族",  
	                                            "白族", "哈尼族", "哈萨克族", "黎族", "傣族", "畲族", "傈僳族",  
	                                            "仡佬族","东乡族","高山族","拉祜族","水族", "佤族 ", "纳西族",  
	                                            "羌族","土族","仫佬族","锡伯族","柯尔克孜族","达斡尔族","景颇族", 
	                                            "毛南族", "撒拉族","布朗族", "塔吉克族","阿昌族","普米族","鄂温克族",  
	                                            "怒族" ,"京族","基诺族","德昂族","保安族","俄罗斯族","裕固族",  
	                                            "乌兹别克族","门巴族", "鄂伦春族", "独龙族", "塔塔尔族", "赫哲族","珞巴族"};
	public static final Map<String,String> HANDLER_FLAG_INFO_MAP = new HashMap<String,String>();
	static{
		HANDLER_FLAG_INFO_MAP.put("INSERTTRUE", "添加成功");
		HANDLER_FLAG_INFO_MAP.put("INSERTFALSE", "添加失败");
		HANDLER_FLAG_INFO_MAP.put("UPDATETRUE", "修改成功");
		HANDLER_FLAG_INFO_MAP.put("UPDATEFALSE", "修改失败");
		HANDLER_FLAG_INFO_MAP.put("REMOVETRUE", "删除成功");
		HANDLER_FLAG_INFO_MAP.put("REMOVEFALSE", "删除失败");
	}
	
	/**
	 * 年月日时间格式
	 */
	public final static String dateStringFormat = "yyyy-MM-dd";
	
	/**
	 * 年月日时分秒时间格式
	 */
	public final static String dateTimeStringFormat = "yyyy-MM-dd HH:mm:ss";
	
	/**
	 * Date对象toString时间格式
	 */
	public static final String SIMPLEDATEFORMAT_FORMAT_STRING_TWO = "EEE MMM dd HH:mm:ss zzz yyyy";
	
	/**
	 * 数据库表基本名称
	 */
	public static final String BASE_TABLE_NAME = "BALLCHEN_T_";
	
	/**
	 * 加密算法
	 */
	public static final String ENCRYPTION = "MD5";
	
	/**
	 * 获得民族Map集合
	 * @return Map<Integer,String>
	 */
	public static final Map<Integer,String> getAllNationData(){
		Map<Integer,String> nations = new HashMap<Integer,String>();
		for(int i=0;i<nationName.length;i++){
			nations.put(i, nationName[i]);
		}
		return nations;
	}
	
	
}
