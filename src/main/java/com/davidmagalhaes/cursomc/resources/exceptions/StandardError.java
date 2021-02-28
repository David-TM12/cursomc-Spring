package com.davidmagalhaes.cursomc.resources.exceptions;

import java.io.Serializable;

public class StandardError implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long stimeStamp;
	
	public StandardError(Integer status, String msg, Long stimeStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.stimeStamp = stimeStamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Long getStimeStamp() {
		return stimeStamp;
	}
	public void setStimeStamp(Long stimeStamp) {
		this.stimeStamp = stimeStamp;
	}
	
}
