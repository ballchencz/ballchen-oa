package com.ballchen.oa.base.common;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import com.alibaba.druid.util.Base64;
import com.ballchen.oa.base.consts.BaseConsts;

/**
 * 公共静态方法
 * @author ChenZhao
 *
 */
public class CommonUtils {
	/**
	 * 对密码进行加密
	 * @param pwd 要加密的密码
	 * @return 加密后的密码
	 */
	public static String encryption(String pwd){
		
		try {
			MessageDigest md5 =  MessageDigest.getInstance(BaseConsts.ENCRYPTION);
			md5.update(pwd.getBytes());
			return Base64.byteArrayToBase64(md5.digest());
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return pwd;
		}
		
	}
}
