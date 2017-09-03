package common.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类<br/>
 * @author lxb
 * @date 2017-09-03 下午6:44:03
 */
public class DateUtil {
	private static final String FORMAT = "yyyy-MM-dd HH:mm:ss";
	/*
	Q：java.util.Date 与 java.sql.Date 关系
	A：继承关系：java.lang.Object ==> java.util.Date ==> java.sql.Date
	 sql.Date 转 util.Date
	 java.util.Date date = new java.util.Date(new java.sql.Date());
	 java.util.Date date = new java.util.Date(new java.sql.Date().getTime());
	 
	 Q：util.Date 和 sql.Date 使用场景
	 A： sql.Date 一般是与数据库交互有关，即通常实体类中为sql.Date
	    util.Date 为通常情况下使用，如格式转换等。
	*/
	
	/**
	 * 将 TimeStamp 格式时间转换为 Date 时间格式<br/>
	 * @param longDate 一串纯数字格式的时间
	 * @return
	 */
	public static Date timeStampToDate(long longDate){
		Timestamp ts = new Timestamp(longDate);
		Date date = ts;
		return date;
	}
	
	/**
	 * @param date 格式为Thu Dec 17 00:00:00 CST 2015的时间（TimeStamp）
	 * @return 正常时间格式（date）
	 */
	public static Date timeStampToDate(Date date){
		long longDate = date.getTime();
		Timestamp ts = new Timestamp(longDate);
		Date d = ts;
		return d;
	}
	
	/**
	 * @param timestr {nanos=0, time=1452873600000, minutes=0, seconds=0, hours=0, month=0, year=116, timezoneOffset=-480, day=6, date=16}
	 * @return YYYY-MM-dd 格式的时间字符串
	 */
	public static String strTostr(String timestr){
		timestr = timestr.substring(timestr.indexOf("e=")+2, timestr.indexOf(", minutes"));
		long longDate = Long.valueOf(timestr);
		Date date = timeStampToDate(longDate);
		String dateStr = dateToString(date, "YYYY-MM-dd");
		return dateStr;
	}
	
	/**
	 * 
	 * 将时间转换为字符串输出<br/>
	 * @param date 要转换的时间
	 * @param format 转换格式。默认 yyyy-MM-dd HH:mm:ss
	 * @return
	 */
	public static String dateToString(Date date, String format) {
		DateFormat df = new SimpleDateFormat(FORMAT);
		if(!StringUtil.isBlankOrEmpty(format)) {
			df = new SimpleDateFormat(format);
		}
		return df.format(date);
	}
	
	/**
	 * 
	 * 将字符串类型时间转换为时间类型<br/>
	 * @param dateStr 字符串类型时间
	 * @param format 转换格式，依据DateStr的格式
	 * @return
	 */
	public static Date strToDate(String dateStr, String format) {
		DateFormat df = new SimpleDateFormat(FORMAT);
		if(!StringUtil.isBlankOrEmpty(format)) {
			df = new SimpleDateFormat(format);
		}
		try {
			return df.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
