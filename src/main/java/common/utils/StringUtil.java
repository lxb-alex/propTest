package common.utils;

/**
 * 
 * 字符串工具类<br/>
 * @author lxb
 * @date 2017-09-03 下午6:40:31
 */
public class StringUtil {
	
	private static final String BLANK=" ";
	private static final String EMPTY="";
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return 空：true；非空：false
	 */
	public static Boolean isBlankOrEmpty(String str) {
		if(str==BLANK || str == EMPTY || str == null) {
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * 判断字符串是否为空，空则返回null
	 * @param str
	 * @return 空：null；非空：str
	 */
	public static String validateStr(String str) {
		if(str == BLANK || str == EMPTY || str == null) {
			return null;
		}else {
			return str.trim();
		}
	}

}
