package common.utils;

/**
 * 
 * IP地址获取工具类<br/>
 * @author lxb
 * @date 2017-09-03 下午6:40:03
 */
public class IpAddr {

	/**
	 * 获取真实IP地址<br/>
	 * @param request
	 * @return
	 */
//	public String getIpAddr(HttpServletRequest request) {
//	       String ip = request.getHeader("x-forwarded-for");  
//	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
//	           ip = request.getHeader("Proxy-Client-IP");  
//	       }  
//	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
//	           ip = request.getHeader("WL-Proxy-Client-IP");  
//	       }  
//	       if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {  
//	           ip = request.getRemoteAddr();  
//	       }  
//	       return ip;  
//	   } 
}
