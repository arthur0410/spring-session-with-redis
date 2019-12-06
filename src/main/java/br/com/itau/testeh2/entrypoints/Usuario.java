package br.com.itau.testeh2.entrypoints;

import java.io.Serializable;

public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5274066087867923451L;
	
	private String userName;
	private String funcional;
	private String token;
	private String refreshToken;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFuncional() {
		return funcional;
	}
	public void setFuncional(String funcional) {
		this.funcional = funcional;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	
	
}
