package common.utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 全局配置操作
 * @author lxb
 * @date 2017/9/2 17:27:00
 */
public class Global {
	
	private static final String CHARSET = "UTF-8";

	/**
	 * 通过jdk的Properties获取配置文件内容<br/>
	 * 此种方式可以防止中文乱码
	 * @param key
	 * @return value
	 */
	public static String getConfigByProp(String key) {
		Properties prop = new Properties();
		InputStream in = Global.class.getClassLoader().getResourceAsStream ("Global.properties");
		try {
			prop.load(new InputStreamReader(in, CHARSET));
			String value = prop.get(key).toString().trim();
			return value;
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 通过ResourceBundle获取配置文件内容<br/>
	 * 注意：读取中文会出现乱码
	 * @param key
	 * @return value
	 */
	public static String getConfigByBundle(String key) {
		// 不需要.properties后缀
		ResourceBundle bundle = ResourceBundle.getBundle("Global");
		String value = bundle.getString(key);
		
		return StringUtil.validateStr(value);
	}
	
	public static void main(String[] args) {
		String key = "email.sender.name";
		String key2 = "email.nicheng";
		System.out.println(Global.getConfigByProp(key));
		System.out.println(Global.getConfigByBundle(key2));
	}
	
}
