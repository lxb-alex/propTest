package common.vo;

/**
 * 服务器返回消息类<br/>
 * @author lxb
 * @date 2017-09-03 下午7:23:58
 */
public class MessageVo {
	/** 结果代码 */
	private String code;
	/** 是否成功 */
	private String flag;
	/** 结果消息 */
	private String msg;
	/** 返回内容 */
	private String result;
	
	public MessageVo() {
		super();
	}

	/**
	 * @param code
	 * @param flag
	 * @param msg
	 * @param result
	 */
	public MessageVo(String code, String flag, String msg, String result) {
		super();
		this.code = code;
		this.flag = flag;
		this.msg = msg;
		this.result = result;
	}

	/**
	 * @param flag
	 * @param msg
	 */
	public MessageVo(String flag, String msg) {
		super();
		this.flag = flag;
		this.msg = msg;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}

	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}

	
	
}
